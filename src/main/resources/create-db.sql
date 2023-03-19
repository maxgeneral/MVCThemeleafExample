drop user if exists sms_user;
create user sms_user;
comment on role sms_user is ' Пользователь владения БД';
alter user sms_user with password 'P@s$w0rd2023';

drop database if exists sms_db;
create database sms_db;
comment on database sms_db is ' БД для сдачи лабораторных и практических работ';

alter database sms_db owner to sms_user;