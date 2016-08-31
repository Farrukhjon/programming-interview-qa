Java JDBC Questions & Answers
---

**Q: How many ways getting a connection JDBC supports?**

**A:**
There two way to get a connection
 - By using class java.sql.`DriverManager`
 - By creating object of interface java.sql.`DataSource`
 
 
**Q: Why do we use a DataSource instead of a DriverManager?**

**A:**
DataSource
 - Provides creating a Connection Pool
 - Provides caching
 - Provides JNDI for scalable and maintainable connection properties
 - Can be maintained by an Application Server
 
**Q: What is the difference between `Statement`, `PreparedStatement` and `CallableStatement`?**

**A:** All provide executing query to a database
 - Statement
   - allows executing general purpose query
   - send sql query directly for each execution (not pre-compiled by DBMS)
 - PreparedStatement
   - allows executing `parametric` and `dynamic` queries
   - used pre-compiled query in the database, so that allows executing second and others query more faster, because  DBMS allows caching
   - prevents `SQL injection` attacks in Java by validating number of passed parameters to a query string
   - `index` of a placeholder starts from `1` not from `0`
 - CallableStatement
   - used for executing stored procedures queries

**Q: How  do you prevent SQL Injection in Java Code?**

By using PreparedStatement Java provides avoidance SQL-Injection attack. 