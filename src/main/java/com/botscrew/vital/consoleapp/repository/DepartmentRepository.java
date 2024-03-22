package com.botscrew.vital.consoleapp.repository;

import com.botscrew.vital.consoleapp.model.DepartmentStatistics;
import com.botscrew.vital.consoleapp.model.Lector;

public interface DepartmentRepository {
    Lector getHeadOfDepartmentByName(String depName);

    Double getAverageSalaryOfDepartmentByName(String depName);

    Integer getCountOfLectorsInDepartmentByName(String depName);

    DepartmentStatistics getDepartmentStatisticsByName(String depName);

    Integer getCountOfProfessorsInDepartmentByName(String depName);

    Integer getCountOfAssistantsInDepartmentByName(String depName);

    Integer getCountOfAssociateProfessorsInDepartmentByName(String depName);
}
