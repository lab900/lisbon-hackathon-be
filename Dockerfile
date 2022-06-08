# Use an official OpenJDK runtime as a parent image
FROM amazoncorretto:18.0.1
# Set the working directory to /app
ARG CACHEBUST=1
WORKDIR /app
COPY . /app

RUN ./mvnw package
# Copy the fat jar into the container at /app
COPY /target/intrct-0.0.1-SNAPSHOT.jar /intrct.jar
# Make port 8080 available to the world outside this container
EXPOSE 8080
# Run jar file when the container launches
CMD ["java", "-jar", "intrct.jar"]