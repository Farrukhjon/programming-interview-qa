Hibernate ORM Framework Questions & Answers
---

###Core API

**Q: What are core interfaces in Hibernate?**

**A:** Here are core interfaces of Hibernate
 - `Session`. The Session is `single-threaded`, `short-lived` object and represents access API between an application and persistent storage.
 - `SessionFactory`. Factory object for retrieving a session object. Typically there is should be `one` object of the session factory within application. 
 - `Configuration`
 - `Transaction`
 - `Query`
 - `Criteria`

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