FROM alpine:latest
ADD target/helloworld-jenkins-0.0.1-SNAPSHOT.jar HelloWorld.jar
RUN apk --update add openjdk8-jre
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "HelloWorld.jar"]