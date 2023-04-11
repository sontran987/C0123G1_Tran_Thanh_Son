CREATE DATABASE studentmanagement;
USE `studentmanagement`;
CREATE TABLE `class` (
  `id` INT PRIMARY KEY,
  `name` VARCHAR(45) NULL);
  CREATE TABLE `teacher`(
  `id` int PRIMARY KEY,
  `name` VARCHAR(45) NULL,
  `age` VARCHAR(45) NULL,
  `country` VARCHAR(45) NULL);