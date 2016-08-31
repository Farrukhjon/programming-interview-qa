SET FOREIGN_KEY_CHECKS = 0;
DROP TABLE IF EXISTS employees;
CREATE TABLE employees (
  id         INT UNSIGNED NOT NULL PRIMARY KEY,
  firstName  VARCHAR(100),
  lastName   VARCHAR(100),
  salary     DOUBLE,
  experiance INT UNSIGNED,
  depId      INT UNSIGNED,
  FOREIGN KEY (depId) REFERENCES departments (id)
);

DROP TABLE IF EXISTS departments;
CREATE TABLE IF NOT EXISTS departments (
  id   INT UNSIGNED NOT NULL PRIMARY KEY,
  name VARCHAR(100)
);

INSERT INTO departments VALUES
  (1, 'IT'),
  (2, 'Sale'),
  (3, 'QA');

INSERT INTO employees VALUES
  (1, 'Ali', 'Valizoda', 100.0, 3, 1),
  (2, 'Vali', 'Komili', 230.34, 4, 1),
  (3, 'Sami', 'Jamilzoda', 730.56, 5, 2),
  (4, 'Gani', 'Anvari', 1050, 5, 2),
  (5, 'Jomi', 'Abdurahmon', 1100, 6, 2),
  (6, 'Hasan', 'Zokiri', 101, 6, 3),
  (7, 'Naim', 'Komilzoda', 1100, 16, 1),
  (8, 'Vohid', 'Jobiri', 1010, 11, 3),
  (9, 'Sobit', 'Sultonzoda', 2100, 10, 2),
  (10, 'Goib', 'Sherzod', 3100, 112, 2),
  (11, 'Shodi', 'Azizi', 1500, 9, 3),
  (12, 'Hodi', 'Kabiri', 1700, 7, 1),
  (13, 'Jamil', 'Jurjoni', 1820, 12, 1),
  (14, 'Karim', 'Saadi', 1300, 8, 1),
  (15, 'Umar', 'Jalili', 1240, 4, 2),
  (16, 'Samar', 'Bahromzoda', 1100, 5, 2);

/*Query highest salary of en employee from each departments*/

SELECT
  d.name        AS Dep_Name,
  MAX(e.salary) AS MAX_SALARY
FROM employees e INNER JOIN departments d ON e.depId = d.Id
GROUP BY d.name
ORDER BY MAX_SALARY;

SET FOREIGN_KEY_CHECKS = 1;

