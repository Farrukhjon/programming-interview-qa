DROP TABLE IF EXISTS users;
CREATE TABLE users (
  id       INT UNSIGNED NOT NULL PRIMARY KEY,
  login    VARCHAR(100),
  password VARCHAR(100)
);

DROP TABLE IF EXISTS employees;
CREATE TABLE employees (
  id         INT UNSIGNED NOT NULL PRIMARY KEY,
  firstName  VARCHAR(100),
  lastName   VARCHAR(100),
  salary     DOUBLE,
  experiance INT UNSIGNED
);

INSERT INTO employees(id, firstName, lastName) VALUES
  (1, 'Ali', 'Valizoda'),
  (2, 'Vali', 'Komili'),
  (3, 'Sami', 'Jamilzoda'),
  (4, 'Gani', 'Anvari'),
  (5, 'Jomi', 'Abdurahmon');

INSERT INTO users VALUES
  (2, 'Vali', 'Komili'),
  (3, 'Sami', 'Jamilzoda'),
  (4, 'Gani', 'Anvari');

SELECT *
FROM employees
UNION SELECT *
      FROM users;

SELECT *
FROM employees
UNION ALL SELECT *
          FROM users;

SELECT
  firstName,
  AVG(salary) AS avg_salary
FROM employees e
  INNER JOIN departments d
WHERE experiance > 10
GROUP BY firstName
HAVING AVG(salary) > 1000;