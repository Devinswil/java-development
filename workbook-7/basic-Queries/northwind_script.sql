-- Question 1:
SELECT 
*
FROM products;

-- QUESTION 2:
SELECT 
ProductID, PRODUCTNAME, UnitPrice
FROM products;

-- Question 3:
SELECT productID, ProductName, UnitPrice
FROM products
ORDER BY UnitPrice ASC;

-- Question 4:
SELECT *
FROM products
WHERE UnitPrice <= 7.50;

-- QUESTION 5:
SELECT *
FROM products
WHERE UnitsInStock >=100
Order by UnitPrice desc, ProductName;

-- Question 6:
SELECT *
FROM products
WHERE UnitsInStock >= 100
ORDER By UnitPrice asc, ProductName;

-- QUESTION 7:
select *
from products
WHERE UnitsInStock = 0 and UnitsOnOrder >0
order by ProductName;

-- Question 8:
-- Categories

-- Question 9:
select * 
from categories;

-- Question 10:
select * 
from products
where CategoryID = 8;

-- Question 11:
select firstname, lastname
from employees;

-- Question 12:
Select * 
from employees
where title like '%manager%';

-- Question 13:
select distinct title
from employees;

-- Question 14
select * 
from employees
where Salary between '2000' and '2500';

-- Question 15





