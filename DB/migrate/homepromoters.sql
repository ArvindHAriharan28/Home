create table register
(
id number(5)primary key,
name varchar2(40)not null,
phone_number number(10) not null,
email varchar2(30) unique not null,
password varchar2(30)not null,
address varchar2(100)not null
);
drop table register;
select *from register;
truncate table register;
alter table register modify(unique(email));
create table admin
(
id number(5) primary key,
name varchar2(40)not null,
location varchar2(40)not null,
address varchar2(100)not null,
phone_no number(10) not null,
price number(10,3) not null,
status int
);

drop table admin;

create sequence admin_admin_id_seq
start with 1
increment by 1;

create sequence register_id_seq
start with 1
increment by 1;
drop sequence  admin_admin_id_seq;
update admin set status=1;
commit;
select * from admin;
update admin set status=1;
select * from register;
alter table register add security_question varchar2(40);
alter table register add security_answer varchar2(40);
delete from admin where admin_id=34;
commit;