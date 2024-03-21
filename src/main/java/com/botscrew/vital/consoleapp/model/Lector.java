package com.botscrew.vital.consoleapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Lector {
    private Long id;
    private String firstName;
    private String lastName;
    private Long depId;
    private double salary;
    private Degree degree;
    private boolean isHead;

    public enum Degree {
        ASSISTANT, PROFESSOR, ASSOCIATE_PROFESSOR
    }

}
