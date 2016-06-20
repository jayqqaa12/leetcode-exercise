FROM tomcat:8-jre8
RUN rm -rf /usr/local/tomcat/webapps
ADD ./target/ROOT.war /usr/local/tomcat/webapps/ROOT.war
