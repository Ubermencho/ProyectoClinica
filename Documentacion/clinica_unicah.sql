CREATE DATABASE `clinica_unicah` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `clinica_unicah`;

CREATE TABLE `ata` (
  `idata` int(11) NOT NULL AUTO_INCREMENT,
  `idmedicamento` int(11) NOT NULL,
  `nombre_paciente_ata` varchar(50) NOT NULL,
  `carrera_paciente_ata` varchar(45) NOT NULL,
  `sintoma_paciente_ata` varchar(100) NOT NULL,
  PRIMARY KEY (`idata`),
  UNIQUE KEY `idata_UNIQUE` (`idata`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `carrera` (
  `idcarrera` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_carrera` varchar(45) NOT NULL,
  PRIMARY KEY (`idcarrera`),
  UNIQUE KEY `idcarrera_UNIQUE` (`idcarrera`)
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
  UNIQUE KEY `idexpediente_UNIQUE` (`idexpediente`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `medicamento` (
  `idmedicamento` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion_medicamento` varchar(100) NOT NULL,
  `tipo_medicamento` varchar(50) NOT NULL,
  PRIMARY KEY (`idmedicamento`),
  UNIQUE KEY `idmedicamento_UNIQUE` (`idmedicamento`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `paciente` (
  `idpaciente` varchar(13) NOT NULL,
  `idcarrera` varchar(30) NOT NULL,
  `nombre_paciente` varchar(30) NOT NULL,
  `apellido_paciente` int(11) NOT NULL,
  `edad_paciente` int(11) NOT NULL,
  PRIMARY KEY (`idpaciente`),
  UNIQUE KEY `idpaciente_UNIQUE` (`idpaciente`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
