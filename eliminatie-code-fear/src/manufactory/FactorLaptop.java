package manufactory;

/**
 * Created by M60095A on 29-8-2016.
 */
public class FactorLaptop extends GeneralFactoryProcess {

    public FactorLaptop(String processName) {
        super(processName);
    }

    @Override
    protected void assembleDevice() {
        System.out.println("assembled laptop");
    }

    @Override
    protected void testDevice() {
        System.out.println("tested laptop");
    }

    @Override
    protected void packageDevice() {
        System.out.println("packaged laptop");
    }

    @Override
    protected void storeDevice() {
        System.out.println("stored laptop");
    }
}
