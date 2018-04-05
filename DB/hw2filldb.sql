insert into Groups
    (group_id, name) values
    (1, 'M3438'),
    (2, 'M3439');

insert into Students
    (id, firstName, lastName, group_id) values
    (1, 'Nikita', 'Kaberov', 1),
    (2, 'Dina', 'Ermilova', 2),
    (3, 'Dmitry', 'Yakutov', 2);

insert into Professors
    (id, firstName, lastName) values
    (1, 'Georgiy', 'Korneev'),
    (2, 'Andrew', 'Stankevich');

insert into Subjects
    (id, name, group_id, professor_id) values
    (1, 'databases', 1, 1),
    (2, 'discret math', 1, 2),
    (3, 'databases', 2, 1),
    (4, 'discret math', 2, 2);

insert into Marks
    (value, student_id, subject_id) values
    (5, 1, 1),
    (4, 1, 2),
    (3, 2, 1),
    (4, 2, 2);