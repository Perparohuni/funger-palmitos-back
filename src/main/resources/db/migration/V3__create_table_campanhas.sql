create table campanhas (
	id bigserial primary key,
	nome varchar(255) not null,
	descricao text,
	ativo boolean not null,
	id_sistema bigint not null,
	constraint FK_CAMPANHA_SISTEMA foreign key (id_sistema) references sistema(id)
);