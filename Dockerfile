FROM openjdk:8

EXPOSE  8080

ADD target/myhomeproject.jar myhomeproject.jar

ENTRYPOINT ["java","-jar","myhomeproject.jar"]  

