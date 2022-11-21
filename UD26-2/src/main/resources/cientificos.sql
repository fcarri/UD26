use cientificos;

drop table if exists asignado_a;
drop table if exists cientificos;
drop table if exists proyecto;

create table cientificos(dni varchar(8) not null, nomapels varchar(250),
primary key (dni))engine=innodb;

create table proyecto(id char(2) not null, nombre varchar(250), horas int,
primary key(id))engine=InnoDB;

create table asignado_a(cientifico varchar(8) not null, proyecto char(4),
primary key(cientifico), foreign key(cientifico) references cientificos(dni)
on delete cascade on update cascade,
foreign key(proyecto) references proyecto(id)
on delete cascade on update cascade)engine=innodb;

insert into cientificos values ("1234567A","Spock"),
("2234567A","James C. Maxwell"),
("3234567A","Albert Einstein"),("7234567A","Carl Sagan"),
("4234567A","Isaac Newton"),("8234567A","Spivak"),
("5234567A","Max Planck"),("9234567A","Bohr"),
("6234567A","Heisenberg"),("1234567B","Born");

insert into proyecto values ("1","A",10),("2","b",10),("3","c",10),("4","k",10),
("10","d",10),("9","e",10),("8","f",10),("7","g",10),("6","h",10),("5","i",10);

insert into asignado_a values ("1234567A","1"),("3234567A","3"),("2234567A","2"),
("7234567A","4"),("4234567A","5"),("8234567A","6"),("5234567A","7"),("9234567A","8"),
("6234567A","9"),("1234567B","10");