
FROM openjdk:8
ADD target/SpeCalculator-0.0.1-SNAPSHOT.jar SpeCalculator-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/SpeCalculator-0.0.1-SNAPSHOT.jar"]