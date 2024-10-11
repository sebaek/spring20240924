USE w3schools;

UPDATE Customers
SET CustomerName = '오타니',
    ContactName  = '쇼헤이',
    City         = 'la'
WHERE CustomerID = 1;

# 꼭 UPDATE 전에 같은 WHERE 절로 SELECT 먼저 해볼 것!
SELECT *
FROM Customers
WHERE CustomerID = 1;

# 1번 상품의 이름을 '케이크'로 바꾸기
# 3번 직원의 생일을 '2000-01-01'로 바꾸기
# 1번 공급자의 도시는 Seoul
#             국가는 Korea로 바꾸기
