drop database if exists testdb;
create database testdb;
use testdb;

create table test_table(
  user_id int,
  user_name varchar(50),
  password varchar(50)
);
