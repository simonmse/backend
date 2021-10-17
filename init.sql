CREATE DATABASE db_counter;
USE db_counter;

CREATE TABLE counter(id INTEGER PRIMARY KEY, value INTEGER);

CREATE USER 'mysql'@'%';
GRANT ALL PRIVILEGES ON `db_counter` . * TO 'mysql'@'%';s
