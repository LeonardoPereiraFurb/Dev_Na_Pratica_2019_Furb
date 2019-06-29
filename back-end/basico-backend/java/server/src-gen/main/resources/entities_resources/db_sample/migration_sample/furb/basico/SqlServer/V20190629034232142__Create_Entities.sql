/* Database: SqlServer. Generation date: 2019-06-29 03:42:32:142 */
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
	idade NUMERIC(19) NOT NULL,
	descricao VARCHAR(255) NOT NULL
);



/* Entity Filme */
create table filme (
	id UNIQUEIDENTIFIER NOT NULL,
	descricao VARCHAR(255) NOT NULL,
	diretor UNIQUEIDENTIFIER
);



/* Entity Ator */
create table ator (
	id UNIQUEIDENTIFIER NOT NULL,
	nome VARCHAR(255) NOT NULL,
	descricao VARCHAR(255) NOT NULL,
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
alter table genero add constraint fknq2ybpy4mvygiymdus59kvj1sqy9 foreign key (filme) references filme (id);
alter table diretor_filmes add constraint fkottfpvzijihps2c8q97ndpmspymp foreign key (diretor_id) references diretor (id);
alter table diretor_filmes add constraint fkmsysjx6305sbnhmsx0ogihiiovig foreign key (filmes_id) references filme (id);
alter table filme_atores add constraint fknlzzjh7zecdl3opsh3vu2ph89rn9 foreign key (filme_id) references filme (id);
alter table filme_atores add constraint fkprzrwumi5zocj4aip6zgpnkcu1ac foreign key (atores_id) references ator (id);
alter table filme add constraint fktmhwrqvou1bcjhbyz6y8djykdwo0 foreign key (diretor) references diretor (id);
alter table filme_generos add constraint fk613gs8irac7qhwxkqzwp9khk7v0z foreign key (filme_id) references filme (id);
alter table filme_generos add constraint fkzisz41bkfvsl4ikanrthq9iqdxwa foreign key (generos_id) references genero (id);
alter table ator add constraint fketnyjzwhamv2gs0pqajdpucj0wic foreign key (filme) references filme (id);

/* Unique Key Constraints */

/* Sequences for auto increment entity ids */
