USE db1;
DESC my_table29;

# 컬럼변경
ALTER TABLE my_table29
    MODIFY COLUMN ssn varchar(10) DEFAULT '0000' UNIQUE;
SELECT *
FROM my_table29;

# 컬럼변경시 제약사항을 위반 하는 기존 레코드의 값을 적절히 수정해야함
UPDATE my_table29
SET ssn = '1'
WHERE name = 's';
ALTER TABLE my_table29
    MODIFY COLUMN ssn VARCHAR(10) NOT NULL DEFAULT '0000' UNIQUE;

DESC my_table29;
# address 컬럼의 자료형 varchar(3)으로 변경
# not null 유지