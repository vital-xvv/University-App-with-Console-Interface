package com.botscrew.vital.consoleapp.console;

import com.botscrew.vital.consoleapp.model.Lector;
import com.botscrew.vital.consoleapp.repository.DepartmentRepository;
import lombok.AllArgsConstructor;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
@AllArgsConstructor
public class ConsoleInterface {

    private DepartmentRepository departmentRepository;

    @ShellMethod(key = "Who is head of department", value = "Get a full name of a head of the department.")
    public String headOfDepartment(String depName) {
        Lector lector = departmentRepository.getHeadOfDepartmentByName(depName);
        return String.format("Head of %s department is %s %s", depName, lector.getFirstName(), lector.getLastName());
    }
}
