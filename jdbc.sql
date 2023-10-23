CREATE DATABASE jdbc;
USE jdbc;
CREATE TABLE employee(
emp_id INT PRIMARY KEY,
emp_name VARCHAR(30),
salary INT
);
INSERT INTO employee VALUES(1,"Anast",10000);
Select * from employee;

delimiter $$
CREATE PROCEDURE getemp()
BEGIN
SELECT * FROM employee;
end $$
delimiter ;