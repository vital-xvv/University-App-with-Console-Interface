package com.botscrew.vital.consoleapp.repository.implementation;

import com.botscrew.vital.consoleapp.model.DepartmentStatistics;
import com.botscrew.vital.consoleapp.model.Lector;
import com.botscrew.vital.consoleapp.repository.DepartmentRepository;
import com.botscrew.vital.consoleapp.rowmapper.LectorRowMapper;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.Optional;

import static com.botscrew.vital.consoleapp.query.DepartmentQueries.*;

@Repository
public class DepartmentRepositoryImpl implements DepartmentRepository {
    private final NamedParameterJdbcTemplate jdbc;

    public DepartmentRepositoryImpl(NamedParameterJdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    @Override
    public Optional<Lector> getHeadOfDepartmentByName(String depName) {
        try {
            return Optional.ofNullable(jdbc.queryForObject(FIND_HEAD_OF_DEPARTMENT_BY_NAME_QUERY,
                    Map.of("depName", depName),
                    new LectorRowMapper()));
        }catch(EmptyResultDataAccessException e) {
            return Optional.empty();
        }
    }

    @Override
    public Double getAverageSalaryOfDepartmentByName(String depName) {
        return jdbc.queryForObject(CALC_AVERAGE_SALARY_OF_DEPARTMENT_BY_NAME_QUERY,
                Map.of("depName", depName),
                Double.class);
    }

    @Override
    public Integer getCountOfLectorsInDepartmentByName(String depName) {
        return jdbc.queryForObject(COUNT_LECTORS_IN_DEPARTMENT_BY_NAME_QUERY,
                Map.of("depName", depName),
                Integer.class);
    }

    @Override
    public DepartmentStatistics getDepartmentStatisticsByName(String depName) {
        Integer professorsCount = getCountOfProfessorsInDepartmentByName(depName);
        Integer associateProfessorsCount = getCountOfAssociateProfessorsInDepartmentByName(depName);
        Integer assistantsCount = getCountOfAssistantsInDepartmentByName(depName);

        return new DepartmentStatistics(assistantsCount, associateProfessorsCount, professorsCount);
    }

    @Override
    public Integer getCountOfProfessorsInDepartmentByName(String depName) {
        return jdbc.queryForObject(COUNT_PROFESSORS_IN_DEPARTMENT_BY_NAME_QUERY,
                Map.of("depName", depName),
                Integer.class);
    }

    @Override
    public Integer getCountOfAssistantsInDepartmentByName(String depName) {
        return jdbc.queryForObject(COUNT_ASSISTANTS_IN_DEPARTMENT_BY_NAME_QUERY,
                Map.of("depName", depName),
                Integer.class);
    }

    @Override
    public Integer getCountOfAssociateProfessorsInDepartmentByName(String depName) {
        return jdbc.queryForObject(COUNT_ASSOCIATE_PROFESSORS_IN_DEPARTMENT_BY_NAME_QUERY,
                Map.of("depName", depName),
                Integer.class);
    }
}
