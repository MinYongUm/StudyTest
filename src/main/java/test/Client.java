package test;

import test2.Command;
import test2.HeaterOnCommand;
import test2.LampOnCommand;

public class Client {

    public static void main(String[] args) {

/*        Heater heater = new Heater();
        OKGoogle okGoogle = new OKGoogle(heater);
        okGoogle.talk();
    }*/

        Heater heater = new Heater();
        Lamp lamp = new Lamp();

        Command hoc = new HeaterOnCommand(heater);
        Command loc = new LampOnCommand(lamp);
        OKGoogle okGoogle = new OKGoogle();

        okGoogle.setCommand(hoc);
        okGoogle.talk();

        okGoogle.setCommand(loc);
        okGoogle.talk();
    }
}
