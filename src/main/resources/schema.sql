create table course (
    id bigint generated by default as identity,
    title varchar(255) not null,
    creator_id bigint not null,
    created_at timestamp not null,
    updated_at timestamp,
    primary key (id)
);

create table cardinal (
    id bigint generated by default as identity,
    course_id bigint
);

create table session (
    id bigint generated by default as identity,
    status varchar(10) not null,
    price int,
    creator_id bigint not null,
    created_at timestamp not null,
    updated_at timestamp
);

create table session_info (
    id bigint generated by default as identity,
    title varchar(255) not null,
    image_url varchar(255) null
);

create table ns_user (
    id bigint generated by default as identity,
    user_id varchar(20) not null,
    password varchar(20) not null,
    name varchar(20) not null,
    email varchar(50),
    created_at timestamp not null,
    updated_at timestamp,
    primary key (id)
);

create table question (
    id bigint generated by default as identity,
    created_at timestamp not null,
    updated_at timestamp,
    contents clob,
    deleted boolean not null,
    title varchar(100) not null,
    writer_id bigint,
    primary key (id)
);

create table answer (
    id bigint generated by default as identity,
    created_at timestamp not null,
    updated_at timestamp,
    contents clob,
    deleted boolean not null,
    question_id bigint,
    writer_id bigint,
    primary key (id)
);

create table delete_history (
    id bigint not null,
    content_id bigint,
    content_type varchar(255),
    created_date timestamp,
    deleted_by_id bigint,
    primary key (id)
);
