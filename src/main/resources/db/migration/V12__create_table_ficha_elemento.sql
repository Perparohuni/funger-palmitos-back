create table ficha_elemento (
    id bigserial primary key,
    ficha_template_id bigint references ficha_template(id),
    ficha_id bigint references ficha(id),
    pos_x int not null check(pos_x >= 0),
    pos_y int not null check(pos_y >= 0),
    largura int not null check(largura >= 0),
    altura int not null check(altura >= 0),
    tipo varchar(45) not null,
    configuracao jsonb not null,
    valor jsonb not null,
    constraint CHECK_FICHA_ID check ((ficha_template_id is not null and ficha_id is null) or (ficha_template_id is null and ficha_id is not null ))
);