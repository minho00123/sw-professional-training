FROM openjdk:17-jdk-alpine
VOLUME /tmp
ARG JAVA_OPTS
ENV JAVA_OPTS=$JAVA_OPTS
COPY target/control_dept-0.0.1-SNAPSHOT.jar controldept.jar
EXPOSE 7001
ENTRYPOINT exec java $JAVA_OPTS -jar controldept.jar
# For Spring-Boot project, use the entrypoint below to reduce Tomcat startup time.
#ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar controldept.jar
