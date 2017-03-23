package domain;

/**
 * Created by M60095A on 5-9-2016.
 */
public interface IObserver {

    public void callMe(Employee employee, String message);
}
