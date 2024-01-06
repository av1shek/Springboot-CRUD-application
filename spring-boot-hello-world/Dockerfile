FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/spring-boot-2-hello-world-1.0.2-SNAPSHOT.jar hello-world.jar
ENTRYPOINT ["java", "-jar", "hello-world.jar"]