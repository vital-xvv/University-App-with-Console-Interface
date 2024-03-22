package com.botscrew.vital.consoleapp.repository.implementation;

import com.botscrew.vital.consoleapp.model.Lector;
import com.botscrew.vital.consoleapp.repository.LectorRepository;
import com.botscrew.vital.consoleapp.rowmapper.LectorRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import static com.botscrew.vital.consoleapp.query.LectorQueries.*;

import java.util.List;

@Repository
public class LectorRepositoryImpl implements LectorRepository {
    private final NamedParameterJdbcTemplate jdbc;

    public LectorRepositoryImpl(NamedParameterJdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    @Override
    public List<Lector> getLectorsWithTemplateNameMatch(String template) {
        return jdbc.query(
                String.format(FIND_LECTORS_BY_SUBSEQUENCE_IN_NAME_QUERY,
                        "'%"+template+"%'", "'%"+template+"%'"),
                new LectorRowMapper());
    }
}
