create table contador (
  id bigserial primary key,
  sistema_id bigint not null references sistema(id),
  nome varchar(128) not null,
  descricao text,
  maximo bigint,
  minimo bigint
);