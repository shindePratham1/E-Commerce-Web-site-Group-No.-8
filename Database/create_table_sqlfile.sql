#all create commands

create table customer_table (
customer_id int not null,
customer_firstName varchar(20) not null,
customer_lastName varchar(20) not null,
customer_userName varchar(20) not null,
customer_password varchar(20) not null,
customer_address varchar(20) not null,
customer_mobileNo varchar(20) not null unique,
customer_email varchar(20) not null unique,
customer_city varchar(20) not null,
customer_pincode int not null,
primary key(customer_id)
);

create table vendor_table(
vendor_id int not null,
vendor_firstName varchar(20) not null,
vendor_lastName varchar(20) not null,
vendor_userName varchar(20) not null,
vendor_shopName varchar(20) not null,
vendor_mobileNo varchar(20) not null,
vendor_address varchar(20) not null,
vendor_password varchar(20) not null,
vendor_email varchar(20) not null unique,
vendor_licenseNo varchar(20) not null unique,
vendor_adharCard varchar(20) not null unique,
primary key(vendor_id)
);

create table product_table(
product_id int not null,
product_name varchar(20) not null,
product_category varchar(20) not null,
product_pricePerQuantity varchar(20) not null,
product_quantity varchar(20) not null,
product_description varchar(50) not null,
product_image varchar(20) not null,
primary key(product_id)
);

create table orders_table(
orders_id int not null,
customer_id int not null,
orders_status varchar(20) not null,
orders_totalCost int not null,
orders_date date not null,
payment_status varchar(20) not null,
ordered_product_id int not null,
primary key(orders_id),
foreign key(customer_id) references customer_table(customer_id),
foreign key(ordered_product_id) references ordered_product_table(ordered_product_id)
);

create table ordered_product_table(
ordered_product_id int not null,
product_id int not null,
product_quantity int not null,
product_cost int not null,
primary key(ordered_product_id),
foreign key (product_id) references product_table(product_id)
);

create table delivery_boy(
delivery_boy_id int not null,
delivery_boy_firstName varchar(20) not null,
delivery_boy_lastName varchar(20) not null,
delivery_boy_userName varchar(20) not null,
delivery_boy_password varchar(20) not null,
delivery_boy_mobileNo varchar(20) not null,
delivery_boy_address varchar(20) not null,
orders_id int not null ,
primary key(delivery_boy_id),
foreign key(orders_id) references orders_table(orders_id)
);

create table feedback_table(
feedback_id int not null ,
ordered_product_id int not null,
customer_id int not null,
feedback_in_rating int check (feedback_in_rating<=5),
feedback_in_comment varchar(100) ,
feedback_date date not null,
Feedback_time varchar(100)  default (curtime()) ,
foreign key(ordered_product_id) references ordered_product_table(ordered_product_id),
foreign key(customer_id) references customer_table(customer_id)
);