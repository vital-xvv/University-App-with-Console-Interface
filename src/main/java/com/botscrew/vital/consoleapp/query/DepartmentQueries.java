package com.botscrew.vital.consoleapp.query;

public class DepartmentQueries {
    public static final String FIND_HEAD_OF_DEPARTMENT_BY_NAME_QUERY =
            "SELECT * FROM Lectors l " +
                    "JOIN Departments d on l.dep_id=d.id " +
                    "WHERE d.name=:depName AND l.is_head=1";
}
