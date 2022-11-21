drop table if exists venta;
drop table if exists maquinas_registradoras;
drop table if exists cajeros;
drop table if exists productos;

create table cajeros(codigo int not null, nomapels varchar(255),
primary key(codigo));

create table productos(codigo int not null, nombre varchar(100),
precio int, primary key(codigo));

create table maquinas_registradoras(codigo int not null, piso int,
primary key(codigo));

create table venta(cajero int, maquina int, producto int,
primary key(cajero,maquina,producto),
foreign key(cajero) references cajeros(codigo)
on delete cascade on update cascade,
foreign key(maquina) references maquinas_registradoras(codigo)
on delete cascade on update cascade,
foreign key(producto) references productos(codigo)
on delete cascade on update cascade);

insert into cajeros (codigo, nomApels) values (1,"Albert"),(2,"Joan"),(3,"Carles"),(4,"Maria");

insert into productos (codigo, nombre, precio) values (10,"camisa",100),(20,"zapatos",200),(30,"reloj",120),
(40,"platos",50);

insert into maquinas_registradoras (codigo, piso) values (100,2),(101,4),(102,5),(103,2);

insert into venta (cajero, maquina, producto) values (1,100,10),(2,101,20),(2,102,20),(3,103,30);

