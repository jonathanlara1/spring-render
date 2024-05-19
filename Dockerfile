FROM maven:3.8.5-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:17-slim
EXPOSE 4040
COPY target/demo-1.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]