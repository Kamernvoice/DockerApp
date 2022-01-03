FROM openjdk:11
ADD target/docker-app.jar docker-app.jar
ENTRYPOINT ["java", "-jar","docker-app.jar"]
EXPOSE 8080