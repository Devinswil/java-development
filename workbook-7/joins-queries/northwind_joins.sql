-- 1
SELECT p.productID, p.productname, p.unitprice, c.CategoryName
FROM products p
INNER JOIN categories c
			on p.CategoryID = c.CategoryID
            ORDER BY c.CategoryName, p.ProductName;
-- 2
SELECT p.productID, p.productname,p.unitprice, s.CompanyName
FROM products p
INNER JOIN suppliers s 
			on p.SupplierID = s.SupplierID
            WHERE p.UnitPrice > 75
            ORDER BY p.Productname;
-- 3
SELECT p.productID, p.productName, p.unitprice, c.categoryName, s.supplierID
FROM products p
INNER JOIN categories c
			on p.CategoryID = c.CategoryID
            INNER JOIN suppliers s
            ON p.SupplierID = s.SupplierID
            ORDER BY p.ProductName;
-- 4 
SELECT p.productName, c.categoryName
FROM products p
INNER JOIN categories c 
			on p.CategoryID = c.CategoryID
            WHERE p.UnitPrice = (select max(unitPrice)
								FROM products);
-- 5
SELECT o.OrderID, o.ShipName, o.SHipAddress, s.companyName AS ShippingCompany
FROM Orders  o
INNER JOIN Shippers s 
			ON o.ShipVia = s.shipperID
WHERE o.ShipCountry = 'Germany';

-- 6
SELECT *
FROM Orders o
INNER JOIN `Order Details` od on o.OrderId = od.OrderId
Inner JOIN Products p on od.productID = p.productID
WHERE p.productName = 'Sasquatch Ale;'
