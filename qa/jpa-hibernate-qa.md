Hibernate and JPA ORM Framework Questions & Answers
---

**Q: What is JPA API?**

JPA (Java Persistence API) is a specification for solving object mapping problem to the relational model and vise versa
 - Common used annotations are located in the `javax.persistence` package 
 - Using JPA annotation in code gives us write implementation independent code
 - JPA Query mechanisms
   - JPQL is string-based query language
   - Criteria API is object-based query API

**Q: JPA Parameter Binding for JPQL and Criteria?**

JPA & Hibernate supports this kind of parameters binding technique
 - Parameter Objects
 - Named Parameters
   A named parameter of a Java Persistence query language query is an identifier that is prefixed by the
   ":" symbol. The parameter names passed to the setParameter methods of the Query and
   TypedQuery interfaces do not include this ":" prefix.
 - Positional Parameters (is not supported for criteria queries)
 - Named Queries

**Q: Why use Hibernate?**

 - Provides JPA and Its own API
 - Has powerful HQL language
 - Is Open-Source
 - Supports lazy-initialization using proxy-objects (performs queries on-demand)
 - Provides Caching mechanism (cache-level1 and cache-level2) for better performance
 - Provides mapping for most known databases

###Core API

**Q: What are core interfaces in Hibernate?**

**A:** Here are core interfaces of Hibernate
 - `Session`. The Session is `single-threaded`, `short-lived` object and represents access API between an application and persistent storage.
 - `SessionFactory`. Factory object for retrieving a session object. Typically there is should be `one` object of the session factory within application. 
 - `Configuration`
 - `Transaction`
 - `Query`
 - `Criteria`

**Q: Characteristics of instance of SessionFactory**

 - Main factory class for getting and managing a `Session` object 
 - Implemented using singleton pattern, 
 - Is immutable
 - Is and thread-safe
 
**Q: What is difference between `openSession()`, `getCurrentSession()` and `openStatelessSession()` methods of a SessionFactory object?**

 - openSession (Session)
   - returns a new session in every call
   - must be closed after each operations on a database
 - getCurrentSession (Session)
   - returns current session 
   - bounded to the hibernate global context
   - must not to be closed   
 - openStatelessSession (StatelessSession)
   - returns a new stateless session
   - does't implement first-level cache
   - does't interact with second-level cache
   - recommended to use in batch operations

**Q: What is first-level cache (L1 cache)?**

 - Session scoped cache. It means that other session cannot use cached objects from some session
 - Is enabled by default and cannot be disabled
 - An particular object can be removed from a session cache via Session.evict(Object) method. Second query for the object hits a database
 - All cached objects can be removed via Session.clear() method
 
**Q: What is second-level cache (L2 cache)?**
 - SessionFactory scoped cache. Objects are cached across all sessions which created this SessionFactory 
 - Can be enabled or disabled via configuration
 - There are several cache provider: EhCache, JBoss Cache, 
  
**Q: What is different between `load` and `get` method of a `session` object?**

**A:**
 Method `load()` of the session object:
   - Throws an exception if the unique id is not found in database
   - By default, returns a `proxy` and database won't be `hit` until the proxy is first invoked
   - Use if you are sure that the object exists
   
 Method `get()` of the session object:
   - Returns `null` if the unique id is not found in database
   - Will hit the database immediately
   - Use if you are not sure that the object exists 