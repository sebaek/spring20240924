SELECT 3;
SELECT 3 + 5;
SELECT 3 * 5;
SELECT 3 / 5;
SELECT 5 % 3;
# SELECT 'hello' || 'world';
SELECT CONCAT('hello', 'world');

USE w3schools;
SELECT LastName, FirstName
FROM Employees;

SELECT CONCAT(FirstName, ' ', LastName) full_name
FROM Employees;

SELECT CONCAT(Address, ', ', City, ', ', Country) full_address
FROM Customers;

# 1번 고객의 총 주문 금액
SELECT c.CustomerName,
       o.OrderDate,
       p.ProductName,
       od.Quantity,
       p.Price,
       (p.Price * od.Quantity) 총액
FROM Customers c
         JOIN Orders o
              ON c.CustomerID = o.CustomerID
         JOIN OrderDetails od
              ON o.OrderID = od.OrderID
         JOIN Products p
              ON od.ProductID = p.ProductID
WHERE c.CustomerID = 1;

# 고객별 총소비금액
SELECT c.CustomerName,
       SUM((p.Price * od.Quantity)) 총소비금액
FROM Customers c
         JOIN Orders o
              ON c.CustomerID = o.CustomerID
         JOIN OrderDetails od
              ON o.OrderID = od.OrderID
         JOIN Products p
              ON od.ProductID = p.ProductID
GROUP BY c.CustomerID;

# 1998년 3월에 가장 많은 매출을 올린 직원 조회
SELECT CONCAT(e.FirstName, ' ', e.LastName) name, SUM(p.Price * od.Quantity) 매출
FROM Orders o
         JOIN Employees e
              ON o.EmployeeID = e.EmployeeID
         JOIN OrderDetails od
              ON od.OrderID = o.OrderID
         JOIN Products p
              ON od.ProductID = p.ProductID
WHERE o.OrderDate BETWEEN '1998-03-01' AND '1998-03-31'
GROUP BY e.EmployeeID
ORDER BY 매출 DESC
LIMIT 1;

