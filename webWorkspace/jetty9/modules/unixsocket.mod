# DO NOT EDIT - See: https://jetty.org/docs/9/startup-modules.html

[description]
Enables a Unix Domain Socket Connector that can receive
requests from a local proxy and/or SSL offloader (eg haproxy) in either
HTTP or TCP mode.  Unix Domain Sockets are more efficient than 
localhost TCP/IP connections  as they reduce data copies, avoid 
needless fragmentation and have better dispatch behaviours. 
When enabled with corresponding support modules, the connector can 
accept HTTP, HTTPS or HTTP2C traffic.

[tags]
connector

[depend]
server

[xml]
etc/jetty-unixsocket.xml

[lib]
lib/jetty-unixsocket-${jetty.version}.jar
lib/jnr/*.jar


[files]
maven://com.github.jnr/jffi/1.3.13|lib/jnr/jffi-1.3.13.jar
maven://com.github.jnr/jffi/1.3.13/jar/native|lib/jnr/jffi-1.3.13-native.jar
maven://com.github.jnr/jnr-constants/0.10.4|lib/jnr/jnr-constants-0.10.4.jar
maven://com.github.jnr/jnr-enxio/0.32.18|lib/jnr/jnr-enxio-0.32.18.jar
maven://com.github.jnr/jnr-ffi/2.2.17|lib/jnr/jnr-ffi-2.2.17.jar
maven://com.github.jnr/jnr-posix/3.1.20|lib/jnr/jnr-posix-3.1.20.jar
maven://com.github.jnr/jnr-unixsocket/0.38.23|lib/jnr/jnr-unixsocket-0.38.23.jar
maven://com.github.jnr/jnr-x86asm/1.0.2|lib/jnr/jnr-x86asm-1.0.2.jar
maven://org.ow2.asm/asm-analysis/9.7.1|lib/jnr/asm-analysis-9.7.1.jar
maven://org.ow2.asm/asm-commons/9.7.1|lib/jnr/asm-commons-9.7.1.jar
maven://org.ow2.asm/asm-tree/9.7.1|lib/jnr/asm-tree-9.7.1.jar
maven://org.ow2.asm/asm-util/9.7.1|lib/jnr/asm-util-9.7.1.jar
maven://org.ow2.asm/asm/9.7.1|lib/jnr/asm-9.7.1.jar

[license]
Jetty UnixSockets is implemented using the Java Native Runtime, which is an
open source project hosted on Github and released under the Apache 2.0 license.
https://github.com/jnr/jnr-unixsocket
http://www.apache.org/licenses/LICENSE-2.0.html

[ini-template]
### Unix SocketHTTP Connector Configuration

## Unix socket path to bind to
# jetty.unixsocket.path=/tmp/jetty.sock

## Connector idle timeout in milliseconds
# jetty.unixsocket.idleTimeout=30000

## Number of selectors (-1 picks default)
# jetty.unixsocket.selectors=-1

## ServerSocketChannel backlog (0 picks platform default)
# jetty.unixsocket.acceptQueueSize=0
