package domain;

/**
 * Created by M60095A on 5-9-2016.
 */
public class HRDepartment implements IObserver {

    @Override
    public void callMe(Employee employee, String message) {
        System.out.println("HR department is notified.");
        System.out.println(message);
        System.out.println(employee);

    }

}
