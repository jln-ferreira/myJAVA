CREATE TABLE categories(
id integer PRIMARY KEY,
name text,
category_id_recursive integer,
active integer NOT NULL DEFAULT 1,
updated_at CURRENT_TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
created_at CURRENT_TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE products(
id integer PRIMARY KEY,
name text,
description text,
price_id integer,
category_id integer,
currency_id integer,
active integer NOT NULL DEFAULT 1,
updated_at CURRENT_TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
created_at text DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE currency(
id integer PRIMARY KEY,
name text,
dolar_compair integer,
active integer NOT NULL DEFAULT 1,
updated_at CURRENT_TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
created_at text DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE price(
id integer PRIMARY KEY,
value integer,
item_id integer,
active integer NOT NULL DEFAULT 1,
updated_at CURRENT_TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
created_at text DEFAULT CURRENT_TIMESTAMP
);


CREATE TABLE costumers(
id integer PRIMARY KEY,
name text,
nickName text,
email text,
address text,
phone text,
active integer NOT NULL DEFAULT 1,
updated_at CURRENT_TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
created_at text DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE invoice(
id integer PRIMARY KEY,
costumer_id integer,
name text,
invoice_data datetime,
due_date date,
value integer,
isPaid integer,
payMethod text,
active integer NOT NULL DEFAULT 1,
updated_at CURRENT_TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
created_at text DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE invoice_Detail(
id integer PRIMARY KEY,
invoice_id integer,
product_id integer,
product_qty integer,
active integer NOT NULL DEFAULT 1,
updated_at CURRENT_TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
created_at text DEFAULT CURRENT_TIMESTAMP
);


CREATE TABLE card(
id integer PRIMARY KEY,
costumer_id integer,
active integer NOT NULL DEFAULT 1,
updated_at CURRENT_TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
created_at text DEFAULT CURRENT_TIMESTAMP
);


CREATE TABLE card_detail(
id integer PRIMARY KEY,
card_id integer,
product_id integer,
quantity integer,
price integer,
currency_id integer,
total_Amount real,
active integer NOT NULL DEFAULT 1,
updated_at CURRENT_TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
created_at text DEFAULT CURRENT_TIMESTAMP
);



INSERT INTO products (id, name, description, price_id, category_id, currency_id)
VALUES (1, "apple","This is an apple fruit", 1,1, 1),
		(2, "orange","This is an orange fruit", 2,1, 1),
		(3, "pumpkin","This is a Pumpkin fruit", 3,1, 1),
		(4, "Banana","This is a Banana fruit", 4,1, 1),
		(5, "watermelon","This is a watermelon fruit", 5,1, 1),
		(6, "zucchini","This is a Zucchini Vegetable", 6,1, 1),
		(7, "carrot","This is a carrot Vegetable", 7,1, 1),
		(8, "lettuce","This is a lettuce Vegetable", 8,1, 1);
		(9, "Stoven","This is a stoven", 9,3, 1);


INSERT INTO categories (id, name, category_id_recursive)
VALUES (1, "Pereshible", 1),
		(2, "Deli", 2),
		(3, "White line", 3),
		(4, "Beverage", 4),
		(5, "fruit", 1),
		(6, "Vegetable", 1);


INSERT INTO currency (id, name, dolar_compair)
VALUES (1, "Dolar US", 1),
		(2, "Dolar CA", 0.8),
		(3, "Real", 0.2),
		(4, "Euro", 1.5);


INSERT INTO price (id, value, item_id)
VALUES (1, 1, 1),
		(2, 1.2, 2),
		(3, 2.3, 3),
		(4, 0.55, 4),
		(5, 3.11, 5),
		(6, 1.21, 6),
		(7, 1.45, 7),
		(8, 5.43, 8),
		(9, 250, 9);


INSERT INTO costumers(id, name, nickName, email, address, phone)
VALUES (1, 'Jose Lucas', 'Ze', 'jln-ferreira@gmail.com', '130 keith rd', '123456789'),
	(2, 'Mariana', 'Mozao', 'm.vilela33@gmail.com', '130 keith rd', '987654321'),
	(3, 'Saygin', 'Say', 'Saygin@gmail.com', '202 grandville', '9788798798'),
	(4, 'Sina', 'sisi', 'sina@gmail.com', 'burnaby 221', '6876867876'),
	(5, 'Daniel', 'Dani', 'dani@gmail.com', 'delta 223', '505050505');


INSERT INTO invoice (id, costumer_id, name, invoice_data, due_date, value, isPaid, payMethod)
VALUES (1, 1, 'Jose Lucas', CURRENT_TIMESTAMP, '2019-11-20', 500, 0, 'CC'),
	(2, 2, 'Mariana', CURRENT_TIMESTAMP, '2019-11-22', 1200, 0, 'DC'),
	(3, 3, 'Saygin', CURRENT_TIMESTAMP, '2019-11-17', 103.5, 1, 'CC'),
	(4, 4, 'Sina', CURRENT_TIMESTAMP, '2019-11-12', 50, 0, 'DC'),
	(5, 1, 'Jose Lucas', CURRENT_TIMESTAMP, '2019-11-10', 86.88, 1, 'DC'),
	(6, 5, 'Daniel', CURRENT_TIMESTAMP, '2019-11-30', 79.8, 0, 'DC');


INSERT INTO invoice_Detail(id, invoice_id, product_id, product_qty)
VALUES (1, 1, 1, 60),
	(2, 1, 2, 90),
	(3, 1, 3, 50),
	(4, 1, 8, 40), 
	(5, 2, 1, 1200), 
	(6, 3, 6, 50),
	(7, 3, 7, 30), 
	(8, 4, 4, 10), 
	(9, 5, 8, 16), 
	(10, 6, 6, 30),
	(11, 6, 7, 30);


INSERT INTO card (id, costumer_id)
VALUES (1,1),
	(2,1),
	(3,2),
	(4,2),
	(5,3),
	(6,4),
	(7,5);

INSERT INTO card_detail (id, card_id, product_id, quantity, price, currency_id, total_Amount)
VALUES (1, 1, 1, 20, 1, 1, 20),
	(2, 2, 1, 15, 1, 1, 15),
	(3, 3, 2, 2, 1, 1, 2.4),
	(4, 4, 3, 54, 2.3, 1, 124.2),
	(5, 5, 9, 2, 250, 1, 500),
	(6, 2, 9, 1, 250, 1, 250),
	(7, 1, 7, 20, 1.45, 1, 29);


#query to see most product sales
SELECT P.name, PC.name, ID.product_qty, SUM(CD.total_Amount) as total_value
	FROM products P
	JOIN categories PC on P.category_id = PC.id
	JOIN invoice_Detail ID on P.id = ID.product_id
	JOIN card_detail CD  on P.id = CD.product_id
	GROUP BY P.name
	ORDER BY CD.total_Amount DESC;


