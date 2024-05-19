FROM ubuntu:latest
LABEL authors="Nim"
RUN apt-get update
RUN apt-get install openjdk-17-jdk -y
COPY . .
RUN mvn package -DskipTests

FROM openjdk:17-jdk-slim
EXPOSE 4040
COPY --from=build /build/libs/demo-1.jar app.jar