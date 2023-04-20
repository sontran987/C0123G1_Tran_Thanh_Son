CREATE DATABASE studentmanagement;
USE `studentmanagement`;
CREATE TABLE `classes` (
  `id` INT PRIMARY KEY,
  `name` VARCHAR(45) NULL);
  
  INSERT INTO classes VALUES
  (2,"Thanh"),
  (3,"Son");
  
  SELECT * FROM classes;
  
  CREATE TABLE `teachers`(
  `id` int PRIMARY KEY,
  `name` VARCHAR(45) NULL,
  `age` VARCHAR(45) NULL,
  `country` VARCHAR(45) NULL);