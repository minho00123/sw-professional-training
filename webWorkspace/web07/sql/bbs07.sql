drop table bbs07;
drop sequence bbs07_seq;
create table bbs07(
    num number primary key,
    sub varchar2(30),
    content varchar2(2000),
    id varchar2(16),
    nalja date,
    ref number,
    ord number default 0,
    lvl number default 0
);
create sequence bbs07_seq;
insert into bbs07 (num, sub, content, id, nalja, ref) values (bbs07_seq.nextval, 'test1', 'test', 'tester', sysdate, bbs07_seq.currval);
insert into bbs07 (num, sub, content, id, nalja, ref) values (bbs07_seq.nextval, 'test2', 'test', 'tester', sysdate, bbs07_seq.currval);
insert into bbs07 (num, sub, content, id, nalja, ref) values (bbs07_seq.nextval, 'test3', 'test', 'tester', sysdate, bbs07_seq.currval);
insert into bbs07 (num, sub, content, id, nalja, ref) values (bbs07_seq.nextval, 'test4', 'test', 'tester', sysdate, bbs07_seq.currval);
insert into bbs07 (num, sub, content, id, nalja, ref) values (bbs07_seq.nextval, 'test5', 'test', 'tester', sysdate, bbs07_seq.currval);
commit;
select * from bbs07 order by ref desc, ord asc;
-- ���
insert into bbs07 (num, sub, content, id, nalja, ref, ord, lvl) values (bbs07_seq.nextval, 'test6', 'test', 'tester', sysdate, 3,(select max(ord) + 1 from bbs07 where ref=3), 1);
insert into bbs07 (num, sub, content, id, nalja, ref, ord, lvl) values (bbs07_seq.nextval, 'test7', 'test', 'tester', sysdate, 3,(select max(ord) + 1 from bbs07 where ref=3), 1);

-- ����� ���
update bbs07 set ord=ord+1 where ref=3 and ord>2;
insert into bbs07 (num, sub, content, id, nalja, ref, ord, lvl) values (bbs07_seq.nextval, 'test7', 'test', 'tester', sysdate, 3, 3, 2);
