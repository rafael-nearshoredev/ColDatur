FROM openjdk:8-alpine

COPY target/uberjar/datur.jar /datur/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/datur/app.jar"]
