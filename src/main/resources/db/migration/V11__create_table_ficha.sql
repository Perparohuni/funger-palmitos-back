create table ficha (
   id bigserial primary key,
   nome varchar(128) not null,
   ficha_template_id bigint not null references ficha_template(id),
   usuario_id bigint not null references usuarios(id),
   ativo boolean not null default true
);