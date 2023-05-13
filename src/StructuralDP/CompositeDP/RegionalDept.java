package StructuralDP.CompositeDP;

import java.util.List;
import java.util.stream.Collectors;


public class RegionalDept extends Department{

    List<Department> childDepartments;

    public RegionalDept(List<Department> childDepartments) {
        this.childDepartments = childDepartments;
    }

    @Override
    String getName() {
        return childDepartments.stream() // Finance object, Sales objects
                .map(Department::getName) // "Finance" and "Sales"
                .collect(Collectors.joining(", ")); // "Finance, Sales"
    }

    @Override
    List<String> getEmployees() {
        return childDepartments.stream()
                .flatMap(d->d.getEmployees().stream())
                .collect(Collectors.toList());
    }
}
