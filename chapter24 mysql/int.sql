CREATE TABLE t3 (
id TINYINT);
CREATE table t4 (
id TINYINT UNSIGNED);

INSERT INTO t3 VALUES (127);

SELECT * FROM t3

INSERT INTO t4 VALUES (255);
SELECT * FROM t4;