USE w3schools;

# LIMIT : 조회 결과 수(레코드 수, 행의 수)를 제한

SELECT *
FROM Orders
ORDER BY OrderDate
LIMIT 10;
SELECT *
FROM Orders
ORDER BY OrderDate
LIMIT 20;
SELECT *
FROM Orders
ORDER BY OrderDate DESC
LIMIT 20;

# 나이가 가장 많은 직원 3명
SELECT *
FROM Employees
ORDER BY BirthDate
LIMIT 3;
# 가장 젊은 직원 2명
SELECT *
FROM Employees
ORDER BY BirthDate DESC
LIMIT 2;

# 가장 비싼 상품 10개
# 3번 카테고리에서 가장 저렴한 상품 5개
# 1번 고객이 가장 최근 주문한 주문
