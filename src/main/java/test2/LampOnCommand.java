package test2;

import test.Lamp;

public class LampOnCommand implements Command{

    private Lamp lamp;

    public LampOnCommand(Lamp lamp) {
        this.lamp = lamp;
    }

    public void run(){
        lamp.turnOn();
    }
}
