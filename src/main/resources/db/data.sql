Create database myBoard;
use myBoard;


create table board(
id int auto_increment primary key,
name varchar(20)not null,
title varchar(20)not null,
content varchar(20)not null,
created_at timestamp
);