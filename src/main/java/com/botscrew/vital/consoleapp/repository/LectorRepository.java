package com.botscrew.vital.consoleapp.repository;

import com.botscrew.vital.consoleapp.model.Lector;

import java.util.List;

public interface LectorRepository {
    List<Lector> getLectorsWithTemplateNameMatch(String template);
}
