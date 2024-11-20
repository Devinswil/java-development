-- 1
SELECT count(*)
FROM suppliers;
-- 29

-- 2
SELECT sum(salary)
FROM employees;
-- 20362.93

-- 3
SELECT min(UnitPrice)
FROM products;

-- 4
SELECT avg(unitprice)
FROM products;

-- 5
SELECT max(unitprice)
FROM products;

-- 6 
SELECT  SupplierID, count(*)
FROM products
GROUP BY SupplierID;

-- 7
SELECT CategoryID, avg(UnitPrice)
FROM products
GROUP BY CategoryID;

-- 8
SELECT SupplierID, count(*) as itemcount
FROM products
group by SupplierID
HAVING itemcount >= 5;

-- 9
SELECT productid, productname, unitprice * unitsinstock as inventoryValue
FROM product 
ORDER BY inventoryValue desc, productname


