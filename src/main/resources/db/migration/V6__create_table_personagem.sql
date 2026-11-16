create table personagem (
	id bigserial primary key,
	usuario_id bigint not null references usuarios(id),
	nome varchar(128) not null,
	descricao_fisica text,
	historia text,
	observacoes text,
	ativo boolean default false
);
