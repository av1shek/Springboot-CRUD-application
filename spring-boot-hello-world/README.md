# Spring Boot CRUD Application

**A simple Spring Boot 2.x app to perform CRUD operations**

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
  <br/>```curl --request GET 'http://localhost:64724/hello/<name>'```
  
- Curl for storing a book details in database
  <br/>```curl --location 'http://localhost:64724/bookservice/books' \
--header 'Content-Type: application/json' \
--data '  {
    "name": "C++",
    "author": "Abhishek",
    "publication": "Rajput Publication",
    "category": "Computer Programming",
    "pages": 1500,
    "price": 240
  }
'```

- Curl for getting all the stored book details
<br/>```curl --location 'http://localhost:64724/bookservice/books'```


Next branch to be followed: `persistence-database`