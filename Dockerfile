FROM openjdk:8
EXPOSE 8011
ADD target/demoapp.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]