/* Database: Oracle. Generation date: 2019-06-29 03:42:32:163 */
/* Entity Genero */
create table genero (
	id RAW(16) NOT NULL,
	nome VARCHAR(255) NOT NULL,
	descricao VARCHAR(255) NOT NULL,
	filme RAW(16)
);



/* Entity Diretor */
create table diretor (
	id RAW(16) NOT NULL,
	nome VARCHAR(255) NOT NULL,
	idade NUMBER(19) NOT NULL,
	descricao VARCHAR(255) NOT NULL
);



/* Entity Filme */
create table filme (
	id RAW(16) NOT NULL,
	descricao VARCHAR(255) NOT NULL,
	diretor RAW(16)
);



/* Entity Ator */
create table ator (
	id RAW(16) NOT NULL,
	nome VARCHAR(255) NOT NULL,
	descricao VARCHAR(255) NOT NULL,
	filme RAW(16)
);



/* Join Tables */
/* master: Diretor as diretor, detail: Filme as filme */
create table diretor_filmes (
	diretor_id RAW(16) NOT NULL,
	filmes_id RAW(16) NOT NULL
);

/* master: Filme as filme, detail: Ator as ator */
create table filme_atores (
	filme_id RAW(16) NOT NULL,
	atores_id RAW(16) NOT NULL
);

/* master: Filme as filme, detail: Genero as genero */
create table filme_generos (
	filme_id RAW(16) NOT NULL,
	generos_id RAW(16) NOT NULL
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
alter table genero add constraint fk7xmuk3pngcmaozppxzx3owjallcz foreign key (filme) references filme (id);
alter table diretor_filmes add constraint fkhe4vgd5d9xu0zhwlmbmggyvgarff foreign key (diretor_id) references diretor (id);
alter table diretor_filmes add constraint fkv3errctn96irwxk7ksf0gksswxkm foreign key (filmes_id) references filme (id);
alter table filme_atores add constraint fkrs1qfblike9nvuj0onhridoarer5 foreign key (filme_id) references filme (id);
alter table filme_atores add constraint fk0aalrhekkqlyh2tb1s60l5eh20pg foreign key (atores_id) references ator (id);
alter table filme add constraint fkbghhwyawl4yc9ff0e3buw3rgtr1w foreign key (diretor) references diretor (id);
alter table filme_generos add constraint fklk3uriqpcwbyxc9xcmauvetpz8qf foreign key (filme_id) references filme (id);
alter table filme_generos add constraint fk7rwxwnx1pk1drshwqvfvupqgzxc1 foreign key (generos_id) references genero (id);
alter table ator add constraint fkttk7tyovy9zimggg9tdixibfs6ab foreign key (filme) references filme (id);

/* Unique Key Constraints */

/* Sequences for auto increment entity ids */
