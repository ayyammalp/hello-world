# Alpine Linux with OpenJDK JRE
FROM openjdk:8-jre-alpine

# Copy war file
COPY demo-0.0.1-SNAPSHOT.jar /todo.war

# run the app
CMD ["/usr/bin/java", "-jar", "/todo.war"]
