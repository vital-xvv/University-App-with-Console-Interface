package com.botscrew.vital.consoleapp.rowmapper;

import com.botscrew.vital.consoleapp.model.Lector;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class LectorRowMapper implements RowMapper<Lector> {

    @Override
    public Lector mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Lector(
                rs.getLong("id"),
                rs.getString("first_name"),
                rs.getString("last_name"),
                rs.getLong("dep_id"),
                rs.getDouble("salary"),
                Lector.Degree.valueOf(rs.getString("degree")),
                rs.getBoolean("is_head"));
    }
}
