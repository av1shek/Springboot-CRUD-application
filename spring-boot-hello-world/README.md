# Spring Boot CRUD Application

**A simple Spring Boot 2.x app to perform CRUD operations**
<br/>Will start from simple hello world application in `main` branch and proceed further to develop a CRUD application in other branch.

Please check out <a href="https://av1shek.notion.site/av1shek/Deploying-an-Application-with-Kubernetes-1bc1f9a48ea749b89cbd8abbfb294793">this blog</a> post for complete details.

## How to Run Application

**Start the application using any of the commands mentioned below**

> **Note:** First two commands need to run inside the root folder of this project i.e inside the **spring-boot-hello-world** folder


- **Using maven** <br/>``` mvn spring-boot:run```


- **From jar file**
  Create a jar file using '**mvn clean install**' command and then execute
  <br/>```java -jar target/spring-boot-2-hello-world-1.0.2-SNAPSHOT.jar```


- **Directly from IDE**
  <br/>```Right click on HelloWorldApplication.java and click on 'Run' option```
  <br/><br/>



**Curl for different endpoints**

Note: Update the port number.
- Curl for getting hello world response.
  <br/>```curl --request GET 'http://localhost:64724/hello'```
  

Next branch to be followed: `connecting-database`