drop database if exists casino;
create database if not exists casino;
use casino;

create table if not exists cliente(
id_cliente int auto_increment primary key,
nombre_cliente varchar(50),
dni_cliente varchar(9),
edad int,
tarjeta boolean,
saldo decimal,
sexo enum('mujer','hombre')
);

create table if not exists crupier(
id_crupier int auto_increment primary key,
nombre_crupier varchar(50),
dni_crupier varchar(9),
id_fkjuego int not null 
);

create table if not exists juego(
id_juego int auto_increment primary key,
nombre_juego varchar(50),
id_CrupierAsignado int not null
);

create table if not exists clienteJuego(
id_cliente int,
id_juego int,
fecha date

);
alter table juego add foreign key fk_juego(id_CrupierAsignado) references crupier(id_crupier);
alter table crupier add foreign key fk_crupier(id_fkjuego) references juego(id_juego);
alter table clienteJuego add foreign key fk1_crupierJuego(id_cliente) references cliente(id_cliente);
alter table clienteJuego add foreign key fk2_crupierJuego(id_juego) references juego(id_juego);

delimiter $$

CREATE TRIGGER añadirFecha
BEFORE INSERT
ON clienteJuego FOR EACH ROW
BEGIN
	SET NEW.fecha = SYSDATE(); 
END $$ 

DELIMITER ; 

delimiter $$ 

CREATE PROCEDURE añadirSaldo(dineros DECIMAL, id int)
BEGIN
UPDATE cliente
SET saldo = saldo + dineros
WHERE id_cliente = id;

END $$

DELIMITER ;
INSERT INTO cliente (nombre_cliente, dni_cliente, edad, tarjeta, saldo, sexo)
VALUES ('Lucía Martínez', '12345678A', 28, TRUE, 100.00, 'mujer');
select * from cliente;