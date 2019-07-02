/* Database: PostgreSql. Generation date: 2019-07-01 21:59:06:194 */
/* Entity Genero */
create table genero (
	id UUID NOT NULL,
	nome VARCHAR(255) NOT NULL,
	descricao VARCHAR(255) NOT NULL,
	filme UUID
);



/* Entity Diretor */
create table diretor (
	id UUID NOT NULL,
	nome VARCHAR(255) NOT NULL,
	data_nasc NUMERIC(19) NOT NULL /* dataNasc */,
	descricao VARCHAR(255) NOT NULL
);



/* Entity Filme */
create table filme (
	id UUID NOT NULL,
	nome VARCHAR(255) NOT NULL,
	descricao VARCHAR(255) NOT NULL,
	diretor UUID
);



/* Entity Ator */
create table ator (
	id UUID NOT NULL,
	nome VARCHAR(255) NOT NULL,
	cpf VARCHAR(255) NOT NULL,
	filme UUID
);



/* Join Tables */
/* master: Diretor as diretor, detail: Filme as filme */
create table diretor_filmes (
	diretor_id UUID NOT NULL,
	filmes_id UUID NOT NULL
);

/* master: Filme as filme, detail: Ator as ator */
create table filme_atores (
	filme_id UUID NOT NULL,
	atores_id UUID NOT NULL
);

/* master: Filme as filme, detail: Genero as genero */
create table filme_generos (
	filme_id UUID NOT NULL,
	generos_id UUID NOT NULL
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
alter table genero add constraint fk4p7nsueecyv58i6ayaghuqa1krdn foreign key (filme) references filme (id);
alter table diretor_filmes add constraint fkigznufphap4ft7ebqqoqc8wtt58u foreign key (diretor_id) references diretor (id);
alter table diretor_filmes add constraint fkvqhasufubrubihhxaflc2w8bkk2d foreign key (filmes_id) references filme (id);
alter table filme_atores add constraint fkpqmcqyyeszdyvmijtkklnda932rq foreign key (filme_id) references filme (id);
alter table filme_atores add constraint fkcow2g62bdbxnu1v3jzxesyyihwub foreign key (atores_id) references ator (id);
alter table filme add constraint fkqjwwysfimdxh3juvyeotxxdsntu0 foreign key (diretor) references diretor (id);
alter table filme_generos add constraint fkzvxucmfnluqhtsdpz19uivviufhw foreign key (filme_id) references filme (id);
alter table filme_generos add constraint fkchlk6rhohslheysvhmuegz88vcmc foreign key (generos_id) references genero (id);
alter table ator add constraint fk70byzi4ywadabqllmubzp6egemg0 foreign key (filme) references filme (id);

/* Unique Key Constraints */

/* Sequences for auto increment entity ids */
