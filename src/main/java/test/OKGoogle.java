package test;

import test2.Command;

public class OKGoogle {

/*    private Heater heater;

    public OKGoogle(Heater heater){
        this.heater = heater;
    }

    public void talk(){
        heater.powerOn();
    }*/

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void talk(){
        command.run();
    }
}
