#IMAGE: Get the base image for Liberty
FROM websphere-liberty:19.0.0.9-kernel


#BINARIES: Add in all necessary application binaries
COPY wlp/config/server.xml /config/server.xml

# Generate Liberty config based on server.xml
RUN configure.sh

ADD target/hw-web.war /opt/ibm/wlp/usr/servers/defaultServer/apps
