FROM openjdk:17-jdk-slim-buster
VOLUME /tmp
EXPOSE 8081
ADD ./build/libs/dbz-msa-characters-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT [ "java" , "-jar", "/app.jar"]