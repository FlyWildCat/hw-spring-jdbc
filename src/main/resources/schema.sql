CREATE SCHEMA IF NOT EXISTS homework;

CREATE TABLE IF NOT EXISTS homework.customers (
	id bigint not null generated always as identity primary key,
	name character(20),
	surname character(40),
	age smallint check(age>=0 and age<150),
	phone_number character(12)
);

CREATE TABLE IF NOT EXISTS homework.orders (
	id bigint not null generated always as identity primary key,
	"date" date,
	customers_id bigint references homework.customers,
	product_name character varying(255),
	amount double precision
);