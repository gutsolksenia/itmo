create table Students (
    id int,
    firstName varchar(30),
    secondName varchar(30),
    group_id int
);

create table Groups (
    id int,
    name varchar(30)
);

create table Professors (
    id int,
    firstName varchar(30),
    secondName varchar(30)
);

create table Subjects (
    id int,
    name varchar(200),
    group_id int,
    professor_id int
);

create table Marks (
    value int,
    student_id int,
    subject_id int
);

alter table Groups
    add constraint group_id_unique unique (id);
alter table Groups
    add constraint group_name_unique unique (name);
alter table Students
    add constraint student_id_unique unique (id);    
alter table Professors
    add constraint professor_id_unique unique (id);
alter table Subjects
    add constraint subject_id_unique unique (id);
alter table Marks
    add constraint mark_unique unique (student_id, subject_id);

alter table Studentss add foreign key (group_id)
    references Groups (id);

alter table Subjects add foreign key (group_id)
    references Groups (id);

alter table Subjects add foreign key (professor_id)
    references Professors (id);

alter table Marks add foreign key (student_id)
    references Students (id);

alter table Marks add foreign key (subject_id)
    references Subjects (id);