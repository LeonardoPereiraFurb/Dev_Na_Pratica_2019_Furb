/* Database: Oracle. Generation date: 2019-04-08 22:14:05:643 */
/* Entity World */
create table world (
	id RAW(16) NOT NULL,
	name VARCHAR(255) NOT NULL
);



/* Join Tables */

/* Primary Key Constraints */
alter table world add constraint pk_world_id primary key(id);

/* Foreign Key Constraints */

/* Unique Key Constraints */

/* Sequences for auto increment entity ids */
