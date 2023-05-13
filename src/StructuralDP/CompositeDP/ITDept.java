package StructuralDP.CompositeDP;

import java.util.Arrays;
import java.util.List;

public class ITDept extends Department{
    @Override
    String getName() {
        return "IT";
    }

    @Override
    List<String> getEmployees() {
        return Arrays.asList("I1","I2");
    }
}
