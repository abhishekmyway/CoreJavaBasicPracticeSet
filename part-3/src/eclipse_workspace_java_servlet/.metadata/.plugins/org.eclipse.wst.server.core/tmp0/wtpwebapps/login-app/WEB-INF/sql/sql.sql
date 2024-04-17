drop database if exists 'abc';
create database abc;
use abc;
create table abc(username varchar(9),
		 password varchar(9)			
);
insert into abc(username,password) values('madhu','latha');
insert into abc(username,password) values('sunny','suneel');