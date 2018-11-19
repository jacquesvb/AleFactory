package com.jacquesvb.alefactory.Hops;

import java.util.List;

public interface Hops {
    String name();
    String flavor();
    List<String> substitute();
    List<String> style();
    float lowAlpha();
    float highAlpha();
}
