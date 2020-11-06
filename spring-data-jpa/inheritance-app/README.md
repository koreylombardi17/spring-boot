Java Application built with Spring Boot using Spring Data JPA. This application is an example demonstrating how inheritance is implemented using Spring Data JPA. To run this application, you'll need Java 11 installed, a MySQL database, and an IDE that implements a Maven build. In this example, there is a Boxer class and a Wrestler class that inherits from the Fighter super class. CrudRepositories are used for accessing the MySQL database.

Once the application is setup in the IDE: 
1. Navigate to /src/main/resources/application.properties.
2. Change spring.datasource.url to your MySQL database connection url.
3. Change spring.datasource.username to your MySQL database connection username.
4. Change spring.datasource.password to your MySQL database connection password.
5. Navigate to /src/test/java/com/lombardi/inheritance/FighterRepositoryTest.java.
6. Run FighterRepositoryTest.java.
