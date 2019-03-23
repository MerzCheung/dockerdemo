FROM java:8
VOLUME /tmp
ADD dockerdemo.jar app.jar
EXPOSE 8082
ENTRYPOINT [ "java", "-jar", "/app.jar" ]