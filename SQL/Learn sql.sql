/*create database student;
use student;
create table student(
ID int primary key,
NAME varchar(30),
CGPA decimal(3,2)
);
show tables;
select * from student;
alter table student add department varchar(5);
alter table student drop department;
drop table student;
drop database student*/
create database student;
use student;
create table student(
ID int primary key,
NAME varchar(20),
CGPA decimal(3,2),
DEPARTMENT varchar(5));
describe table student;
select * from student;
insert into student values(1,"Anast",9.8,"ECE");
insert into student values(2,"ganesh",9.6,"CSE");
insert into student values(3,"jana",9.5,"EEE");
insert into student values(4,"Ajin",9.7,"MECH");
insert into student (ID ,CGPA) values(5,9.1);
-- where(get particular datas)class and conditions 

select* from student
where DEPARTMENT="CSE" OR DEPARTMENT="ECE";
select* from student
where DEPARTMENT not in("CSE","EEE");
select* from student
where CGPA between 9.7 AND 9.8
limit 1;
select * from student
where NAME like "__N%";
select * from student
where NAME like "a%";
-- for sort use percentage
select * from student
where NAME like "--\%";
-- update and delete values
update  student
set DEPARTMENT="CIVIL"
where ID=1;
select * FROM student;
delete from student
where ID=1;
-- DISTINCT AND ORDER BY
select distinct CGPA from student
order by CGPA asc;
-- functions

