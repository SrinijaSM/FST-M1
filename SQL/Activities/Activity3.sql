REM   Script: Activity3
REM   Activity3 - Select method

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

SELECT salesman_id, salesman_city FROM salesman;

SELECT * FROM salesman WHERE salesman_city='Paris';

SELECT salesman_id, commission FROM salesman WHERE salesman_name='Paul Adam';

