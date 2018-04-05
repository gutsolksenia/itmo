create table Students (
    id int,
    name varchar(100),
    group_id int,
    primary key(id)
);

create table Groups (
    id int,
    name varchar(100),
    primary key(id)
);

create table Lecturers (
    id int,
    name varchar(100),
    primary key(id)
);

create table Courses (
    id int,
    name varchar(100),
    primary key(id)
);

create table Marks (
    value int,
    student_id int,
    course_id int,
    primary key(student_id, course_id)
);

create table Teaches (
    course_id int,
    lecturer_id int,
    group_id int,
    primary key(group_id, course_id)
);

alter table Students add foreign key (group_id)
    references Groups (id);

alter table Teaches add foreign key (group_id)
    references Groups (id);

alter table Teaches add foreign key (lecturer_id)
    references Lecturers (id);

alter table Teaches add foreign key (course_id)
    references Courses (id);    

alter table Marks add foreign key (student_id)
    references Students (id);

alter table Marks add foreign key (course_id)
    references Courses (id);