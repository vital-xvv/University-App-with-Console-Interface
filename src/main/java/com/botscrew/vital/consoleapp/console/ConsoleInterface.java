package com.botscrew.vital.consoleapp.console;

import com.botscrew.vital.consoleapp.model.DepartmentStatistics;
import com.botscrew.vital.consoleapp.model.Lector;
import com.botscrew.vital.consoleapp.repository.DepartmentRepository;
import com.botscrew.vital.consoleapp.repository.LectorRepository;
import lombok.AllArgsConstructor;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

import java.util.List;
import java.util.stream.Collectors;

@ShellComponent
@AllArgsConstructor
public class ConsoleInterface {

    private DepartmentRepository departmentRepository;
    private LectorRepository lectorRepository;

    @ShellMethod(key = "Who is head of department", value = "Get a full name of a head of the department.")
    public String headOfDepartment(String depName) {
        Lector lector = departmentRepository.getHeadOfDepartmentByName(depName);
        return String.format("Head of %s department is %s %s", depName, lector.getFirstName(), lector.getLastName());
    }

    @ShellMethod(key = "Show the average salary for the department",
            value = "Get the average salary in the specified department.")
    public String averageSalaryOfDepartment(String depName) {
        Double averageSalary = departmentRepository.getAverageSalaryOfDepartmentByName(depName);
        return String.format("The average salary of %s is %f", depName, averageSalary);
    }

    @ShellMethod(key = "Show count of employee for",
            value = "Get the count of lectors in the specified department.")
    public Integer countLectorsInDepartment(String depName) {
        return departmentRepository.getCountOfLectorsInDepartmentByName(depName);
    }

    @ShellMethod(key = "Global search by",
            value = "Get full names of lectors whose names contain the subsequence {template}.")
    public String getLectorNamesByTemplate(String template) {
        List<Lector> lectors = lectorRepository.getLectorsWithTemplateNameMatch(template);
        return lectors
                .stream()
                .map(l -> String.format("%s %s", l.getFirstName(), l.getLastName()))
                .collect(Collectors.joining(", "));
    }

    @ShellMethod(key = "Show statistics", value = "Shows the statistics about a department with a particular name.")
    public String departmentStatistics(@ShellOption(value = { "--depName" }) String depName) {
        DepartmentStatistics statistics = departmentRepository.getDepartmentStatisticsByName(depName);
        return String.format("""
                        assistants - %d
                        associate professors - %d
                        professors - %d""",
                        statistics.getAssistantsCount(),
                        statistics.getAssociateProfessorsCount(),
                        statistics.getProfessorsCount());
    }
}
