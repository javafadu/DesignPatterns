package StructuralDP.CompositeDP;

import java.util.Arrays;

public class CompositeRunner {


    public static void main(String[] args) {
        CompositeRunner compositeRunner = new CompositeRunner();
        compositeRunner.compositeDemo();

    }

    public void compositeDemo() {
        Department financeDepartment = new FinanceDept();
        Department salesDepartment = new SalesDept();
        Department itDepartment = new ITDept();

        Department regionalDepartment = new RegionalDept(Arrays.asList(financeDepartment, salesDepartment,itDepartment));

        System.out.println(regionalDepartment.getName());
        System.out.println("********************");
        System.out.println(regionalDepartment.getEmployees());

    }


}
