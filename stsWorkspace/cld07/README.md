
## img
mysql:8-debian

### master
```
cat <<EOF >> /etc/mysql/my.cnf 
log-bin=mysql-bin  
server-id=1
EOF

mysql -u root -pmysql

SHOW MASTER STATUS\G
File: mysql-bin.000001
         Position: 157
...

CREATE USER 'logger'@'%' IDENTIFIED BY '1234';
ALTER USER 'logger'@'%' IDENTIFIED WITH mysql_native_password BY '1234';
GRANT REPLICATION SLAVE ON *.* TO 'logger'@'%';
FLUSH PRIVILEGES;
reboot
```

### slave
```
cat <<EOF >> /etc/mysql/my.cnf 
[mysqld]
server-id=2
EOF
reboot

mysql -u root -pmysql
CHANGE MASTER TO MASTER_HOST='master', MASTER_USER='logger', MASTER_PASSWORD='1234', MASTER_LOG_FILE='mysql-bin.000001', MASTER_LOG_POS=157;
START SLAVE;
SHOW SLAVE STATUS\G
```