create table ficha_template (
	id bigserial primary key,
	sistema_id bigint not null references sistema(id),
	nome varchar(128) not null,
	ativo boolean not null
);