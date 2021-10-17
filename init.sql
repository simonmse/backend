CREATE DATABASE db_counter;
USE db_counter;

CREATE TABLE counter(id INTEGER PRIMARY KEY, value INTEGER);

CREATE USER 'mysql'@'10.0.0.2' IDENTIFIED BY 'mysql';
GRANT ALL PRIVILEGES ON db_counter.* TO 'mysql'@'10.0.0.2';
