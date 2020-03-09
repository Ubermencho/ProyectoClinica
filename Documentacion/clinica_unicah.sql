CREATE SCHEMA `clinica_unicah` ;
CREATE USER 'userClinica'@'localhost' IDENTIFIED WITH mysql_native_password BY 'clinica';
GRANT ALL ON clinica_unicah.* TO 'userClinica'@'localhost';

USE `clinica_unicah`;

CREATE TABLE `doctor` (
  `iddoctor` varchar(15) NOT NULL,
  `nombre_doctor` varchar(45) NOT NULL,
  `apellido_doctor` varchar(45) NOT NULL,
  `edad_doctor` varchar(45) NOT NULL,
  PRIMARY KEY (`iddoctor`),
  UNIQUE KEY `iddoctores_UNIQUE` (`iddoctor`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `carrera` (
  `idcarrera` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_carrera` varchar(45) NOT NULL,
  PRIMARY KEY (`idcarrera`),
  UNIQUE KEY `idcarrera_UNIQUE` (`idcarrera`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `medicamento` (
  `idmedicamento` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion_medicamento` varchar(100) NOT NULL,
  `tipo_medicamento` varchar(50) NOT NULL,
  PRIMARY KEY (`idmedicamento`),
  UNIQUE KEY `idmedicamento_UNIQUE` (`idmedicamento`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `paciente` (
  `idpaciente` varchar(15) NOT NULL,
  `idcarrera` varchar(30) NOT NULL,
  `nombre_paciente` varchar(30) NOT NULL,
  `apellido_paciente` int(11) NOT NULL,
  `edad_paciente` int(11) NOT NULL,
  PRIMARY KEY (`idpaciente`),
  UNIQUE KEY `idpaciente_UNIQUE` (`idpaciente`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `ata` (
  `idata` int(11) NOT NULL AUTO_INCREMENT,  
  `iddoctor` varchar(15) NOT NULL,
  `idmedicamento` int(11) NOT NULL,
  `nombre_paciente_ata` varchar(50) NOT NULL,
  `apellido_paciente_ata` varchar(50) NOT NULL,
  `edad_paciente_ata` int(11) NOT NULL,  
  `sintomas_paciente_ata` varchar(100) NOT NULL,
  `fecha_ata` date NOT NULL,
  PRIMARY KEY (`idata`),
  UNIQUE KEY `idata_UNIQUE` (`idata`),
  KEY `iddoctor_idx` (`iddoctor`),
  KEY `idmedicamento_idx` (`idmedicamento`),
  CONSTRAINT `iddoctor` FOREIGN KEY (`iddoctor`) REFERENCES `doctor` (`iddoctor`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `idmedicamento` FOREIGN KEY (`idmedicamento`) REFERENCES `medicamento` (`idmedicamento`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `expediente` (
  `idexpediente` varchar(10) NOT NULL,
  `idpaciente` varchar(13) NOT NULL,
  `fecha_expediente` datetime NOT NULL,
  `hora_ingreso` datetime NOT NULL,
  `hora_egreso` datetime NOT NULL,
  `sintoma_principal` varchar(50) NOT NULL,
  `hea` varchar(200) NOT NULL,
  `peso_paciente` double NOT NULL,
  `talla_paciente` double NOT NULL,
  `frecuencia_cardiaca_paciente` double NOT NULL,
  `frecuencia_respiratoria_paciente` double NOT NULL,
  `presion_arterial_paciente` double NOT NULL,
  `temperatura_paciente` double NOT NULL,
  `color_piel_paciente` varchar(15) NOT NULL,
  `llenado_capilar_paciente` varchar(15) NOT NULL,
  `datos_contribuyentes_paciente` varchar(250) NOT NULL,
  `diagnostico` varchar(250) NOT NULL,
  `tratamiento` varchar(250) NOT NULL,
  `interconsulta` varchar(250) NOT NULL,
  `comentario_adicional` varchar(250) NOT NULL,
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

CREATE TABLE `usuario` (
  `idusuario` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion_usuario` varchar(45) NOT NULL,
  `password_usuario` varchar(45) NOT NULL,
  `fecha_creacion_usuario` datetime NOT NULL,
  `fecha_ultimo_ingreso_usuario` datetime DEFAULT NULL,
  `idtipo_usuario` int(11) NOT NULL,
  PRIMARY KEY (`idusuario`),
  UNIQUE KEY `idusuario_UNIQUE` (`idusuario`),
  KEY `idtipo_usuario_idx` (`idtipo_usuario`),
  CONSTRAINT `idtipo_usuario` FOREIGN KEY (`idtipo_usuario`) REFERENCES `tipo_usuario` (`idtipo_usuario`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


