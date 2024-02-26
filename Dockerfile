FROM openjdk:17-jdk-slim
WORKDIR /app
COPY ./target/hs-config-0.0.1-SNAPSHOT.jar hs-config.jar
ENTRYPOINT ["java","-jar","/app/hs-config.jar"]