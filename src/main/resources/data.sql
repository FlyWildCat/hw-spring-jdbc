-- INSERT TO CUSTOMERS
INSERT INTO homework.customers ("name", surname, age, phone_number)
VALUES ('alexey', 'popov', 25, '+79991234567'),
        ('ALEXEY', 'PETROV', 40, '+79992345678'),
        ('Alexey', 'Ivanov', 18, '+79993456789'),
        ('Сергей', 'Смирнов', 35, '+79990234567'),
        ('Андрей', 'Андреев', 65, '+79990034567'),
        ('Владимир', 'Высоцкий', 52, '+79990000007');

-- INSERT TO ORDERS
INSERT INTO homework.orders ("date", customers_id, product_name, amount)
VALUES ('2023-01-10', 1, 'смартфон', 10000),
        ('2023-01-09', 2, 'ноутбук', 65000),
        ('2023-01-11', 3, 'пылесос', 7000),
        ('2023-01-10', 4, 'фотоаппарат', 12000),
        ('2023-01-15', 5, 'кофеварка', 35000),
        ('2023-01-17', 6, 'компьютер', 100000);