FROM maven:3.8.4-openjdk-17 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:17-slim
WORKDIR /app


COPY --from=build /app/target/demo-1.jar app.jar
EXPOSE 4040
ENTRYPOINT ["java", "-jar", "/app.jar"]