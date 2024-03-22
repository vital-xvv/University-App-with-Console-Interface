package com.botscrew.vital.consoleapp.query;

public class LectorQueries {
    public static final String FIND_LECTORS_BY_SUBSEQUENCE_IN_NAME_QUERY =
            "SELECT * FROM Lectors " +
                "WHERE first_name LIKE %s OR last_name LIKE %s";
}
