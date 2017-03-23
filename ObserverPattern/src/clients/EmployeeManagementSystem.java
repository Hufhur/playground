package clients;

import domain.Employee;
import domain.IObserver;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by M60095A on 5-9-2016.
 */
public class EmployeeManagementSystem {

    private List<Employee> employees = new ArrayList<>();
    private List<IObserver> observers = new ArrayList<>();

    // State
    Employee employee;
    String msg;

    public void registerObserver(IObserver newObserver) {
        observers.add(newObserver);
    }

    public void hireNewEmployee(Employee newEmployee){
        employees.add(newEmployee);
        msg = "New hire";
        employee = newEmployee;
        notifyObservers();

    }

    public void modifyEmployee(Integer index, String newName){

        try {
            employees.get(index).setName(newName);
            msg = "Modify employee";
            employee = employees.get(index);
            notifyObservers();
        } catch(IndexOutOfBoundsException e) {
            System.out.println("Invalid index");
        }

    }

    private void notifyObservers() {
        for(IObserver observer: observers){
            observer.callMe(employee, msg);
        }
    }
}
