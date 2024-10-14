USE db1;
CREATE TABLE my_table29
(
    name VARCHAR(2),
    age  INT
);

DESC my_table29;

# 컬럼 추가
ALTER TABLE my_table29
    ADD COLUMN address VARCHAR(100) NOT NULL;

INSERT INTO my_table29
    VALUE ('s', 22, 'london');
SELECT *
FROM my_table29;
ALTER TABLE my_table29
    ADD COLUMN email VARCHAR(50) NOT NULL;

# my_table29에 새 컬럼 country 추가