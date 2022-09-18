# All Books

## Connecting to MySQL

- add the following to [application.properties](./src/main/resources/application.properties)
```
spring.datasource.url=jdbc:mysql://localhost:3306/book_schema
spring.datasource.username=root
spring.datasource.password=rootroot
spring.jpa.hibernate.ddl-auto=update

spring.mvc.view.prefix=/WEB-INF/
```

- add:

```
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-validation</artifactId>
    </dependency> 
    <dependency>
        <groupId>org.apache.tomcat.embed</groupId>
        <artifactId>tomcat-embed-jasper</artifactId>
    </dependency>
    <dependency>
        <groupId>javax.servlet</groupId>
        <artifactId>jstl</artifactId>
    </dependency>
```

to [pom.xml](pom.xml).

- create a model class: [Book.java](./src/main/java/tylermaxwell/allbooks/models/Book.java)
- create an interface: [BookRepository](src/main/java/tylermaxwell/allbooks/repositories/BookRepository.java)
- create a service class: [BookService](src/main/java/tylermaxwell/allbooks/services/BookService.java)
- create a BooksApi [controller](src/main/java/tylermaxwell/allbooks/controllers/BooksApi.java)


## tasks

- [ ] Add a route /books that calls on the service to retrieve all the books.
- [ ] Use the view model to make all the books available to render in your index.jsp
- [ ] Build a JSTL forEach loop to render each row of the table with the information about a book.
- [ ] Ninja Bonus: Make each title a link that navigates to the details page for that particular book.