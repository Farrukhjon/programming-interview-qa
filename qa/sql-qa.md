**Q: What is a Relational Database Management Systems (RDBMS)?**
**A:** 
Relational Data Base Management Systems (RDBMS) are database management systems that maintain data records and indices in tables.
Relationships may be created and maintained across and among the data and tables. In a relational database,
relationships between data items are expressed by means of tables.
Interdependencies among these tables are expressed by data values rather than by pointers.
This allows a high degree of data independence. An RDBMS has the capability to recombine the data items from different files,
providing powerful tools for data usage.

Basic features of a RDBMS
 - Create databases
 - Query the data stored
 - Support and maintain large amounts of data
 - Allow multiple users to access the data concurrently

**Q: What is normalization?**

**A:**
`Database normalization` is a data design and organization process applied to data structures based on rules that help build relational databases.
 In relational database design, the process of organizing data to minimize redundancy.
 Normalization usually involves dividing a database into two or more tables and defining relationships between the tables.
 The objective is to isolate data so that additions, deletions, and modifications of a field can be made in just one table 
 and then propagated through the rest of the database via the defined relationships.

**Q: What are different normalization forms?**

**A:**
1NF: Eliminate Repeating Groups
Make a separate table for each set of related attributes, and give each table a primary key. Each field
contains at most one value from its attribute domain.
2NF: Eliminate Redundant Data
If an attribute depends on only part of a multi-valued key, remove it to a separate table.
3NF: Eliminate Columns Not Dependent On Key
If attributes do not contribute to a description of the key, remove them to a separate table. All
attributes must be directly dependent on the primary key
BCNF: Boyce-Codd Normal Form
If there are non-trivial dependencies between candidate key attributes, separate them out into distinct
tables.
4NF: Isolate Independent Multiple Relationships
No table may contain two or more 1:n or n:m relationships that are not directly related.
5NF: Isolate Semantically Related Multiple Relationships
There may be practical constrains on information that justify separating logically related many-to-many
relationships.
ONF: Optimal Normal Form
A model limited to only simple (elemental) facts, as expressed in Object Role Model notation.
DKNF: Domain-Key Normal Form
A model free from all modification anomalies.
Remember, these normalization guidelines are cumulative. For a database to be in 3NF, it must first
fulfill all the criteria of a 2NF and 1NF database.

**Q: What's the difference between a primary key and a unique key?**

**A:**
Both primary key and unique enforce uniqueness of the column on which they are defined. But by default primary key creates
 `a clustered index` on the column, where are unique creates `a nonclustered index` by default.
 Another major difference is that, primary key `doesn't allow NULLs`, but unique key `allows one NULL` only.

**Q: What is a `compound (composite) primary key`?**

**A:**
A compound(composite) key is a key that consists of `two or more simple keys` that `uniquely identify` an `entity`

**Q: Why and When to use `composite primary keys`?**

**A:**
A `Many-To-Many` table association is a classic example of a good use case of a `composite primary key`.

**Q: What is the difference between `HAVING and WHERE` clauses?**

**A:**
Both specify a search condition for a group or an aggregate

WHERE:
   - Applied to each row before they are part of the GROUP BY function in a query

HAVING:
  - Was added to SQL because the WHERE keyword could not be used with `aggregate functions`
  - Can be used only with the SELECT statement
  - Typically used in a GROUP BY clause
  - When GROUP BY is not used, HAVING `behaves like a WHERE` clause 
  - Basically used only with the `GROUP BY` function in a query
  - Syntax of HAVING clause:
   ```
      SELECT [col_name], AGR_FUNCTION([col_name])
         FROM [table_name] 
         GROUP BY <col_name> 
         HAVING AGR_FUNCTION([col_name]) [operator] [value]
   ```
   
**Q: What are the difference between `DELETE, TRUNCATE and DROP` commands?**

**A:** 

DELETE:
 - Used to remove `some or all rows` from a table
 - WHERE clause is used `to remove some rows`
 - If WHERE no used `all rows` will be removed
 - After performing DELETE command COMMIT or ROLLBACK required in transaction 

TRUNCATE
 - Used to remove `all rows` from a table
 - The operation `cannot be rolled back` 

DROP
 - Used to remove `a table` from a database.
 - The operation `cannot be rolled back`

**Q: Explain `UNION` command and what is difference between `UNION and UNION ALL`?**

**A:**
UNION `merges` the contents of `two structurally-compatible tables` into `a single combined table` in a SELECT command.

**UNION**
   - does not allow `duplicate records` in to a combined table

**UNION ALL**
  - allows `duplicate records` in to a combined table 
  - has better performance then UNION since does not additional removal operations for duplicate rows
 
**Q: Explain all type of `JOIN` clauses in ANSI-SQL** 

**A:**
There are five type of JOIN clauses in standard of ANSI-SQL:
  - INNER JOIN 
     - default, simple type of join
     - returns `all matched rows from the BOTH table`
  - LEFT JOIN
     - returns `all rows from the left` table, and the `matched rows` from the `right table`;
  - RIGHT JOIN
     - returns `all rows from the right` table, and the `matched rows` from the `left table`;
  - FULL JOIN
   - returns all rows from the a left table and from a right table
  - CROSS JOIN
   - returns all the rows from the left table and all the rows from right table and shows as `Cartesian product`, with all possibilities
 
**Q: How to query `second highest salary` of an Employee?**

**A:** 
 Using `MAX()` function and the `sub-query`
   ```
   SELECT MAX(salary) AS secondMaxSalary FROM employees WHERE salary NOT IN (SELECT MAX(salary) FROM employees);
   ```
   
**Q: Query highest salary of an employee from each departments and sort by highest salary**

**A:**
   ```
   SELECT
     d.name        AS Dep_Name,
     MAX(e.salary) AS MAX_SALARY
   FROM employees e INNER JOIN departments d ON e.depId = d.Id
   GROUP BY d.name
   ORDER BY MAX_SALARY;
   ```

