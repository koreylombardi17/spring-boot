Java Application built with Spring Boot using Spring Data JPA. This application is an example demonstrating how many to many relationships are implemented using Spring Data JPA. To run this application, you'll need Java 11 installed, a MySQL database, and an IDE that implements a Maven build. In this example, there is a Pizza class and a Topping class. First, the database is populated with new Topping objects. Then, Pizza objects are created, Topping objects are retrieved and added to the Pizza objects. Then the Pizza objects are stored in the database. There is a join table created to maintain which pizzas have which toppings. CrudRepositories are used for accessing the data.

Once the application is setup in the IDE:

1. Navigate to /src/main/resources/application.properties.
2. Change spring.datasource.url to your MySQL database connection url.
3. Change spring.datasource.username to your MySQL database connection username.
4. Change spring.datasource.password to your MySQL database connection password.
5. Navigate to /src/test/java/com/lombardi/manytomanyexampleapp/ManyToManyExampleAppTest.java.
6. Run addToppings() test.
7. Run addPizzas() test. 
8. See results.
