create database LAB4;
use LAB4;


create table CATEDRATICOS
(
ID int primary key,
CodigoCatedratico int not null,
NombreCatedratico varchar (70) not null,
CursoCatedratico varchar (70) not null,
CorreoCatedratico varchar (100) not null,
HoraCatedratico varchar (10) not null
)Engine = InnoDB Default charset = Latin1 ;

create table ALUMNOS 
(
NumeroCarnet int primary Key,
NombreAlumno varchar(70) not null,
CorreoAlumno varchar (100) not null,
CarreraAlumno varchar (100) not null,
CicloAlumno int not null,
NotaAlumno int not null,
HorarioAlumno int not null,
IdAlumno int not null,
IdCurso int not null
#foreign key(IdCurso) references CURSOS(CodigoCurso),
#foreign key (IdAlumno) references SEDE (CodigoSede),
#foreign key (HorarioAlumno) references HORARIOS (NumeroHorario)
)Engine = InnoDB Default charset = Latin1 ;

