USE w3schools;
DESC Customers;

INSERT INTO Customers
    (CustomerID, CustomerName)
    VALUE (92, '흥민');
SELECT *
FROM Customers
ORDER BY CustomerID DESC;

INSERT INTO Customers
    (CustomerID, CustomerName, ContactName)
    VALUE (93, '강인', '미드필더');
INSERT INTO Customers
    (CustomerID, CustomerName)
VALUES (94, '희찬'),
       (95, '하성'),
       (96, '오타니');
INSERT INTO Customers
    (CustomerID, CustomerName)
    VALUE ('97', '범근');
INSERT INTO Customers
    (CustomerName)
    VALUE ('지성');

# Customers 테이블에 2개의 레코드를 입력하기
INSERT INTO Customers (CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country)
    VALUE (99, '케인', '해리', '런던', '베를린', '12345', '독일');
INSERT INTO Customers (CustomerName, ContactName, Address, City, PostalCode, Country)
    VALUE ('도널드', '트럼프', '뉴욕', '맨하탄', '456', '미국');
# Products 테이블에 2개의 레코드를 입력하기
SELECT *
FROM Products
ORDER BY ProductID DESC;
INSERT INTO Products
    (ProductID, ProductName, SupplierID, CategoryID, Unit, Price)
    VALUE
    (78, '햄버거', 3, 1, '1개당', 500);
INSERT INTO Products
    (ProductName, SupplierID, CategoryID, Unit, Price)
    VALUE ('피자', 2, 3, '1판', 200);