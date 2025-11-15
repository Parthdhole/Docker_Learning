# Use official OpenJDK 17 slim image
FROM eclipse-temurin:17-jdk
# Set working directory
WORKDIR /app

# Copy jar into container
COPY target/studentSe-0.0.1-SNAPSHOT.jar app.jar

# Expose port 8080
EXPOSE 8080

# Set Spring profile to docker
ENV SPRING_PROFILES_ACTIVE=docker

# Run the jar
ENTRYPOINT ["java","-jar","app.jar"]
