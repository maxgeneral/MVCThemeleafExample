drop table if exists groups;
drop table if exists students;

create table groups
(
    id   bigserial   not null,
    name varchar(32) not null,
    primary key (id)
);
create table students
(
    id   bigserial   not null,
    credit_card varchar(10) not null,
    first_name  varchar(64) not null,
    last_name   varchar(64) not null,
    middle_name varchar(64) not null,
    group_id    bigint,
    primary key (id)
);
alter table if exists students add constraint student_group foreign key (group_id) references groups

alter table public.students owner to sms_user;
alter table public.groups owner to sms_user;