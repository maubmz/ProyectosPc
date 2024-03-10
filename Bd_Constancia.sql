CREATE SCHEMA sistemas_informacion;

use sistemas_informacion;

create table constancia(
	id_constancia INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    fecha VARCHAR(10) NOT NULL,
	titulo VARCHAR(30) NOT NULL
);

create table estudiante (
	no_cuenta INT PRIMARY KEY NOT NULL,
    nombre VARCHAR(20) NOT NULL,
    apellidos  VARCHAR(20) NOT NULL,
    correo VARCHAR(25) NOT NULL,
    id_constancia INT NOT NULL,
    
    foreign key (id_constancia) references constancia(id_constancia)
);

SELECT * FROM constancia;

SELECT * FROM estudiante;