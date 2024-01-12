
create database demo_spring_mvc;
use demo_spring_mvc;
create table category
(
    id     int auto_increment primary key,
    name   varchar(100) not null,
    status bit(1) default (1)

);

create table product
(
    id          int auto_increment primary key,
    name        varchar(150) not null,
    price       float        not null,
    category_id int          not null,
    foreign key (category_id) references category (id),
    image       varchar(255)
)