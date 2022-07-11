FROM openjdk:11
ARG JAR_FILE=target/hello-boot.jar
COPY ${JAR_FILE} hello-boot.jar
EXPOSE 8880
ENTRYPOINT ["java","-jar","/hello-boot.jar"]