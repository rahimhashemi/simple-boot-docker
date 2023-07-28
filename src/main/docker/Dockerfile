FROM khipu/openjdk17-alpine:latest
ARG JAR_FILE=spring-boot-rest-api-1.1.0.jar
EXPOSE 8080
#COPY target/spring-boot-rest-api-1.1.0.jar spring-boot-rest.jar
VOLUME /tmp
ADD maven/${JAR_FILE} spring-boot-rest.jar
RUN sh -c 'touch /spring-boot-rest.jar'
ENTRYPOINT ["java","-jar","/spring-boot-rest.jar"]