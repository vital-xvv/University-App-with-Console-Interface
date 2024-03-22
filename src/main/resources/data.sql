use university_console_app;

INSERT INTO Departments (name) VALUES ('Philological'),('Mathematical');
INSERT INTO Lectors (first_name, last_name, dep_id, salary, degree, is_head)
VALUES ('Ivan', 'Ivanov', 1, 2000.50, 'ASSISTANT', 0),
('James', 'Smith', 1, 3100, 'PROFESSOR', 1),
('Nina', 'Sprout', 2, 3200, 'PROFESSOR', 1),
('Nickolas', 'Stone', 2, 2200, 'ASSISTANT', 0);