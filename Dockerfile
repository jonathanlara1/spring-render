FROM ubuntu:latest
LABEL authors="Nim"
RUN apt-get update
RUN apt-get install openjdk-17-jdk -y
COPY . .
RUN mvn package -DskipTests