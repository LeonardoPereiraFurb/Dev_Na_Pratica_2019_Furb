/* Database: SqlServer. Generation date: 2019-06-25 21:20:31:023 */
/* Entity Cliente */
create table cliente (
	id UNIQUEIDENTIFIER NOT NULL,
	nome VARCHAR(255) NOT NULL,
	data_nascimento DATE NOT NULL /* dataNascimento */,
	credito_habilitado BIT /* creditoHabilitado */,
	cpf VARCHAR(255) NOT NULL,
	id_foto VARCHAR(255) /* idFoto */
);



/* Entity Item */
create table item (
	id UNIQUEIDENTIFIER NOT NULL,
	descricao VARCHAR(255) NOT NULL,
	quantidade FLOAT(32) NOT NULL,
	valor_unitario FLOAT(32) NOT NULL /* valorUnitario */
);



/* Entity Pedido */
create table pedido (
	id UNIQUEIDENTIFIER NOT NULL,
	data DATE NOT NULL,
	obsservacoes VARCHAR(255),
	cliente UNIQUEIDENTIFIER NOT NULL
);



/* Entity Tipo */
create table tipo (
	id UNIQUEIDENTIFIER NOT NULL,
	nome VARCHAR(255) NOT NULL,
	descricao VARCHAR(255) NOT NULL
);



/* Entity Evento */
create table evento (
	id UNIQUEIDENTIFIER NOT NULL,
	data DATE NOT NULL,
	hora TIME NOT NULL,
	descricao VARCHAR(255) NOT NULL,
	tipo UNIQUEIDENTIFIER NOT NULL
);



/* Entity Sala */
create table sala (
	id UNIQUEIDENTIFIER NOT NULL,
	nome VARCHAR(255) NOT NULL,
	descricao VARCHAR(255) NOT NULL
);



/* Entity Setor */
create table setor (
	id UNIQUEIDENTIFIER NOT NULL,
	nome VARCHAR(255) NOT NULL,
	descricao VARCHAR(255) NOT NULL,
	sala UNIQUEIDENTIFIER NOT NULL
);



/* Join Tables */
/* master: Pedido as pedido, detail: Item as item */
create table pedido_itens (
	pedido_id UNIQUEIDENTIFIER NOT NULL,
	itens_id UNIQUEIDENTIFIER NOT NULL
);

/* master: Sala as sala, detail: Setor as setor */
create table sala_setores (
	sala_id UNIQUEIDENTIFIER NOT NULL,
	setores_id UNIQUEIDENTIFIER NOT NULL
);

/* master: Sala as sala, detail: Evento as evento */
create table sala_evento (
	sala_id UNIQUEIDENTIFIER NOT NULL,
	evento_id UNIQUEIDENTIFIER NOT NULL
);

/* Primary Key Constraints */
alter table cliente add constraint pk_cliente_id primary key(id);
alter table item add constraint pk_item_id primary key(id);
alter table pedido_itens add constraint pk_pedido_itens primary key(pedido_id, itens_id);
alter table pedido add constraint pk_pedido_id primary key(id);
alter table tipo add constraint pk_tipo_id primary key(id);
alter table evento add constraint pk_evento_id primary key(id);
alter table sala_setores add constraint pk_sala_setores primary key(sala_id, setores_id);
alter table sala_evento add constraint pk_sala_evento primary key(sala_id, evento_id);
alter table sala add constraint pk_sala_id primary key(id);
alter table setor add constraint pk_setor_id primary key(id);

/* Foreign Key Constraints */
alter table pedido add constraint fkn77ce0kjmskmrgbhpwo8xy9gyrrn foreign key (cliente) references cliente (id);
alter table pedido_itens add constraint fkn9h4lysdal9q2utnbnshk4i1gsil foreign key (pedido_id) references pedido (id);
alter table pedido_itens add constraint fkixqghtaeelcmtqkke0v6mg5xab1m foreign key (itens_id) references item (id);
alter table evento add constraint fkgcyph5j1y3zyfco113zbbh1kwloo foreign key (tipo) references tipo (id);
alter table sala_setores add constraint fkvrthvflm4svlgxwqetkumwnjha4m foreign key (sala_id) references sala (id);
alter table sala_setores add constraint fkinb3329jo6dfkmhybfsjjijwqt3z foreign key (setores_id) references setor (id);
alter table sala_evento add constraint fksgxdguga6r3au8loj9j70t6lhsir foreign key (sala_id) references sala (id);
alter table sala_evento add constraint fk9udej984585ken8ww9y8cngrpduh foreign key (evento_id) references evento (id);
alter table setor add constraint fksl3trt0mqlcnfufqclf1pqhginwy foreign key (sala) references sala (id);

/* Unique Key Constraints */

/* Sequences for auto increment entity ids */
