package domain;

/**
 * Created by M60095A on 5-9-2016.
 */
public class PayrollDepartment implements IObserver {
    @Override
    public void callMe(Employee employee, String message) {
        System.out.println("Payroll department is notified.");
        System.out.println(message);
        System.out.println(employee);

    }
}
