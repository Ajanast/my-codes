use student;
create table branch(
branch_id int primary key,
branch_name varchar(30));
select * from branch;
insert into branch values(10,"chennai");
insert into branch values(11,"coimbatore");

create table employee(
id int primary key,
emp_name varchar(30),
branch_id int,
constraint fk_branchid foreign key(branch_id) references branch(branch_id));
insert into employee values(1,"anast",10);
insert into employee values(2,"ganesh",11);
insert into employee values(3,"jana",10);
insert into employee values(4,"ashok",11);
select employee.id,employee.emp_name,employee.branch_id,branch.branch_name from employee join branch
on employee.branch_id=branch.branch_id;

select * from employee
where branch_id=(select branch_id from branch
where branch_name="chennai");