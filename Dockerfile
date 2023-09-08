FROM openjdk:20-bullseye
WORKDIR /opt
ENV PORT 8082
EXPOSE 8082
COPY target/*.jar /opt/docker-test.jar
ENTRYPOINT exec java $JAVA_OPTS -jar docker-test.jar