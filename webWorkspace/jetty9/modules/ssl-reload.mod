# DO NOT EDIT - See: https://jetty.org/docs/9/startup-modules.html

[description]
Enables the SSL keystore to be reloaded after any changes are detected on the file system.

[tags]
connector
ssl

[depend]
ssl

[xml]
etc/jetty-ssl-context-reload.xml

[ini-template]
# Monitored directory scan period (seconds)
# jetty.sslContext.reload.scanInterval=1