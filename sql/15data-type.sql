USE db1;

# 데이터 타입
# 문자형
#   가변형

# 숫자형
#   정수
#   실수

# 날짜형
#   년월일
#   년월일시분초


# 문자형
# VARCHAR(길이)

CREATE TABLE my_table4
(
    col1 VARCHAR(2),
    col2 VARCHAR(3),
    col3 VARCHAR(5)
);
INSERT INTO my_table4
    (col1, col2, col3)
    VALUE ('a', 'b', 'c');
INSERT INTO my_table4
    (col1, col2, col3)
    VALUE ('abc', 'abc', 'abc');
INSERT INTO my_table4
    (col1, col2, col3)
    VALUE ('흥민', '손흥민', '서울특별시');
INSERT INTO my_table4
    (col1, col2, col3)
    VALUE ('❤️🤣', '😊😒😘', '❌👌😂💕😁');


SELECT *
FROM my_table4;

CREATE TABLE my_table5
(
    title  VARCHAR(300),
    author VARCHAR(100)
);

# my_table6 만들기
# 4개의 컬럼
# 각 컬럼의 데이터타입은 문자열 이고
# 컬럼명과, 허용되는 문자열 길이는 스스로 정해보기
CREATE TABLE my_table6
(
    address VARCHAR(300),
    email   VARCHAR(300),
    name    VARCHAR(200),
    city    VARCHAR(100)
);
