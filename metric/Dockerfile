FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/metric-0.0.1.jar
COPY ${JAR_FILE} api_metric.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "api_metric.jar"]