--
create table dept01(
	dnum number,
	dname varchar2(6)
);
insert into dept01 values (10, '영업');
insert into dept01 values (20, '회계');
insert into dept01 values (30, '관리');
--
create table emp01(
	num number,
	name varchar2(9),
	dnum number
);
insert into emp01 values (1111, 'user1', 10);
insert into emp01 values (2222, 'user2', 20);
insert into emp01 values (3333, 'user3', 40);