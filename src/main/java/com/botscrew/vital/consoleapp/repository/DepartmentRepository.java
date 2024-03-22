package com.botscrew.vital.consoleapp.repository;

import com.botscrew.vital.consoleapp.model.DepartmentStatistics;
import com.botscrew.vital.consoleapp.model.Lector;

import java.util.Optional;

public interface DepartmentRepository {
    Optional<Lector> getHeadOfDepartmentByName(String depName);

    Double getAverageSalaryOfDepartmentByName(String depName);

    Integer getCountOfLectorsInDepartmentByName(String depName);

    DepartmentStatistics getDepartmentStatisticsByName(String depName);

    Integer getCountOfProfessorsInDepartmentByName(String depName);

    Integer getCountOfAssistantsInDepartmentByName(String depName);

    Integer getCountOfAssociateProfessorsInDepartmentByName(String depName);
}
