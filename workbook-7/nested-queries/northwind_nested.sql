-- 1
SELECT productname, unitprice
From products
where unitprice= (select max(unitprice) 
				from products);
                
-- 2
SELECT OrderID, ShipName,ShipAddress
FROM orders
WHERE ShipVia in (SELECT shipperID 
					FROM shippers
                    WHERE CompanyName = 'Federal Shipping' );
                    
-- 3
SELECT orderID, ProductName
from `order details`
Where ProductID in (SELECT ProductID
FROM products
WHERE ProductID = 34);

-- 4
SELECT FirstName,LastName
FROM employees
WHERE EmployeeID = (
SELECT EmployeeID
FROM orders
WHERE OrderID = 10266);

-- 5
SELECT companyname
FROM customers
WHERE CustomerID = (
SELECT CustomerID
FROM orders
WHERE OrderID = 10266);