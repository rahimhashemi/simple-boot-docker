FROM khipu/openjdk17-alpine:latest
#MAINTAINER springBootDocker
#LABEL authors="simpath"
#ARG JAR_FILE=target/spring-boot-rest-api-1.0.0.jar
COPY target/spring-boot-rest-api-1.0.0.jar spring-boot-rest.jar
#EXPOSE 8080
ENTRYPOINT ["java","-jar","/spring-boot-rest.jar"]