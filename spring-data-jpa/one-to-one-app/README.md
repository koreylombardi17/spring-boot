Java Application built with Spring Boot using Spring Data JPA. This application is an example demonstrating how one to one relationships are implemented using Spring Data JPA. To run this application, you'll need Java 11 installed, a MySQL database, and an IDE that implements a Maven build. In this example, there is a Customer class and a CustomerInfo class. The database is populated with new Customer objects that contain CustomerInfo objects. CrudRepositories are used for accessing the data.

Once the application is setup in the IDE:

1. Navigate to /src/main/resources/application.properties.
2. Change spring.datasource.url to your MySQL database connection url.
3. Change spring.datasource.username to your MySQL database connection username.
4. Change spring.datasource.password to your MySQL database connection password.
5. Run the Maven build. 
8. See results.
