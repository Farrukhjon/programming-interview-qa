DROP TABLE IF EXISTS employees;
CREATE TABLE employees (
  id         INT UNSIGNED NOT NULL PRIMARY KEY,
  firstName  VARCHAR(100),
  lastName   VARCHAR(100),
  salary     DOUBLE,
  experiance INT UNSIGNED
);

INSERT INTO employees VALUES
  (1, 'Ali', 'Valizoda', 100.0, 3),
  (2, 'Vali', 'Komili', 230.34, 4),
  (3, 'Sami', 'Jamilzoda', 730.56, 5),
  (4, 'Gani', 'Anvari', 1050, 5),
  (5, 'Jomi', 'Abdurahmon', 1100, 6),
  (6, 'Hasan', 'Zokiri', 101, 6),
  (7, 'Naim', 'Komilzoda', 1100, 16),
  (8, 'Vohid', 'Jobiri', 1010, 11),
  (9, 'Sobit', 'Sultonzoda', 2100, 10),
  (10, 'Goib', 'Sherzod', 3100, 112),
  (11, 'Shodi', 'Azizi', 1500, 9),
  (12, 'Hodi', 'Kabiri', 1700, 7),
  (13, 'Jamil', 'Jurjoni', 1820, 12),
  (14, 'Karim', 'Saadi', 1300, 8),
  (15, 'Umar', 'Jalili', 1240, 4),
  (16, 'Samar', 'Bahromzoda', 1100, 5);

/*Getting a second highest salary*/
SELECT MAX(salary) AS second_max_salary
FROM employees
WHERE salary NOT IN (SELECT MAX(salary)
                     FROM employees);

