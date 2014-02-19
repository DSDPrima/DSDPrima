DSDPrima
========

Contrato_Afiliacion

CREATE TABLE IF NOT EXISTS contratoafiliacion (
  NroFormulario int(11) NOT NULL DEFAULT '' ,
  FechaSuscripcion varchar(45) NOT NULL DEFAULT '' ,
  TipoDocumento varchar(45) NOT NULL DEFAULT '' ,
  NroDocumento varchar(45) NOT NULL DEFAULT '' ,
  CodigoPromotor varchar(45) NOT NULL DEFAULT '' ,
  PrimerNombre varchar(45) NOT NULL DEFAULT '' ,
  SegundoNombre varchar(45) ,
  ApellidoPaterno varchar(45) NOT NULL DEFAULT '' ,
  ApellidoMaterno varchar(45) NOT NULL DEFAULT '' ,
  DepartamentoNacimiento varchar(45) NOT NULL DEFAULT '' ,
  ProvinciaNacimiento varchar(45) NOT NULL DEFAULT '' ,
  DistritoNacimiento varchar(45) NOT NULL DEFAULT '' ,
  Direccion varchar(45) NOT NULL DEFAULT '' ,
  Departamento varchar(45) NOT NULL DEFAULT '' ,
  Provincia varchar(45) NOT NULL DEFAULT '' ,
  Distrito varchar(45) NOT NULL DEFAULT '' ,
  Referencia varchar(45) ,
  Telefono varchar(45) NOT NULL DEFAULT '' ,
  Ruc varchar(11) ,
  Descripcion varchar(45) ,
  RAM int(11) ,
  rptaestado char(3) DEFAULT 'PEN' ,
  rptaobservacion varchar(250) DEFAULT ' ' ,
  Profesion varchar(45) ,
  FechaInicioLaboral varchar(45) ,
  EstadoCivil varchar(45) ,
  Celular varchar(45) ,
  TelefonoOficina varchar(45) ,
  Anexo varchar(4) ,
  NroHijos varchar(2) ,
  DireccionPreferencia varchar(45) ,
  rptafecha datetime ,
  TipoPreferenciaDireccion varchar(45) ,
  ReferenciaS varchar(45) ,
  DepartamentoS varchar(45) ,
  ProvinciaS varchar(45) ,
  DistritoS varchar(45) ,
  rptaCuspp varchar(12) ,
  EstadoAfiliacion char(1) ,
  PRIMARY KEY (NroFormulario)
);