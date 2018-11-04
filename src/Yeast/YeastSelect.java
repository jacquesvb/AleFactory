package Yeast;

public class YeastSelect implements Yeasts {

    private String name, floc, description;
    private int lowTemp, highTemp, lowAtten, highAtten;

    public YeastSelect(String name, String description)
    {
        this.name = name;
        this.description = description;
    }

    public YeastSelect(String name, String floc, String description, int lowTemp, int highTemp, int lowAtten,
                       int highAtten) {
        this.name = name;
        this.floc = floc;
        this.description = description;
        this.lowTemp = lowTemp;
        this.highTemp = highTemp;
        this.lowAtten = lowAtten;
        this.highAtten = highAtten;
    }

    @Override
    public void name() {
        System.out.println(name);
    }

    @Override
    public void floc() {
        System.out.println(floc);
    }

    @Override
    public void description() {
        System.out.println(description);
    }

    @Override
    public void lowTemp() {
        System.out.println(lowTemp);
    }

    @Override
    public void highTemp() {
        System.out.println(highTemp);
    }

    @Override
    public void lowAttenuation() {
        System.out.println(lowAtten);
    }

    @Override
    public void highAttenuation() {
        System.out.println(highAtten);
    }
}
