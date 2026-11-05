create table usuario_campanha (
	id bigserial primary key,
	usuario_id bigint not null references usuarios(id),
	campanhas_id bigint not null references campanhas(id)
);