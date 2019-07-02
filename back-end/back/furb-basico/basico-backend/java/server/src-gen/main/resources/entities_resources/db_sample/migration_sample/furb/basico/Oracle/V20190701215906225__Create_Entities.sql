/* Database: Oracle. Generation date: 2019-07-01 21:59:06:225 */
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
	data_nasc NUMBER(19) NOT NULL /* dataNasc */,
	descricao VARCHAR(255) NOT NULL
);



/* Entity Filme */
create table filme (
	id RAW(16) NOT NULL,
	nome VARCHAR(255) NOT NULL,
	descricao VARCHAR(255) NOT NULL,
	diretor RAW(16)
);



/* Entity Ator */
create table ator (
	id RAW(16) NOT NULL,
	nome VARCHAR(255) NOT NULL,
	cpf VARCHAR(255) NOT NULL,
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
alter table genero add constraint fk96bkxldunsv3pvheggzmar1iklsk foreign key (filme) references filme (id);
alter table diretor_filmes add constraint fkqbdf94aq5gbq5jhct7wxfqvfyvkt foreign key (diretor_id) references diretor (id);
alter table diretor_filmes add constraint fkwz4oztoayt4omftoaifv8towf1bb foreign key (filmes_id) references filme (id);
alter table filme_atores add constraint fktjrdvshvz7fybjic9xnfnlrouz0o foreign key (filme_id) references filme (id);
alter table filme_atores add constraint fkggk9jbjdswmnp8shdtnrwvvbkfyv foreign key (atores_id) references ator (id);
alter table filme add constraint fk1sejmy2j5w8n8e9w6i3jgk9w7odj foreign key (diretor) references diretor (id);
alter table filme_generos add constraint fkg2vbgbygimtpsf9bd2ryakh5qgnf foreign key (filme_id) references filme (id);
alter table filme_generos add constraint fkrwrokzoii6e3drank0tybx0c9sm1 foreign key (generos_id) references genero (id);
alter table ator add constraint fkpdospdjwv6pvbe5apyku4ga1ql8e foreign key (filme) references filme (id);

/* Unique Key Constraints */

/* Sequences for auto increment entity ids */
