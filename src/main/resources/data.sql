use university_console_app;

INSERT INTO Departments (name) VALUES ('Philological'),('Mathematical'),('Cybernetics');

INSERT INTO Lectors (first_name, last_name, dep_id, salary, degree, is_head)
    VALUES
        ('James', 'Smith', 1, 3100, 'PROFESSOR', 1),
        ('Ivan', 'Ivanov', 1, 1000.5, 'ASSISTANT', 0),
        ('Flora', 'Ibarra', 1, 1200.7, 'ASSISTANT', 0),
        ('Jackson', 'Delgado', 1, 1570, 'ASSISTANT', 0),
        ('Bridie', 'Mcleod', 1, 2100, 'ASSOCIATE_PROFESSOR', 0),
        ('Haider', 'Dickson', 1, 1950, 'ASSOCIATE_PROFESSOR', 0),
        ('Nina', 'Sprout', 2, 3200, 'PROFESSOR', 1),
        ('Eden', 'Stone', 2, 2120, 'ASSISTANT', 0),
        ('Nickolas', 'Stone', 2, 2200, 'ASSISTANT', 0),
        ('Lia', 'Quinn', 2, 2755, 'ASSOCIATE_PROFESSOR', 0),
        ('Andrea', 'Munoz', 2, 2580, 'ASSOCIATE_PROFESSOR', 0),
        ('Rhiannon', 'John', 3, 2890, 'ASSOCIATE_PROFESSOR', 1);