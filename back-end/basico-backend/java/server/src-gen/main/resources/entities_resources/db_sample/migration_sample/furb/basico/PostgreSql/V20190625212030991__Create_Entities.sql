/* Database: PostgreSql. Generation date: 2019-06-25 21:20:30:991 */
/* Entity Cliente */
create table cliente (
	id UUID NOT NULL,
	nome VARCHAR(255) NOT NULL,
	data_nascimento DATE NOT NULL /* dataNascimento */,
	credito_habilitado BOOLEAN /* creditoHabilitado */,
	cpf VARCHAR(255) NOT NULL,
	id_foto VARCHAR(255) /* idFoto */
);



/* Entity Item */
create table item (
	id UUID NOT NULL,
	descricao VARCHAR(255) NOT NULL,
	quantidade NUMERIC(19,4) NOT NULL,
	valor_unitario NUMERIC(19,4) NOT NULL /* valorUnitario */
);



/* Entity Pedido */
create table pedido (
	id UUID NOT NULL,
	data DATE NOT NULL,
	obsservacoes VARCHAR(255),
	cliente UUID NOT NULL
);



/* Entity Tipo */
create table tipo (
	id UUID NOT NULL,
	nome VARCHAR(255) NOT NULL,
	descricao VARCHAR(255) NOT NULL
);



/* Entity Evento */
create table evento (
	id UUID NOT NULL,
	data DATE NOT NULL,
	hora TIME NOT NULL,
	descricao VARCHAR(255) NOT NULL,
	tipo UUID NOT NULL
);



/* Entity Sala */
create table sala (
	id UUID NOT NULL,
	nome VARCHAR(255) NOT NULL,
	descricao VARCHAR(255) NOT NULL
);



/* Entity Setor */
create table setor (
	id UUID NOT NULL,
	nome VARCHAR(255) NOT NULL,
	descricao VARCHAR(255) NOT NULL,
	sala UUID NOT NULL
);



/* Join Tables */
/* master: Pedido as pedido, detail: Item as item */
create table pedido_itens (
	pedido_id UUID NOT NULL,
	itens_id UUID NOT NULL
);

/* master: Sala as sala, detail: Setor as setor */
create table sala_setores (
	sala_id UUID NOT NULL,
	setores_id UUID NOT NULL
);

/* master: Sala as sala, detail: Evento as evento */
create table sala_evento (
	sala_id UUID NOT NULL,
	evento_id UUID NOT NULL
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
alter table pedido add constraint fkmhp6wa9yww5loha7pal80s3hjpux foreign key (cliente) references cliente (id);
alter table pedido_itens add constraint fkfft78qb2ei6vkawq8imq1pkvvima foreign key (pedido_id) references pedido (id);
alter table pedido_itens add constraint fkds1bpraot5mcw0eihvhpqi7xmjyv foreign key (itens_id) references item (id);
alter table evento add constraint fkx4ypffxn09pvehuxcuzamoekgnn8 foreign key (tipo) references tipo (id);
alter table sala_setores add constraint fkgnpc2pdt6lkhxa9qcneprrzpqfpp foreign key (sala_id) references sala (id);
alter table sala_setores add constraint fk0gwn4wzuhbjofie2b9ctvxwclf5s foreign key (setores_id) references setor (id);
alter table sala_evento add constraint fk39ncmoei1i0kreur4nqfjrocykwv foreign key (sala_id) references sala (id);
alter table sala_evento add constraint fkr3j10jcgo4izyxvzxfsnz5phqsug foreign key (evento_id) references evento (id);
alter table setor add constraint fkmeapgg81lqvweshvp7hpn3y4f1iw foreign key (sala) references sala (id);

/* Unique Key Constraints */

/* Sequences for auto increment entity ids */
