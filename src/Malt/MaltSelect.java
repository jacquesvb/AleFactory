package Malt;

import java.util.List;

public class MaltSelect implements Malts {

    private String name, description;
    private List<Float> lovibond;
    private List<String> styles;

    public MaltSelect(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public MaltSelect(String name, String description, List<Float> lovibond, List<String> styles) {
        this.name = name;
        this.description = description;
        this.lovibond = lovibond;
        this.styles = styles;
    }

    @Override
    public void name() {
        System.out.println(name);
    }

    @Override
    public void description() {
        System.out.println(description);
    }

    @Override
    public void lovibond() {
        for(float lb : lovibond) {
            System.out.println(lb);
        }
    }

    @Override
    public void style() {
        for(String stylz : styles) {
            System.out.println(stylz);
        }
    }
}
