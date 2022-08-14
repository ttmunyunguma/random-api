FROM amazoncorretto:17-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} random-api.jar
ENTRYPOINT ["java","-jar","/random-api.jar"]
EXPOSE 8081
