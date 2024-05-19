FROM openjdk:21-alpine-jdk
EXPOSE 4040
COPY target/demo-1.jar app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]