# DO NOT EDIT - See: https://jetty.org/docs/9/startup-modules.html

[description]
Puts a collection of jetty utility servlets and filters
on the server classpath (CGI, CrossOriginFilter, DosFilter,
MultiPartFilter, PushCacheFilter, QoSFilter, etc.) for
use by all webapplications.

[depend]
servlet

[lib]
lib/jetty-servlets-${jetty.version}.jar

