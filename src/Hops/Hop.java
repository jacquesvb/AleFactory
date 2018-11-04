package Hops;

import java.util.List;

public class Hop {

    private String name;
    private String flavor;
    private float lowAlphaAcid;
    private float highAlphaAcid;
    private List<String> styles;
    private List<String> substitute;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public float getLowAlphaAcid() {
        return lowAlphaAcid;
    }

    public void setLowAlphaAcid(float lowAlphaAcid) {
        this.lowAlphaAcid = lowAlphaAcid;
    }

    public float getHighAlphaAcid() {
        return highAlphaAcid;
    }

    public void setHighAlphaAcid(float highAlphaAcid) {
        this.highAlphaAcid = highAlphaAcid;
    }

    public List<String> getStyles() {
        return styles;
    }

    public void setStyles(List<String> styles) {
        this.styles = styles;
    }

    public List<String> getSubstitute() {
        return substitute;
    }

    public void setSubstitute(List<String> substitute) {
        this.substitute = substitute;
    }

    @Override
    public String toString() {
        return "Hop.Hop [name=" + name + ", flavor=" + flavor + ", lowAlphaAcid=" + lowAlphaAcid + ", highAlphaAcid=" +
                highAlphaAcid + ", styles=" + styles + ", substitute=" + substitute + "]";
    }
}
