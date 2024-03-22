package com.botscrew.vital.consoleapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentStatistics {
    private Integer assistantsCount;
    private Integer associateProfessorsCount;
    private Integer professorsCount;
}
