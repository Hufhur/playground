package manufactory;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by M60095A on 29-8-2016.
 */
abstract class GeneralFactoryProcess {


  private String processName;

    public GeneralFactoryProcess(String processName) {
        this.processName = processName;
    }

    protected abstract void assembleDevice();
    protected abstract void testDevice();
    protected abstract void packageDevice();
    protected abstract void storeDevice();

    public void launchProcess(){
        if(processName != null && !processName.isEmpty()) {
            assembleDevice();
            testDevice();
            packageDevice();
            storeDevice();
        }
        else {
            System.out.println("No valid process name");
        }
    }

}
