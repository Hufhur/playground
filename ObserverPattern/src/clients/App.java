package clients;

import domain.Employee;
import domain.HRDepartment;
import domain.PayrollDepartment;

/**
 * Created by M60095A on 5-9-2016.
 */
public class App {

    public static void main(String[] args) {
        EmployeeManagementSystem ems = new EmployeeManagementSystem();

        PayrollDepartment prDep = new PayrollDepartment();
        HRDepartment hrDep = new HRDepartment();

        ems.registerObserver(prDep);
        ems.registerObserver(hrDep);

        ems.hireNewEmployee(new Employee("Mike", 47, true));
        ems.hireNewEmployee(new Employee("Jan", 37, true));
        ems.hireNewEmployee(new Employee("Jaap", 22, true));
        ems.hireNewEmployee(new Employee("Trees", 47, true));

        ems.modifyEmployee(2,"Kees");

        ems.modifyEmployee(12,"Kees");



    }
}
