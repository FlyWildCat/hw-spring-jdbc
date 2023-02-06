SELECT o.product_name
FROM homework.orders o
JOIN homework.customers c ON c.id = o.customers_id
WHERE lower(c."name") = lower(:name);