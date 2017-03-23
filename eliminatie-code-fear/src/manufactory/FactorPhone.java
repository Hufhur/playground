package manufactory;

/**
 * Created by M60095A on 29-8-2016.
 */
public class FactorPhone extends GeneralFactoryProcess {

    public FactorPhone(String processName) {
        super(processName);
    }

    @Override
    protected void assembleDevice() {
        System.out.println("assembled phone");
    }

    @Override
    protected void testDevice() {
        System.out.println("tested phone");
    }

    @Override
    protected void packageDevice() {
        System.out.println("packaged phone");
    }

    @Override
    protected void storeDevice() {
        System.out.println("stored phone");
    }
}
