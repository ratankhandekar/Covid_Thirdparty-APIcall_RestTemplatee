FROM openjdk:8

COPY target/CovidApp.jar  /usr/app/

WORKDIR /usr/app/

ENTRYPOINT ["java", "-jar", "CovidApp.jar"]