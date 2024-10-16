USE w3schools;
SELECT *
FROm Orders;
SELECT *
FROM OrderDetails
WHERE OrderID = 10248;

# 1996년 7월 4일에 어떤 고객이 어떤 상품을 몇 개 주문했는지 조회
SELECT o.OrderDate, c.CustomerName, p.ProductName, od.Quantity
FROM Orders o
         JOIN OrderDetails od
              ON o.OrderID = od.OrderID
         JOIN Customers c
              ON c.CustomerID = o.CustomerID
         JOIN Products p
              ON od.ProductID = p.ProductID
WHERE OrderDate = '1996-07-04';

# 1996년 7월 4일에 주문된 상품과 카테고리 정보 조회
