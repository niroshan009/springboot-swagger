FROM java:8
EXPOSE 8080:8080
ADD /target/swagger-demo.jar swagger-demo.jar
ENTRYPOINT ["java","-jar","swagger-demo.jar"]