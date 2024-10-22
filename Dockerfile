FROM openjdk:17-jdk-alpine
MAINTAINER Ignat Malouhov
COPY build/libs/docker-0.0.1-SNAPSHOT.jar docker-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/docker-0.0.1-SNAPSHOT.jar"]