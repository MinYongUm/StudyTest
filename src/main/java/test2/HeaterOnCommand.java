package test2;

import test.Heater;

public class HeaterOnCommand implements Command{

    private Heater heater;

    public HeaterOnCommand(Heater heater) {
        this.heater = heater;
    }

    public void run(){
        heater.powerOn();
    }
}
