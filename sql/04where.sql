USE w3schools;

# SELECT 컬럼명들 FROM 테이블명
SELECT CustomerName, Country
FROM Customers;

# 조건에 맞는 행들 조회
# WHERE : 조회될 행의 조건이 작성되는 곳

# SELECT 컬럼명 FROM 테이블명 WHERE 조건

SELECT CustomerName, Country
FROM Customers
WHERE Country = 'Mexico';
SELECT CustomerName, Country
FROM Customers
WHERE Country = "Mexico";
SELECT *
FROM Employees
WHERE BirthDate = '1968-12-08';
SELECT *
FROM Products
WHERE Price = '10.00';

# Spain 에 있는 공급자들(Suppliers)
# 상파울루(São Paulo)에 있는 고객들(Customers)
# 1963년 8월 30일 생인 직원(Employees)
# 2번 카테고리(Categories) 정보
