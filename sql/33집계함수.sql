# 집계함수(Aggregate Functions)
# COUNT, AVG, SUM, MAX, MIN
# 집계함수 사용 시 NULL 포함되지 않음

USE w3schools;
# COUNT 갯수
SELECT COUNT(*)
FROM Customers;
SELECT COUNT(CustomerID)
FROM Customers;
SELECT COUNT(CustomerName)
FROM Customers;
SELECT COUNT(ContactName)
FROM Customers;
DESC Customers;
INSERT INTO Customers
    (CustomerName) VALUE ('흥민');

SELECT COUNT(Country)
FROM Customers;
SELECT COUNT(DISTINCT Country)
FROM Customers;

SELECT SUM(Price)
FROM Products;
SELECT AVG(Price)
FROM Products;
SELECT MAX(Price)
FROM Products;
SELECT MIN(Price)
FROM Products;

DELETE
FROM Customers
WHERE CustomerID = 92;
# GROUP BY : 소계시 사용
SELECT COUNT(CustomerID)
FROM Customers;
SELECT Country, COUNT(CustomerID)
FROM Customers
GROUP BY Country;
SELECT Country, COUNT(CustomerID) 인원
FROM Customers
GROUP BY Country
ORDER BY 인원 DESC;
SELECT Country, COUNT(CustomerID) 인원
FROM Customers
GROUP BY Country
ORDER BY 인원 DESC
LIMIT 5;

# 카테고리별 평균 상품 가격
SELECT CategoryId, AVG(Price)
FROM Products
GROUP BY CategoryID;
SELECT CategoryId, COUNT(ProductID)
FROM Products
GROUP BY CategoryID;
SELECT CategoryId, MAX(Price)
FROM Products
GROUP BY CategoryID;
SELECT CategoryId, MIN(Price)
FROM Products
GROUP BY CategoryID;
SELECT c.CategoryID, c.CategoryName, AVG(Price)
FROM Products p
         JOIN Categories c
              ON p.CategoryID = c.CategoryID
GROUP BY c.CategoryID;

# 직원별 주문처리건수 (Employees, Orders)
# 직원의 이름과 처리건수 조회, 직원 first name 순 정렬


