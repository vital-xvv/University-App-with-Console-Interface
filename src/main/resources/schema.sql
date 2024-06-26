CREATE SCHEMA IF NOT EXISTS university_console_app;

SET NAMES 'UTF8MB4';

USE university_console_app;

DROP TABLE IF EXISTS Lectors;
DROP TABLE IF EXISTS Departments;

CREATE TABLE Departments
(
    id              BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name            VARCHAR(100) NOT NULL
);


CREATE TABLE Lectors
(
    id              BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    first_name      VARCHAR(50) NOT NULL,
    last_name       VARCHAR(50) NOT NULL,
    dep_id          BIGINT UNSIGNED NOT NULL,
    salary          DECIMAL(8,2) DEFAULT NULL,
    degree          VARCHAR(100) NOT NULL CHECK ( degree IN ('ASSISTANT', 'ASSOCIATE_PROFESSOR', 'PROFESSOR')),
    is_head         BIT(1) DEFAULT 0,
    FOREIGN KEY (dep_id) REFERENCES Departments(id) ON DELETE CASCADE ON UPDATE CASCADE
);


