REM   Script: Activity2
REM   Activity2 - adding data to table

create table salesman;

create table salesman(salesman_id int, salesman_name varchar2(20), salesman_city varchar2(20), commission int);

select * from salesman;

describe salesman


Insert all into salesman values(5005, 'Pit Alex', 'London', 11) 
    into salesman values(5006, 'McLyon', 'Paris', 14) 
    into salesman values(5007, 'Paul Adam', 'Rome', 13) 
    into salesman values(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM DUAL;

select * from salesman;

