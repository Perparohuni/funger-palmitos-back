create table sistema (
	id bigserial primary key,
	nome varchar(255) not null,
	ativo boolean not null default true
);