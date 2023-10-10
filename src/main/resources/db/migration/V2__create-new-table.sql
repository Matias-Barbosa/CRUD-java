create table clientes(

    id bigint not null auto_increment,
    nome varchar(100) not null,
    email varchar(100) not null unique,
    idade varchar(6) not null unique,
    tipoConta varchar(100) not null,
    dataNascimento varchar(255) not null,
    bairro varchar(100) not null,
    cep varchar(9) not null,
    complemento varchar(100),
    numero varchar(20),
    cidade varchar(100) not null,

    primary key(id)

);