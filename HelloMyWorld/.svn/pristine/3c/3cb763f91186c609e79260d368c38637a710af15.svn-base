create table id_sequence (
	sequence_name varchar(10) constraint idseq_seqname_pk primary key,
	next_value number not null
);

insert into id_sequence values ('article', 0);

create table article (
	article_id number constraint article_article_id_pk primary key,
	group_id number not null,
	sequence_no char(16) not null,
	posting_date date not null,
	read_count number not null,
	writer_name varchar(20) not null,
	password varchar(10),
	title varchar(100),
	content clob
); 

create sequence article_seq
increment by 1
start with 1;