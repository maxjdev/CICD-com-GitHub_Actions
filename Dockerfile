FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY target/ghActions-1.0.0.jar ghActions-1.0.0.jar
EXPOSE 8080
CMD ["java", "-jar", "ghActions-1.0.0.jar"]