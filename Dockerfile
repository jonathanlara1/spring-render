FROM ubuntu:latest
LABEL authors="Nim"
RUN apt-get update
RUN apt-get install openjdk-17-jdk -y


FROM openjdk:17-slim
EXPOSE 4040
COPY target/demo-1.jar app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]