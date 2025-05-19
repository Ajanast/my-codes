create database studentManagement;
show databases;
use studentManagement;

create table Student (
STUDENT_ID int primary key,
FIRST_NAME varchar(30),
LAST_NAME varchar(30),
GPA decimal(3,2),
ENROLLMENT_DATE date,
MAJOR varchar(30)
);

describe student;
insert into student values(201,"Shivansh","Mahajan",8.79,"2021-09-01","Computer Science");
insert into student values(202,"Umesh","Sharma",8.44,"2021-09-01","Mathematics");
insert into student values(203,"Rakesh","Kumar",5.6,"2021-09-01","Biology");
insert into student values(204,"Radha","Sharma",9.6,"2021-09-01","Chemistry");

update student
set gpa=9.6 where first_name="Shivansh";
show tables;
create table Program(
STUDENT_REF_ID int primary key,
PROGRAM_NAME varchar(30),
PROGRAM_START_DATE date
);
insert into program values(201,"Computer Science","2021-09-01");
insert into  program values(202,"Mathematics","2021-09-01");
insert into program values(203,"Biology","2021-09-01");
insert into  program values(204,"Chemistry","2021-09-01");

create table Scholarship(
STUDENT_REF_ID int,
Scholarship_Amount int,
Scholarship_DATE date
);



insert into Scholarship values(201,5000,"2021-10-15");
insert into Scholarship  values(202,4500,"2022-08-18");
insert into Scholarship  values(203,3000,"2022-01-25");
insert into Scholarship  values(204,4000,"2022-01-25");


DELETE from Scholarship
where STUDENT_REF_ID =204;

select distinct ENROLLMENT_DATE from student;

/*Write a SQL query to fetch "FIRST_NAME" from the Student table in upper case 
and use ALIAS name as STUDENT_NAME. */

select upper(FIRST_NAME) as STUDENT_NAME  from student;

/*2. Write a SQL query to fetch unique values
 of MAJOR Subjects from Student table. */
 
 select distinct MAJOR from student;
 
 /* Write a SQL query to print the first 3 characters 
 of FIRST_NAME from Student table. */
 select substring(FIRST_NAME,1,3) from student;
 
 /* Write a SQL query to find the position of alphabet ('a') int the first name 
 column 'Shivansh' from Student table.*/
 select instr( lower(first_name),'a') as position from student
 where FIRST_NAME="Shivansh";
 
 /*5. Write a SQL query that fetches the unique values of 
 MAJOR Subjects from Student table and print its length. */
 select  distinct major,length(major) as length from student;
 
 /* 6. Write a SQL query to print FIRST_NAME 
 from the Student table after replacing 'a' with 'A'.*/
 select replace(first_name,'a','A') from student;
 
 /* 7. Write a SQL query to print the FIRST_NAME and LAST_NAME from 
 Student table into single column COMPLETE_NAME. */
 select concat(first_name,' ',last_name) as complete_name from student;
 
 /* 8. Write a SQL query to print all Student details from Student table order by
 FIRST_NAME Ascending and MAJOR Subject descending . */
 select * from student
 order by first_name,major desc;
 
 /* 9. Write a SQL query to print details of the Students with the FIRST_NAME
 as 'Prem' and 'Shivansh' from Student table.*/
 select * from student 
 where FIRST_NAME in("Prem","Shivansh");
 
 /*10. Write a SQL query to print details of the Students excluding FIRST_NAME
 as 'Prem' and 'Shivansh' from Student table. */
  select * from student 
 where FIRST_NAME not in("Prem","Shivansh");
 
 /*  11. Write a SQL query to print details of
 the Students whose FIRST_NAME ends with 'a'.*/
  select * from student 
 where FIRST_NAME like '%a';
 
 /* 12. Write an SQL query to print details of the Students whose FIRST_NAME 
 ends with ‘a’ and contains five alphabets.*/
  select * from student 
 where FIRST_NAME like '____a';
 
 /* 13. Write an SQL query to print details of the Students
 whose GPA lies between 9.00 and 9.99. */
 select * from student 
 where gpa between 9.00 and 9.99;
 
 /* 14. Write an SQL query to fetch the count of Students
 having Major Subject ‘Computer Science’. */
 select major,count(*) AS Major_count from student
 where major="Computer Science";

/* 15. Write an SQL query to fetch Students full
 names with GPA >= 8.5 and <= 9.5.*/
 select concat(first_name,' ',last_name) as complete_name from student
 where gpa between 8.5 and 9.5;
 
 /* 16. Write an SQL query to fetch the no. of Students for
 each MAJOR subject in the descending order.*/
 select major ,count(major) from student group by major order by count(major) desc;
 
 /* 17. Display the details of students who have received scholarships, including their names, 
 scholarship amounts, and scholarship dates. */
 select student.FIRST_NAME ,student.LAST_NAME,
 scholarship.Scholarship_Amount,scholarship.Scholarship_DATE from student
 join scholarship on student.STUDENT_ID = scholarship.STUDENT_REF_ID;

/* 18. Write an SQL query to show only odd rows from Student table. */
select * from student
where STUDENT_ID % 2 !=0;

/*Write an SQL query to show only even rows from Student table */
select * from student
where STUDENT_ID % 2 =0;

/* 20. List all students and their scholarship amounts if they have received any.
 If a student has not received a scholarship, 
display NULL for the scholarship details.*/
SELECT 
    Student.FIRST_NAME,
    Student.LAST_NAME,
    Scholarship.SCHOLARSHIP_AMOUNT,
    Scholarship.SCHOLARSHIP_DATE
FROM 
    Student
LEFT JOIN 
    Scholarship ON Student.STUDENT_ID = Scholarship.STUDENT_REF_ID;
    
/* 21. Write an SQL query to show the top n (say 5) 
records of Student table order by descending GPA. */
select * from student
order by gpa desc limit 4;

/* 22. Write an SQL query to determine the nth (say n=5) highest GPA from a table. */
select * from student
order by gpa desc limit 3,1;

/* 24. Write an SQL query to fetch the
 list of Students with the same GPA.*/
 select * from student s1 ,student s2 
 where s1.GPA=s2.GPA and s1.STUDENT_ID!=s2.STUDENT_ID;
 
/* 25. Write an SQL query to show the second highest 
GPA from a Student table using sub-query.*/
select max(gpa) from student
where gpa not in(select max(gpa) from student);

/* 26. Write an SQL query to show one row twice in results from a table.*/
select * from student
union all
select * from student order by STUDENT_ID ;

/* 27. Write an SQL query to list STUDENT_ID who does not get Scholarship. */
select Student_id from student
where STUDENT_ID not in (select STUDENT_REF_ID from scholarship);

/* 29. Write an SQL query to fetch the 
MAJOR subject that have less than 4 people in it.*/
select major,count(major) from student group by major having count(major)<4;

/* 30. Write an SQL query to show all MAJOR subject 
along with the number of people in there. */
select major,count(major) from student group by MAJOR;

/* 31. Write an SQL query to show the last record from a table.*/
select * from student 
where STUDENT_ID=(select max(STUDENT_ID) from student);

/* Write an SQL query to fetch the first row of a table.*/
select * from student 
where STUDENT_ID=(select min(STUDENT_ID) from student);

/* 33. Write an SQL query to fetch the last five records from a table. */
SELECT * 
FROM (
    SELECT * 
    FROM Student 
    ORDER BY STUDENT_ID DESC 
    LIMIT 5
) AS subquery
ORDER BY STUDENT_ID;

