create table constancia(
	id_constancia INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    fecha VARCHAR(10) NOT NULL,
	titulo VARCHAR(30) NOT NULL,
    no_cuenta1 INT NOT NULL,
    
    FOREIGN KEY (no_cuenta1) references estudiante(no_Cuenta)
);

create table estudiante (
	no_cuenta INT PRIMARY KEY NOT NULL,
    nombre VARCHAR(20) NOT NULL,
    apellidos  VARCHAR(20) NOT NULL,
    correo VARCHAR(25) NOT NULL
);

select * from estudiante;

select * from constancia;

