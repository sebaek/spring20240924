USE w3schools;

# <, <=, >, >=, <>, !=, LIKE

# AND OR NOT
SELECT *
FROM Products
WHERE Price > 10.00
  AND Price < 20.00
ORDER BY Price;
SELECT *
FROM Customers
WHERE Country = 'Mexico'
   OR Country = 'USA'
ORDER BY Country, City;
SELECT *
FROM Customers
WHERE Country <> 'mexico';
SELECT *
FROM Customers
WHERE NOT Country = 'mexico';

# 멕시코와 usa 가 아닌 고객들
SELECT *
FROM Customers
WHERE NOT (Country = 'mexico'
    OR Country = 'usa');
SELECT *
FROM Customers
WHERE Country != 'mexico'
  AND Country != 'usa';

# AND OR NOT 이 여러번 조합될 시 () 꼭 사용해서 읽기 편하게 작성

# 미국이나 브라질에 사는 이름이 G로 시작하는 고객들
SELECT *
FROM Customers
WHERE CustomerName LIKE 'G%'
  AND (Country = 'USA'
    OR Country = 'Brazil');

# 1950년대 태어난 직원들 조회
# 가격이 10.00 보다 작거나 100.00보다 큰 상품들
# 1997년 7월에 주문된 주문들 (Orders)
# 미국이나 영국에 있는 공급자들(Suppliers)


