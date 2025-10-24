FROM openjdk:26-ea-17-jdk-oracle
VOLUME /tmp
EXPOSE 8080
ADD ./target/lab07_20222297-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar","app.jar"]