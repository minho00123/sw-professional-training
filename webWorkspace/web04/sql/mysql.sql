CREATE TABLE bbs02 (
	num INT NOT NULL AUTO_INCREMENT,
	id VARCHAR(16) NULL DEFAULT NULL,
	nalja DATETIME NULL,
	subject VARCHAR(30) NULL DEFAULT NULL,
	content TEXT NULL,
	PRIMARY KEY (num)
)
COLLATE='utf8mb4_0900_ai_ci'
;
--
/* 8
*/
INSERT INTO bbs02 (id, nalja, subject, content) VALUES ('tester', now(), 'test1', 'test');
INSERT INTO bbs02 (id, nalja, subject, content) VALUES ('tester', now(), 'test2', 'test');
INSERT INTO bbs02 (id, nalja, subject, content) VALUES ('tester', now(), 'test3', 'test');
