CREATE SCHEMA `clinica_unicah` ;
CREATE USER 'userClinica'@'localhost' IDENTIFIED BY 'clinica';
GRANT ALL ON clinica_unicah.* TO 'userClinica'@'localhost';

USE `clinica_unicah`;

CREATE TABLE `estado` (
  `idestado` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion_estado` varchar(45) NOT NULL,
  PRIMARY KEY (`idestado`),
  UNIQUE KEY `idestado_UNIQUE` (`idestado`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO `clinica_unicah`.`estado` (`descripcion_estado`) VALUES ('Activo');
INSERT INTO `clinica_unicah`.`estado` (`descripcion_estado`) VALUES ('Inactivo');

CREATE TABLE `doctor` (
  `iddoctor` varchar(15) NOT NULL,
  `nombre_doctor` varchar(45) NOT NULL,
  `apellido_doctor` varchar(45) NOT NULL,
  `edad_doctor` varchar(45) NOT NULL,
  `idestado` int(11) NOT NULL,
  PRIMARY KEY (`iddoctor`),
  UNIQUE KEY `iddoctores_UNIQUE` (`iddoctor`),
  KEY `idestado_doctor_idx` (`idestado`),
  CONSTRAINT `idestado_doctor` FOREIGN KEY (`idestado`) REFERENCES `estado` (`idestado`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `carrera` (
  `idcarrera` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_carrera` varchar(45) NOT NULL,
  PRIMARY KEY (`idcarrera`),
  UNIQUE KEY `idcarrera_UNIQUE` (`idcarrera`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO `clinica_unicah`.`carrera` (`nombre_carrera`) VALUES ('No Definido');
INSERT INTO `clinica_unicah`.`carrera` (`nombre_carrera`) VALUES ('Ingeniería en Ciencias de la Computación');
INSERT INTO `clinica_unicah`.`carrera` (`nombre_carrera`) VALUES ('Ingeniería Civil');
INSERT INTO `clinica_unicah`.`carrera` (`nombre_carrera`) VALUES ('Ingeniería Industrial');
INSERT INTO `clinica_unicah`.`carrera` (`nombre_carrera`) VALUES ('Ingeniería Ambiental');
INSERT INTO `clinica_unicah`.`carrera` (`nombre_carrera`) VALUES ('Arquitectura');
INSERT INTO `clinica_unicah`.`carrera` (`nombre_carrera`) VALUES ('Licenciatura en Gestión Estratégica de Empres');
INSERT INTO `clinica_unicah`.`carrera` (`nombre_carrera`) VALUES ('Licenciatura en Finanzas');
INSERT INTO `clinica_unicah`.`carrera` (`nombre_carrera`) VALUES ('Mercadotecnia');
INSERT INTO `clinica_unicah`.`carrera` (`nombre_carrera`) VALUES ('Derecho');
INSERT INTO `clinica_unicah`.`carrera` (`nombre_carrera`) VALUES ('Ciencias de la Comunicación');
INSERT INTO `clinica_unicah`.`carrera` (`nombre_carrera`) VALUES ('Licenciatura en Teología');
INSERT INTO `clinica_unicah`.`carrera` (`nombre_carrera`) VALUES ('Medicina');
INSERT INTO `clinica_unicah`.`carrera` (`nombre_carrera`) VALUES ('Odontología');
INSERT INTO `clinica_unicah`.`carrera` (`nombre_carrera`) VALUES ('Enfermería');
INSERT INTO `clinica_unicah`.`carrera` (`nombre_carrera`) VALUES ('Psicología');


CREATE TABLE `medicamento` (
  `idmedicamento` varchar(45) NOT NULL,
  `descripcion_medicamento` varchar(100) NOT NULL,
  `tipo_medicamento` varchar(50) NOT NULL,
  `idestado` int(11) NOT NULL,
  PRIMARY KEY (`idmedicamento`),
  UNIQUE KEY `idmedicamento_UNIQUE` (`idmedicamento`),
  KEY `idestado_med_idx` (`idestado`),
  CONSTRAINT `idestado_med` FOREIGN KEY (`idestado`) REFERENCES `estado` (`idestado`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `paciente` (
  `idpaciente` varchar(15) NOT NULL,
  `idcarrera` int(11) NOT NULL,
  `nombre_paciente` varchar(30) NOT NULL,
  `apellido_paciente` varchar(30) NOT NULL,
  `edad_paciente` int(11) NOT NULL,
  `genero_paciente` varchar(10) NOT NULL,
  `idestado` int(11) NOT NULL,
  PRIMARY KEY (`idpaciente`),
  UNIQUE KEY `idpaciente_UNIQUE` (`idpaciente`),
  KEY `idcarrera_idx` (`idcarrera`),
  KEY `idcarrera_idcarrera` (`idcarrera`),
  KEY `idestado_paciente_idx` (`idestado`),
  CONSTRAINT `idcarreraPaciente` FOREIGN KEY (`idcarrera`) REFERENCES `carrera` (`idcarrera`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `idestado_paciente` FOREIGN KEY (`idestado`) REFERENCES `estado` (`idestado`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `ata` (
  `idata` int(11) NOT NULL AUTO_INCREMENT,
  `iddoctor` varchar(15) NOT NULL,
  `nombre_paciente_ata` varchar(50) NOT NULL,
  `apellido_paciente_ata` varchar(50) NOT NULL,
  `edad_paciente_ata` int(11) NOT NULL,
  `idcarrera` int(11) NOT NULL,
  `sintomas_paciente_ata` varchar(100) NOT NULL,
  `fecha_ata` date NOT NULL,
  PRIMARY KEY (`idata`),
  UNIQUE KEY `idata_UNIQUE` (`idata`),
  KEY `iddoctor_idx` (`iddoctor`),
  KEY `idcarrera` (`idcarrera`),
  CONSTRAINT `idcarrera` FOREIGN KEY (`idcarrera`) REFERENCES `carrera` (`idcarrera`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `iddoctor` FOREIGN KEY (`iddoctor`) REFERENCES `doctor` (`iddoctor`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `ata_medicamentos` (
  `idmedicamento` varchar(45) NOT NULL,
  `idata` int(11) NOT NULL,
  PRIMARY KEY (`idmedicamento`,`idata`),
  KEY `idata` (`idata`),
  CONSTRAINT `idata` FOREIGN KEY (`idata`) REFERENCES `ata` (`idata`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `idmedicamento` FOREIGN KEY (`idmedicamento`) REFERENCES `medicamento` (`idmedicamento`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `expediente` (
  `idexpediente` int(11) NOT NULL AUTO_INCREMENT,
  `idpaciente` varchar(15) NOT NULL,
  `fecha_expediente` datetime NOT NULL,
  `hora_ingreso` datetime NOT NULL,
  `hora_egreso` datetime NOT NULL,
  `sintoma_principal` varchar(50) NOT NULL,
  `hea` varchar(300) NOT NULL,
  `peso_paciente` double NOT NULL,
  `talla_paciente` double NOT NULL,
  `glasgow` double NOT NULL,
  `frecuencia_cardiaca_paciente` varchar(15) NOT NULL,
  `frecuencia_respiratoria_paciente` varchar(15) NOT NULL,
  `presion_arterial_paciente` varchar(15) NOT NULL,
  `temperatura_paciente` varchar(15) NOT NULL,
  `color_piel_paciente` varchar(15) NOT NULL,
  `llenado_capilar_paciente` varchar(15) NOT NULL,
  `datos_contribuyentes_paciente` varchar(250) NOT NULL,
  `diagnostico` varchar(300) NOT NULL,
  `tratamiento` varchar(300) NOT NULL,
  `interconsulta` varchar(300) NOT NULL,
  `comentario_adicional` varchar(300) NOT NULL,
  PRIMARY KEY (`idexpediente`),
  UNIQUE KEY `idexpediente_UNIQUE` (`idexpediente`),
  KEY `idpaciente_idx` (`idpaciente`),
  CONSTRAINT `idpaciente_expediente` FOREIGN KEY (`idpaciente`) REFERENCES `paciente` (`idpaciente`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `tipo_usuario` (
  `idtipo_usuario` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion_tipo_usuario` varchar(45) NOT NULL,
  PRIMARY KEY (`idtipo_usuario`),
  UNIQUE KEY `idtipo_usuario_UNIQUE` (`idtipo_usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO `clinica_unicah`.`tipo_usuario` (`descripcion_tipo_usuario`) VALUES ('Administrador');
INSERT INTO `clinica_unicah`.`tipo_usuario` (`descripcion_tipo_usuario`) VALUES ('Usuario Normal');

CREATE TABLE `usuario` (
  `idusuario` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion_usuario` varchar(45) NOT NULL,
  `password_usuario` varchar(45) NOT NULL,
  `fecha_creacion_usuario` datetime NOT NULL,
  `fecha_ultimo_ingreso_usuario` datetime DEFAULT NULL,
  `idtipo_usuario` int(11) NOT NULL,
  `idestado` int(11) NOT NULL,
  PRIMARY KEY (`idusuario`),
  UNIQUE KEY `idusuario_UNIQUE` (`idusuario`),
  KEY `idtipo_usuario_idx` (`idtipo_usuario`),
  KEY `idestado_usuario_idx` (`idestado`),
  CONSTRAINT `idestado_usuario` FOREIGN KEY (`idestado`) REFERENCES `estado` (`idestado`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `idtipo_usuario` FOREIGN KEY (`idtipo_usuario`) REFERENCES `tipo_usuario` (`idtipo_usuario`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO `clinica_unicah`.`usuario` (`descripcion_usuario`,`password_usuario`,`fecha_creacion_usuario`,`idtipo_usuario`,`idestado`)
VALUES ('admin', 'admin', NOW(), 1, 1);