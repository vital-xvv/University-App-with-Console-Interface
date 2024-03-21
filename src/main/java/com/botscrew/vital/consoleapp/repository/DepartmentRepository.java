package com.botscrew.vital.consoleapp.repository;

import com.botscrew.vital.consoleapp.model.Lector;

public interface DepartmentRepository {
    Lector getHeadOfDepartmentByName(String depName);
}
