drop table stu05;
drop table gender05;


create table gender05(
	gen number(1) primary key,
	ch char(3)
);
create table stu05(
	num number primary key,
	name varchar2(5) not null,
	gen number(1) REFERENCES gender05(gen)
);