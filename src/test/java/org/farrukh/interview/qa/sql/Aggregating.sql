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
  (5, 'Jomi', 'Abdurahmon', 1100, 6);

SELECT
  firstName,
  AVG(salary) AS avg_salary
FROM employees
GROUP BY firstName
HAVING AVG(salary) > 700;
