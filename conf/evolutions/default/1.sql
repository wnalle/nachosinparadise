# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table event_result (
  id                        bigint not null,
  nacho_event_id            bigint,
  nacho_user_id             bigint,
  constraint pk_event_result primary key (id))
;

create table nacho_event (
  id                        bigint not null,
  event_name                varchar(255),
  event_location            varchar(255),
  complete                  boolean,
  constraint pk_nacho_event primary key (id))
;

create table nacho_user (
  id                        bigint not null,
  user_name                 varchar(255),
  user_type                 bigint,
  constraint pk_nacho_user primary key (id))
;

create sequence event_result_seq;

create sequence nacho_event_seq;

create sequence nacho_user_seq;

alter table event_result add constraint fk_event_result_nachoEvent_1 foreign key (nacho_event_id) references nacho_event (id);
create index ix_event_result_nachoEvent_1 on event_result (nacho_event_id);
alter table event_result add constraint fk_event_result_nachoUser_2 foreign key (nacho_user_id) references nacho_user (id);
create index ix_event_result_nachoUser_2 on event_result (nacho_user_id);



# --- !Downs

drop table if exists event_result cascade;

drop table if exists nacho_event cascade;

drop table if exists nacho_user cascade;

drop sequence if exists event_result_seq;

drop sequence if exists nacho_event_seq;

drop sequence if exists nacho_user_seq;

