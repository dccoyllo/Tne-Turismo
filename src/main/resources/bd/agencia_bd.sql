create database turismo_bd;
use turismo_bd;

create table user_perfil (
id_perfil int primary key not null,
nombre varchar(50) not null
);
insert into user_perfil
values
(1, "perfil admin"),
(2, "perfil agencia"),
(3, "perfil usuario");

create table usuario(
cuenta varchar (45) primary key not null,
clave varchar(45) not null,
nombre_cuenta varchar(45) not null,
nombre varchar(45) null,
apellido varchar(45) null,
email varchar(60) not null,
user_img varchar(100) null,
fecha_creacion date not null,
user_codigo_verifi varchar(45) null,

id_perfil int not null, 
constraint FK_perfil_usuario foreign key(id_perfil)
references user_perfil(id_perfil)
);
insert into usuario
value
("derep", "12345", "derep", null, null, "diske@hotmail.com", null, curdate(), null, 3),
("lorem", "12345", "lorem", null, null, "ipsus@hotmail.com", null, curdate(), null, 2);
INSERT INTO `turismo_bd`.`usuario` (`cuenta`, `clave`, `nombre_cuenta`, `email`, `fecha_creacion`, `id_perfil`) VALUES ('jhon', '12345', 'jhon', 'jhon@hotmail.com', '2020-09-09', '2');
INSERT INTO `turismo_bd`.`usuario` (`cuenta`, `clave`, `nombre_cuenta`, `email`, `fecha_creacion`, `id_perfil`) VALUES ('gabriela', '12345', 'gabriela', 'gabriela@hotmail.con', '2020-09-09', '2');
INSERT INTO `turismo_bd`.`usuario` (`cuenta`, `clave`, `nombre_cuenta`, `email`, `fecha_creacion`, `id_perfil`) VALUES ('esmeralda', '12345', 'esmeralda', 'esmeralda@hotmail.com', '2020-09-09', '2');
INSERT INTO `turismo_bd`.`usuario` (`cuenta`, `clave`, `nombre_cuenta`, `email`, `fecha_creacion`, `id_perfil`) VALUES ('piero', '12345', 'piero', 'piero@gmail.com', '2020-09-09', '2');
INSERT INTO `turismo_bd`.`usuario` (`cuenta`, `clave`, `nombre_cuenta`, `email`, `fecha_creacion`, `id_perfil`) VALUES ('carmen', '12345', 'carmen', 'carmen@gmail.com', '2020-09-09', '2');
INSERT INTO `turismo_bd`.`usuario` (`cuenta`, `clave`, `nombre_cuenta`, `email`, `fecha_creacion`, `id_perfil`) VALUES ('nataly', '12345', 'nataly', 'nataly@gmail.com', '2020-09-09', '2');
INSERT INTO `turismo_bd`.`usuario` (`cuenta`, `clave`, `nombre_cuenta`, `email`, `fecha_creacion`, `id_perfil`) VALUES ('luis', '12345', 'luis', 'luis@gmail.com', '2020-09-09', '2');
INSERT INTO `turismo_bd`.`usuario` (`cuenta`, `clave`, `nombre_cuenta`, `email`, `fecha_creacion`, `id_perfil`) VALUES ('cesar', '12345', 'cesar', 'cesar@gmail.com', '2020-09-09', '2');
INSERT INTO `turismo_bd`.`usuario` (`cuenta`, `clave`, `nombre_cuenta`, `email`, `fecha_creacion`, `id_perfil`) VALUES ('koraly', '12345', 'koraly', 'koraly@gmail.com', '2020-09-09', '2');
INSERT INTO `turismo_bd`.`usuario` (`cuenta`, `clave`, `nombre_cuenta`, `email`, `fecha_creacion`, `id_perfil`) VALUES ('thalia', '12345', 'thalia', 'thalia@gmail.com', '2020-09-09', '3');
INSERT INTO `turismo_bd`.`usuario` (`cuenta`, `clave`, `nombre_cuenta`, `email`, `fecha_creacion`, `id_perfil`) VALUES ('leydi', '12345', 'leydi', 'leydi@gmail.com', '2020-09-09', '3');
INSERT INTO `turismo_bd`.`usuario` (`cuenta`, `clave`, `nombre_cuenta`, `email`, `fecha_creacion`, `id_perfil`) VALUES ('amanda', '12345', 'amanda', 'amanda@gmail.com', '2020-09-09', '3');
INSERT INTO `turismo_bd`.`usuario` (`cuenta`, `clave`, `nombre_cuenta`, `email`, `fecha_creacion`, `id_perfil`) VALUES ('jose', '12345', 'jose', 'jose@gmail.com', '2020-09-09', '3');
INSERT INTO `turismo_bd`.`usuario` (`cuenta`, `clave`, `nombre_cuenta`, `email`, `fecha_creacion`, `id_perfil`) VALUES ('amador', '12345', 'amador', 'amador@gmail.com', '2020-09-09', '3');
INSERT INTO `turismo_bd`.`usuario` (`cuenta`, `clave`, `nombre_cuenta`, `email`, `fecha_creacion`, `id_perfil`) VALUES ('naruto', '12345', 'naruto', 'naruto@gmail.com', '2020-09-09', '3');
INSERT INTO `turismo_bd`.`usuario` (`cuenta`, `clave`, `nombre_cuenta`, `email`, `fecha_creacion`, `id_perfil`) VALUES ('angel ', '12345', 'angel', 'angel@gmail.com', '2020-09-09', '3');
INSERT INTO `turismo_bd`.`usuario` (`cuenta`, `clave`, `nombre_cuenta`, `email`, `fecha_creacion`, `id_perfil`) VALUES ('esaul', '12346', 'esaul', 'esaul@gmail.com', '2020-09-09', '3');
INSERT INTO `turismo_bd`.`usuario` (`cuenta`, `clave`, `nombre_cuenta`, `email`, `fecha_creacion`, `id_perfil`) VALUES ('pabel', '12345', 'pabel', 'pabel@gmail.com', '2020-09-09', '3');
INSERT INTO `turismo_bd`.`usuario` (`cuenta`, `clave`, `nombre_cuenta`, `email`, `fecha_creacion`, `id_perfil`) VALUES ('mercedes', '12345', 'mercedes', 'mercedes@gmail.com', '2020-09-09', '3');


create table user_cliente(
cuenta varchar(45) not null primary key,
edad varchar(3) null,
sexo varchar(1) null, 
constraint Fk_usuario_user_cliente foreign key(cuenta)
references usuario(cuenta)
);
insert into user_cliente
value
("derep", null, null);
INSERT INTO `turismo_bd`.`user_cliente` (`cuenta`) VALUES ('lorem');
INSERT INTO `turismo_bd`.`user_cliente` (`cuenta`) VALUES ('amador');
INSERT INTO `turismo_bd`.`user_cliente` (`cuenta`) VALUES ('amanda');
INSERT INTO `turismo_bd`.`user_cliente` (`cuenta`) VALUES ('esaul');
INSERT INTO `turismo_bd`.`user_cliente` (`cuenta`) VALUES ('esmeralda');
INSERT INTO `turismo_bd`.`user_cliente` (`cuenta`) VALUES ('gabriela');
INSERT INTO `turismo_bd`.`user_cliente` (`cuenta`) VALUES ('jhon');
INSERT INTO `turismo_bd`.`user_cliente` (`cuenta`) VALUES ('jose');
INSERT INTO `turismo_bd`.`user_cliente` (`cuenta`) VALUES ('koraly');
INSERT INTO `turismo_bd`.`user_cliente` (`cuenta`) VALUES ('leydi');
INSERT INTO `turismo_bd`.`user_cliente` (`cuenta`) VALUES ('luis');
INSERT INTO `turismo_bd`.`user_cliente` (`cuenta`) VALUES ('mercedes');
INSERT INTO `turismo_bd`.`user_cliente` (`cuenta`) VALUES ('naruto');
INSERT INTO `turismo_bd`.`user_cliente` (`cuenta`) VALUES ('nataly');
INSERT INTO `turismo_bd`.`user_cliente` (`cuenta`) VALUES ('pabel');
INSERT INTO `turismo_bd`.`user_cliente` (`cuenta`) VALUES ('piero');
INSERT INTO `turismo_bd`.`user_cliente` (`cuenta`) VALUES ('thalia');

create table user_agencia(
cuenta varchar (45) primary key not null,
nombre varchar(45) not null,
ruc varchar(11) not null,
imagen varchar(100) null,
direccion varchar(45) null,
telefono varchar(9) null,
descripcion varchar(500) null,

constraint Fk_usuario_user_agencia foreign key(cuenta)
references usuario(cuenta)
);
insert into user_agencia
value
("lorem", "Mi agencia", "12121218987", null, null, null, null);
INSERT INTO `turismo_bd`.`user_agencia` (`cuenta`, `nombre`, `ruc`) VALUES ('carmen', 'tours viaje', '12154545453');
INSERT INTO `turismo_bd`.`user_agencia` (`cuenta`, `nombre`, `ruc`) VALUES ('cesar', 'aventura', '59845654521');
INSERT INTO `turismo_bd`.`user_agencia` (`cuenta`, `nombre`, `ruc`) VALUES ('esmeralda', 'esmeralda tours', '66568465488');
INSERT INTO `turismo_bd`.`user_agencia` (`cuenta`, `nombre`, `ruc`) VALUES ('gabriela', 'gabriela tours', '88785876856');
INSERT INTO `turismo_bd`.`user_agencia` (`cuenta`, `nombre`, `ruc`) VALUES ('jhon', 'ayacucho tours', '15684156865');
INSERT INTO `turismo_bd`.`user_agencia` (`cuenta`, `nombre`, `ruc`) VALUES ('koraly', 'mis viajes', '66666644845');
INSERT INTO `turismo_bd`.`user_agencia` (`cuenta`, `nombre`, `ruc`) VALUES ('luis', 'tours aventura', '57894567685');
INSERT INTO `turismo_bd`.`user_agencia` (`cuenta`, `nombre`, `ruc`) VALUES ('nataly', 'sufre tours', '45465848644');
INSERT INTO `turismo_bd`.`user_agencia` (`cuenta`, `nombre`, `ruc`) VALUES ('piero', 'comenta tours', '54846856446');

create table tipo_red_social(
id_tipo_social int primary key not null,
nombre varchar(45) not null,
icono varchar(45) not null
);
insert into tipo_red_social
values
(1, "Facebook", "icon-facebook"),
(2, "Youtube", "icon-youtube"),
(3, "Instagram", "icon-instagram"),
(4, "Twitter", "icon-twitter"),
(5, "Google", "icon-google");

create table red_social(
id_red_social int primary key not null,
enlace varchar(200) not null,
id_tipo_social int not null,
cuenta varchar(45) not null,
constraint Fk_tipo_red_social_red_social foreign key(id_tipo_social)
references tipo_red_social(id_tipo_social),
constraint Fk_red_social_user_agencia foreign key(cuenta)
references user_agencia(cuenta)
 );
 
 
 create table multimedia_lugar(
 id_multimedia int primary key not null,
 ubicacion varchar(45) not null
 );
 
 create table galeria_lugar(
 id_galeria_lugar int primary key Not null,
 nombre varchar(45) not null,
 fecha_creacion date not null,
 id_multimedia int not null,
 constraint Fk_multimedia_lugar_galeria_lugar_ foreign key(id_multimedia)
references multimedia_lugar(id_multimedia)
 );
 create table lugar_turistico(
 id_lugar int primary key not null,
 nombre varchar(45) not null,
 imagen varchar(100) null,
 descripcion varchar(500) not null,
 ubicacion varchar(45) not null,
 id_galeria_lugar int not null,
 cuenta varchar(45) not null,
 constraint Fk_galeria_lugar_lugar_turistico foreign key(id_galeria_lugar)
references galeria_lugar(id_galeria_lugar),
constraint Fk_user_agencia_lugar_turistico foreign key(cuenta)
references user_agencia(cuenta)
 );
 
 create table categoria_tour(
 id_categoria varchar(45) primary key not null,
 nombre varchar(45) not null
 );
 insert into categoria_tour
 values
 (1, "cat-01"),
 (2, "cat-02"),
 (3, "cat-03"),
 (4, "cat-04"),
 (5, "cat-05"),
 (6, "cat-06");
UPDATE `turismo_bd`.`categoria_tour` SET `nombre` = 'treikking ' WHERE (`id_categoria` = '1');
UPDATE `turismo_bd`.`categoria_tour` SET `nombre` = 'city tours' WHERE (`id_categoria` = '2');
UPDATE `turismo_bd`.`categoria_tour` SET `nombre` = 'Naturaleza' WHERE (`id_categoria` = '3');
UPDATE `turismo_bd`.`categoria_tour` SET `nombre` = 'zonas arqueologicas' WHERE (`id_categoria` = '4');
UPDATE `turismo_bd`.`categoria_tour` SET `id_categoria` = '6', `nombre` = 'museo' WHERE (`id_categoria` = '6');
UPDATE `turismo_bd`.`categoria_tour` SET `nombre` = 'deporte extremo' WHERE (`id_categoria` = '5');

 
 create table tour (
 id_tour int primary key not null auto_increment,
 nombre varchar(45) not null,
 imagen varchar(100) null,
 precio float not null,
 descripcion varchar(500) null,
 hora_salida datetime not null,
 guiador_nombre varchar(100) null,
 fecha_creacion date not null,
 cuenta varchar(45) not null,
 id_categoria varchar(45) not null,
 constraint fk_categoria_tour foreign key(id_categoria)
 references categoria_tour(id_categoria),
 constraint Fk_user_agencia_tour foreign key(cuenta)
 references user_agencia(cuenta)
 );
 insert into tour
 value(1, "Mata la Che", null, 45, null, current_timestamp(), null, current_date(), "lorem", 2);
 
 
 create table multimedia_tour (
 id_multimedia varchar(45) primary key not null,
 ubicacion varchar(45) not null
 );
 
 create table galeria_tour (
 id_galeria varchar(45) primary key not null,
 nombre varchar(45) not null,
 fecha_creacion date not null,
 
 id_multimedia varchar(45) not null,
 constraint Fk_multimedia_tour_galeria_tour foreign key(id_multimedia)
 references multimedia_tour(id_multimedia),
 id_tour int not null,
 constraint Fk_tour_galeria_tour foreign key(id_tour)
 references tour(id_tour)
 );
 
 create table resena(
 id_resena int primary key not null,
 descripcion varchar(500) not null,
 estrellas int not null,
 id_tour int not null,
 constraint Fk_tour_resena foreign key(id_tour)
references tour(id_tour)
 );
 
 create table cantida_reservarcion(
 id_cantidad_reservacion int primary key not null,
 total float not null,
 disponible float not null,
 id_tour int not null,
 constraint Fk_tour_cantidad_reservacion foreign key(id_tour)
references tour(id_tour)
 );
 
 create table reservacion (
 id_reservacion int primary key not null,
 dni varchar(8) not null,
 nombre varchar(45) not null, 
 apellido varchar(45) not null,
 edad int not null,
 fecha_partida date not null,
 fecha_reservacion date not null,
 cantidad int not null,
 id_tour int not null,
 constraint Fk_tour_reservacion foreign key(id_tour)
 references tour(id_tour)
 );
 
 
 create view vredsocial
 as
 select * from tipo_red_social;
 
 create view viewagencia
 as
 select * from user_agencia;