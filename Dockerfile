FROM openjdk:17
COPY /target/CommunityManagementService-0.0.1-SNAPSHOT.jar community-mgmt-svc.jar
CMD ["sh", "-c", "java -jar /community-mgmt-svc.jar"]