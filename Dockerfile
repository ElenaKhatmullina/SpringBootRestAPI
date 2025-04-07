# creates a layer from the openjdk:17-alpine Docker image.
FROM openjdk:21-jdk

MAINTAINER boottechnologies.ci@gmail.com

# cd /app
WORKDIR /app

# Refer to Maven build -> finalName
ARG WAR_FILE=target/demo-*.war

# cp target/demo-0.0.1-SNAPSHOT.jar /app/demo.jar
COPY ${WAR_FILE} demo.war

# java -jar /app/demo.war
CMD ["java", "-war", "-Xmx1024M", "/app/demo.war"]

# Make port 8090 available to the world outside this container
EXPOSE 8090