package com.botscrew.vital.consoleapp.repository.implementation;

import com.botscrew.vital.consoleapp.model.Lector;
import com.botscrew.vital.consoleapp.repository.DepartmentRepository;
import com.botscrew.vital.consoleapp.rowmapper.LectorRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Map;

import static com.botscrew.vital.consoleapp.query.DepartmentQueries.*;

@Repository
public class DepartmentRepositoryImpl implements DepartmentRepository {
    private final NamedParameterJdbcTemplate jdbc;

    public DepartmentRepositoryImpl(NamedParameterJdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    @Override
    public Lector getHeadOfDepartmentByName(String depName) {
        return jdbc.queryForObject(FIND_HEAD_OF_DEPARTMENT_BY_NAME_QUERY,
                Map.of("depName", depName),
                new LectorRowMapper());
    }
}
