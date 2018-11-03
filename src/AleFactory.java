public class AleFactory {

    /**
     * Create factories for hops, malt, and yeast
     * 1. Read json data and add the name to a list.
     * 2. Create an object for each json object
     *
     */

    public static void main(String[] args) {
        YeastFactory yeastFactory = new YeastFactory();

        Yeasts abbey_ale = yeastFactory.getYeast("Abbey Ale");
//        abbey_ale.name();
//        abbey_ale.description();
    }
}
