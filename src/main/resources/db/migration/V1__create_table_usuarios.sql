create table usuarios(
    id bigserial primary key,
    login varchar(60) not null unique,
    senha varchar(255) not null,
    mestre boolean not null
);