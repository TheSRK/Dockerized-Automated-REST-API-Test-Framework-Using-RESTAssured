FROM gradle:7.5-jdk8
WORKDIR /Rest-Assured-Project
COPY src /Rest-Assured-Project/src
COPY build.gradle /Rest-Assured-Project/build.gradle
COPY testng.xml /Rest-Assured-Project/testng.xml
ENTRYPOINT gradle clean test