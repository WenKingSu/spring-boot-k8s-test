FROM openjdk:16.0.2-jdk-oracle
ARG JAR_FILE=build/libs/\*.jar
COPY ${JAR_FILE} app.jar
RUN cp /usr/share/zoneinfo/Asia/Taipei /etc/localtime && echo 'Asia/Taipei' >/etc/timezone
ENTRYPOINT ["java","-jar","/app.jar"]