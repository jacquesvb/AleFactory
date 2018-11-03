public class YeastSelect implements Yeasts {

    String name, floc, description;
    int lowTemp, highTemp, lowAtten, highAtten;


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

    public void name() {

        System.out.println(name);
    }

    public void floc() {

        System.out.println(floc);
    }

    public void description() {

        System.out.println(description);
    }

    public void lowTemp() {

        System.out.println(lowTemp);
    }

    public void highTemp() {

        System.out.println(highTemp);
    }

    public void lowAttenuation() {

        System.out.println(lowAtten);
    }

    public void highAttenuation() {

        System.out.println(highAtten);
    }
}
