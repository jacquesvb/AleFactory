package Yeast;

public class Yeast {

    private String name;
    private String description;
    private String floc;
    private int lowAttenuation;
    private int highAttenuation;
    private int lowTemp;
    private int highTemp;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFloc() {
        return floc;
    }

    public void setFloc(String floc) {
        this.floc = floc;
    }

    public int getLowAttenuation() {
        return lowAttenuation;
    }

    public void setLowAttenuation(int lowAttenuation) {
        this.lowAttenuation = lowAttenuation;
    }

    public int getHighAttenuation() {
        return highAttenuation;
    }

    public void setHighAttenuation(int highAttenuation) {
        this.highAttenuation = highAttenuation;
    }

    public int getLowTemp() {
        return lowTemp;
    }

    public void setLowTemp(int lowTemp) {
        this.lowTemp = lowTemp;
    }

    public int getHighTemp() {
        return highTemp;
    }

    public void setHighTemp(int highTemp) {
        this.highTemp = highTemp;
    }

    @Override
    public String toString() {
        return "Yeast.Yeast [name=" + name + ", description=" + description + ", floc=" + floc + ", lowAttenuation=" + lowAttenuation + ", highAttenuation=" +
                highAttenuation + ", lowTemp=" + lowTemp + ", highTemp=" + highTemp + "]";
    }
}
