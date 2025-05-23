# DO NOT EDIT - See: https://jetty.org/docs/9/startup-modules.html

[description]
Configure jetty logging to use slf4j.
Any slf4j-impl implementation is used

[tags]
logging

[depends]
slf4j-api
slf4j-impl

[provides]
logging

[exec]
-Dorg.eclipse.jetty.util.log.class?=org.eclipse.jetty.util.log.Slf4jLog
