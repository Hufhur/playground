package domain;

/**
 * Created by M60095A on 5-9-2016.
 */
public class Employee {

    private String name;
    private int age;
    private boolean working;

    public Employee(String name, int age, boolean working) {
        this.name = name;
        this.age = age;
        this.working = working;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isWorking() {
        return working;
    }

    public void setWorking(boolean working) {
        this.working = working;
    }

    @Override
    public String toString() {
        return "Employee{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", working=" + working +
            '}';
    }
}
