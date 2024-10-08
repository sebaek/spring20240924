USE w3schools;
SELECT *
FROM Products;

# ORDER BY : 조회 결과의 순서를 결정
# ORDER BY 컬럼명
SELECT *
FROM Products
ORDER BY Price;
SELECT *
FROM Employees
ORDER BY BirthDate;
SELECT *
FROM Customers
ORDER BY CustomerName;

SELECT *
FROM Customers
WHERE Country = 'usa'
ORDER BY CustomerName;
SELECT *
FROM Products
WHERE CategoryID = 1
ORDER BY Price;

# 내림차순 DESC
SELECT *
FROM Products
ORDER BY Price DESC;
SELECT *
FROM Employees
ORDER BY BirthDate DESC;

# 멕시코에 있는 고객 조회 (이름 역순)
# 주문번호(OrderID)가 10248인 주문상세(OrderDetails)를 수량이 적은 것 부터 조회
# 공급자번호(SupplierID)가 1번인 상품(Products)을 이름(ProductName) 순으로 조회
