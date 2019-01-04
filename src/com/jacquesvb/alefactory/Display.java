package com.jacquesvb.alefactory;

import java.util.List;

public class Display implements IDisplay {

    public String showType(String type, String inputString) {
        String newString = type + ": " + inputString;
        return newString;
    }
}
