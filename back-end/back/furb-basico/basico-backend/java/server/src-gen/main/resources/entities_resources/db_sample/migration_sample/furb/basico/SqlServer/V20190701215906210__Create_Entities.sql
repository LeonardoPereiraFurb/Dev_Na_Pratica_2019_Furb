/* Database: SqlServer. Generation date: 2019-07-01 21:59:06:210 */
/* Entity Genero */
create table genero (
	id UNIQUEIDENTIFIER NOT NULL,
	nome VARCHAR(255) NOT NULL,
	descricao VARCHAR(255) NOT NULL,
	filme UNIQUEIDENTIFIER
);



/* Entity Diretor */
create table diretor (
	id UNIQUEIDENTIFIER NOT NULL,
	nome VARCHAR(255) NOT NULL,
	data_nasc NUMERIC(19) NOT NULL /* dataNasc */,
	descricao VARCHAR(255) NOT NULL
);



/* Entity Filme */
create table filme (
	id UNIQUEIDENTIFIER NOT NULL,
	nome VARCHAR(255) NOT NULL,
	descricao VARCHAR(255) NOT NULL,
	diretor UNIQUEIDENTIFIER
);



/* Entity Ator */
create table ator (
	id UNIQUEIDENTIFIER NOT NULL,
	nome VARCHAR(255) NOT NULL,
	cpf VARCHAR(255) NOT NULL,
	filme UNIQUEIDENTIFIER
);



/* Join Tables */
/* master: Diretor as diretor, detail: Filme as filme */
create table diretor_filmes (
	diretor_id UNIQUEIDENTIFIER NOT NULL,
	filmes_id UNIQUEIDENTIFIER NOT NULL
);

/* master: Filme as filme, detail: Ator as ator */
create table filme_atores (
	filme_id UNIQUEIDENTIFIER NOT NULL,
	atores_id UNIQUEIDENTIFIER NOT NULL
);

/* master: Filme as filme, detail: Genero as genero */
create table filme_generos (
	filme_id UNIQUEIDENTIFIER NOT NULL,
	generos_id UNIQUEIDENTIFIER NOT NULL
);

/* Primary Key Constraints */
alter table genero add constraint pk_genero_id primary key(id);
alter table diretor_filmes add constraint pk_diretor_filmes primary key(diretor_id, filmes_id);
alter table diretor add constraint pk_diretor_id primary key(id);
alter table filme_atores add constraint pk_filme_atores primary key(filme_id, atores_id);
alter table filme_generos add constraint pk_filme_generos primary key(filme_id, generos_id);
alter table filme add constraint pk_filme_id primary key(id);
alter table ator add constraint pk_ator_id primary key(id);

/* Foreign Key Constraints */
alter table genero add constraint fkslxuxwbnzxektvnfmpuz9xrqcxjz foreign key (filme) references filme (id);
alter table diretor_filmes add constraint fkphfikeedr7ue2whbxtivhavuctrj foreign key (diretor_id) references diretor (id);
alter table diretor_filmes add constraint fkmxu8gewpn7mtrfeezikcf3qhu5uc foreign key (filmes_id) references filme (id);
alter table filme_atores add constraint fksnekujqxb8bpf626usu7uautegvb foreign key (filme_id) references filme (id);
alter table filme_atores add constraint fkkwwsxewvodla8rj9uvn6wr7spmeq foreign key (atores_id) references ator (id);
alter table filme add constraint fkpyuswgjpegtihmyt52wpbsfzxqxl foreign key (diretor) references diretor (id);
alter table filme_generos add constraint fkzwjotb9g9skrkrcxamxm1zbvtpkj foreign key (filme_id) references filme (id);
alter table filme_generos add constraint fkdsabuwv26fys07omcdwbaorlxxyj foreign key (generos_id) references genero (id);
alter table ator add constraint fkygzthfjrpabn11xdexpyyli11ww1 foreign key (filme) references filme (id);

/* Unique Key Constraints */

/* Sequences for auto increment entity ids */
