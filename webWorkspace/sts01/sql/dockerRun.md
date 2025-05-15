## mysql docker container 

### create container
```
docker run -it -d ^
--network net01 ^
--name mysql8 ^
-p 33306:3306 ^
-v D:\webWorkspace\data:/var/lib/mysql ^
-v D:\webWorkspace\sts01\sql:/sql ^
-e MYSQL_ROOT_PASSWORD=mysql ^
-e MYSQL_DATABASE=xe ^
-e MYSQL_USER=scott ^
-e MYSQL_PASSWORD=tiger ^
mysql:lts
```

### Restoring data (window �ȵ�)
```
docker exec -i mysql8 ^
sh -c 'exec mysql -u scott -ptiger' < D:\webWorkspace\web24\sql\dept.sql
```

### Restoring data (window)
```
docker exec -it mysql8 bash
bash-5.1# mysql -u scott -ptiger < /sql/dept.sql
```

### destroy 1
```
docker run -it -d --name step01 -p 8080:8080 --network net01 -v D:\webWorkspace\sts01\target:/usr/local/tomcat/webapps tomcat:9.0
```

### destroy 2
```
docker run -it -d --name step02 -p 8080:8080 --network net01 -v D:\webWorkspace\sts01:/sts01 tomcat:9.0

docker exec -it step02 bash
	
	apt update
	wget https://dlcdn.apache.org/maven/maven-3/3.9.9/binaries/apache-maven-3.9.9-bin.tar.gz
	tar -zvxf apache-maven-3.9.9-bin.tar.gz
	mv apache-maven-3.9.9 ~/maven
	echo export PATH=$PATH:~/maven/bin >> ~/.profile
	source ~/.profile
	mvn -v
	apt install git -y
	git -v
	git clone ���� �ּ�
	cd �ҽ��ڵ� ��ġ
	mvn clean package
	mv /sts01/target/sts01-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/ROOT.war
```

### destroy 3

```
docker run -it -p 8080:8080 --name step03 ubuntu:22.04 bash

	apt update
	# jdk install
	apt search jdk
	apt install openjdk-8-jdk-headless -y
	echo export JAVA_HOME= >> ~/.profile

	# maven install
	apt install wget -y
	wget https://dlcdn.apache.org/maven/maven-3/3.9.9/binaries/apache-maven-3.9.9-bin.tar.gz
	tar -zvxf apache-maven-3.9.9-bin.tar.gz
	mv apache-maven-3.9.9 ~/maven
	echo export PATH=$PATH:~/maven/bin >> ~/.profile
	source ~/.profile
	mvn -v
	
	# tomcat install
	wget https://dlcdn.apache.org/tomcat/tomcat-9/v9.0.105/bin/apache-tomcat-9.0.105.tar.gz
	tar -zvxf apache-tomcat-9.0.105.tar.gz
	mv apache-tomcat-9.0.105 tomcat9
	sh tomcat9/bin/startup.sh
	
	## github
	apt install git -y
	git clone ���� �ּ�
	mvn clean package
	mv /root/sts01/target/sts01-0.0.1-SNAPSHOT.war ~/tomcat9/webapps/ROOT.war
	
```

### destroy 4
```
docker run -it -p 8080:8080 --network net01 maven:3.9.9-amazoncorretto-8-alpine sh

	# tomcat install
	wget https://dlcdn.apache.org/tomcat/tomcat-9/v9.0.105/bin/apache-tomcat-9.0.105.tar.gz
	tar -zvxf apache-tomcat-9.0.105.tar.gz
	mv apache-tomcat-9.0.105 tomcat9
	sh tomcat9/bin/startup.sh
	
	apk update
	apk add git
	git clone ���� �ּ�
	mvn clean package
	mv /root/sts01/target/sts01-0.0.1-SNAPSHOT.war ~/tomcat9/webapps/ROOT.war
```



