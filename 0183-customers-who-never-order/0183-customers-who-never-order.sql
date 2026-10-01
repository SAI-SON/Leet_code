select name as Customers from customers 
where id in (SELECT id
FROM customers
EXCEPT
SELECT customerID
FROM orders)

