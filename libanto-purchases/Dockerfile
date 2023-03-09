#Start with a base image containing Java runtime
FROM openjdk:11-jdk-slim as build

#Information around who maintains the image
MAINTAINER libanto.net

# Add the application's jar to the container
COPY target/libanto-purchases-0.0.1-SNAPSHOT.jar libanto-purchases-0.0.1-SNAPSHOT.jar

#execute the application
ENTRYPOINT ["java","-jar","/libanto-purchases-0.0.1-SNAPSHOT.jar","-web -webAllowOthers -tcp -tcpAllowOthers -browser"]