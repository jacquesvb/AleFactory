package com.jacquesvb.alefactory.Hops;

import java.util.List;

public class HopSelect implements Hops {

    private String name, flavor;
    private float lowAlphaAcid, highAlphaAcid;
    private List<String> styles, substitute;

    public HopSelect(String name, String flavor, float lowAlphaAcid, float highAlphaAcid, List<String> styles,
                     List<String> substitute) {
        this.name = name;
        this.flavor = flavor;
        this.lowAlphaAcid = lowAlphaAcid;
        this.highAlphaAcid = highAlphaAcid;
        this.styles = styles;
        this.substitute = substitute;
    }

    @Override
    public void name() {
        System.out.println(name);
    }

    @Override
    public void flavor() {
        System.out.println(flavor);
    }

    @Override
    public void substitute() {
        for(String sub : substitute) {
            System.out.println(sub);
        }
    }

    @Override
    public void style() {
        for(String style : styles) {
            System.out.println(style);
        }
    }

    @Override
    public void lowAlpha() {
        System.out.println(lowAlphaAcid);
    }

    @Override
    public void highAlpha() {
        System.out.println(highAlphaAcid);
    }
}

