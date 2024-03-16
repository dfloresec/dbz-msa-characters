FROM openjdk:17-jdk-alpine
ADD build/libs/dbz-msa-characters-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar", "app.jar"]