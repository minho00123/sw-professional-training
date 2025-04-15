DROP TABLE bbs01;

CREATE TABLE bbs01(
	num NUMBER PRIMARY KEY,
	sub VARCHAR2(30),
	content VARCHAR2(2000),
	writer VARCHAR2(15),
	nalja DATE
);

INSERT INTO bbs01 VALUES (1, 'test1', 'test', 'tester', sysdate);
INSERT INTO bbs01 VALUES (2, 'test2', 'test', 'tester', sysdate);
INSERT INTO bbs01 VALUES (3, 'test3', 'test', 'tester', sysdate);
INSERT INTO bbs01 VALUES ((SELECT MAX(num)+1 FROM bbs01), 'test4', 'test', 'tester', sysdate);

COMMIT;