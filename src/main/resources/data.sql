drop table if exists candidate;
drop table if exists employee;
drop table if exists position;

CREATE TABLE `candidate` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(50) ,
  `lastName` VARCHAR(50),
  `address` VARCHAR(250),
  `cellPhone` VARCHAR(50),
  `cityName` VARCHAR(30),
  PRIMARY KEY (id)
);


insert into candidate(name,lastName,address,cellPhone,cityName)
  values('Joao','Gonzalez','caracas','04143116630','Caracas'),
  ('Maria','Comesana','caracas','04874563210','Caracas'),
  ('Katherine','Merino','caracas','01234569857','Caracas');

  
CREATE TABLE `employee` (
  `id` int NOT NULL AUTO_INCREMENT,
  `person` VARCHAR(50) ,
  `position` VARCHAR(50),
  `salary` VARCHAR(250),
  PRIMARY KEY (id)
);


insert into employee(person,position,salary)
  values('Joao','dev','2000'),
  ('Maria','ceo','3000'),
  ('Katherine','Manager','1500');
  
  CREATE TABLE `position` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(50) ,
  PRIMARY KEY (id)
);


insert into position(name)
  values('dev'),
  ('ceo'),
  ('Manager');
  