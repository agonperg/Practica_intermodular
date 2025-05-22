DROP DATABASE IF EXISTS casino;
CREATE DATABASE IF NOT EXISTS casino;
USE casino;

CREATE TABLE IF NOT EXISTS cliente(
    id_cliente INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
    nombre_cliente VARCHAR(50) NOT NULL,
    dni_cliente VARCHAR(9) NOT NULL,
    edad INT NOT NULL,
    tarjeta BOOLEAN NOT NULL,
    saldo DECIMAL NOT NULL,
    sexo ENUM('mujer','hombre') NOT NULL, 
    fecha DATE , 
    UNIQUE(dni_cliente)
);

CREATE TABLE IF NOT EXISTS crupier(
    id_crupier INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
    nombre_crupier VARCHAR(50) NOT NULL,
    dni_crupier VARCHAR(9) NOT NULL,
    id_fkjuego INT NOT NULL, 
    UNIQUE(dni_crupier)
);

CREATE TABLE IF NOT EXISTS juego(
    id_juego INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
    nombre_juego VARCHAR(50) NOT NULL,
    id_CrupierAsignado INT NOT NULL
);

CREATE TABLE IF NOT EXISTS clienteJuego(
    id_cliente INT NOT NULL,
    id_juego INT NOT NULL,
    fecha DATE
);

ALTER TABLE juego ADD FOREIGN KEY fk_juego(id_CrupierAsignado) REFERENCES crupier(id_crupier);
ALTER TABLE clienteJuego ADD FOREIGN KEY fk1_crupierJuego(id_cliente) REFERENCES cliente(id_cliente);
ALTER TABLE clienteJuego ADD FOREIGN KEY fk2_crupierJuego(id_juego) REFERENCES juego(id_juego);


