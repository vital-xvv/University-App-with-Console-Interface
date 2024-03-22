package com.botscrew.vital.consoleapp.query;

public class DepartmentQueries {
    public static final String FIND_HEAD_OF_DEPARTMENT_BY_NAME_QUERY =
            "SELECT * FROM Lectors l " +
                    "JOIN Departments d on l.dep_id=d.id " +
                        "WHERE d.name=:depName AND l.is_head=1";

    public static final String CALC_AVERAGE_SALARY_OF_DEPARTMENT_BY_NAME_QUERY =
            "SELECT avg(l.salary) FROM Lectors l " +
                "JOIN Departments d on l.dep_id=d.id " +
                    "WHERE d.name=:depName";

    public static final String COUNT_LECTORS_IN_DEPARTMENT_BY_NAME_QUERY =
            "SELECT count(*) FROM Lectors l " +
                    "JOIN Departments d ON l.dep_id=d.id " +
                        "WHERE d.name=:depName";

    public static final String COUNT_PROFESSORS_IN_DEPARTMENT_BY_NAME_QUERY =
            "SELECT count(*) FROM Lectors l " +
                    "JOIN Departments d ON l.dep_id=d.id " +
                        "WHERE d.name=:depName AND l.degree='PROFESSOR'";

    public static final String COUNT_ASSISTANTS_IN_DEPARTMENT_BY_NAME_QUERY =
            "SELECT count(*) FROM Lectors l " +
                    "JOIN Departments d ON l.dep_id=d.id " +
                    "WHERE d.name=:depName AND l.degree='ASSISTANT'";

    public static final String COUNT_ASSOCIATE_PROFESSORS_IN_DEPARTMENT_BY_NAME_QUERY =
            "SELECT count(*) FROM Lectors l " +
                    "JOIN Departments d ON l.dep_id=d.id " +
                    "WHERE d.name=:depName AND l.degree='ASSOCIATE_PROFESSOR'";
}
