insert into Groups
    (id, name) values
    (1, 'M3438'),
    (2, 'M3439');

insert into Students
    (id, name, group_id) values
    (1, 'Nikita Kaberov', 1),
    (2, 'Dina Ermilova', 2),
    (3, 'Dmitry Yakutov', 2);

insert into Lecturers
    (id, name) values
    (1, 'Georgiy Korneev'),
    (2, 'Andrew Stankevich');

insert into Courses
    (id, name) values
    (1, 'databases'),
    (3, 'geometry'),
    (2, 'discret math');

insert into  Teaches 
    (course_id, lecturer_id, group_id) values
    (1, 1, 1),
    (1, 1, 2),
    (2, 2, 1),
    (2, 2, 2);

insert into Marks
    (value, student_id, course_id) values
    (5, 1, 1),
    (4, 1, 2),
    (3, 2, 1),
    (4, 2, 2);