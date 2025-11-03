#FROM ubuntu:latest
FROM openjdk:17
WORKDIR /apps

ENV TZ="asia/kolkata"

RUN date

COPY target/registration-service-0.0.1-SNAPSHOT.jar  .
#RUN mvn --version
CMD ["java","-jar", "registration-service-0.0.1-SNAPSHOT.jar"]

EXPOSE 8080









