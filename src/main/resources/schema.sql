create table product (
                         id integer not null,
                         description varchar(255),
                         name varchar(255),
                         price numeric(38,2),
                         product_id uuid,
                         primary key (id)
);