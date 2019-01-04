package com.jacquesvb.alefactory;

public class Decorator2 implements IDisplay {

    private IDisplay display;

    public Decorator2(IDisplay idisplay) {
        display = idisplay;
    }

    public String showType(String type, String inputString) {
        String newString = "^^^^^^^^^^^^^^^^^^\n";
        newString += "^" + display.showType(type, inputString) + "\n";
        newString += "^^^^^^^^^^^^^^^^^^^^^^^^";
        return newString;
    }
}
