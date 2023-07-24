REM   Script: Activity5
REM   Activity5-update table details


create table salesman(salesman_id int, salesman_name varchar2(20), salesman_city varchar2(20), commission int);

describe salesman


select * from salesman;

Insert all into salesman values(5005, 'Pit Alex', 'London', 11)  
    into salesman values(5006, 'McLyon', 'Paris', 14)  
    into salesman values(5007, 'Paul Adam', 'Rome', 13)  
    into salesman values(5003, 'Lauson Hen', 'San Jose', 12)  
SELECT 1 FROM DUAL;

select * from salesman;

alter table salesman  add grade int;

alter table salesman  add grade int  
select * from salesman;

update salesman Set grade='100';

select * from salesman;

update salesman se grade ='200' where salesman_city='Rome';

update salesman set grade ='200' where salesman_city='Rome';

select * from salesman;

select * from salesman;

update salesman set grade ='300' where salesman_name='James Hoog';

select * from salesman;

update salesman set salesman_name ='Pierre' where salesman_name='McLyon';

select * from salesman;

