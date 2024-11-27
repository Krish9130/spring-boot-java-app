FROM openjdk:8-jre-alpine

WORKDIR /app

#copy the jar file into the container at /app
COPY /target/java-apps.jar /app

EXPOSE 8080

CMD ["java", "-jar", "java-apps.jar"]
