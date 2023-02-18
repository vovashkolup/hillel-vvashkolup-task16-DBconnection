create table homework
(
    id            serial
        primary key,
    name          varchar,
    "Description" varchar
);

alter table homework
    owner to postgres;

create table shedule
(
    id            integer not null
        primary key,
    name          varchar,
    "updateAt"    varchar,
    lessons_names character varying[]
);

alter table shedule
    owner to postgres;

create table lesson
(
    id          serial
        primary key,
    name        varchar,
    "updateAt"  varchar,
    homework_id serial
        references homework,
    shedule_id  integer
        references shedule
);

alter table lesson
    owner to postgres;


