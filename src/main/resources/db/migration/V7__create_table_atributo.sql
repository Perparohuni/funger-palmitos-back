create table atributo (
	id bigserial primary key,
	sistema_id bigint not null references sistema(id),
	nome varchar(128) not null,
	descricao text,
	maximo bigint,
	minimo bigint,
	tipo_dado varchar(45),
	valor_minimo_dado bigint default 1,
	valor_maximo_dado bigint not null
);