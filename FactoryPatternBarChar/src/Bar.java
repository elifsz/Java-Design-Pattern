
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author elif
 */
public class Bar implements Comparable<Bar> {

    private static AbstractBarFeatureFactory factory;
    private BarFont font;
    private BarImage image;

    private String na;
    private int val;
    private String cat;
    private String co;

    // Creates a new bar.
    public Bar(String name, String country, int value, String category) {
        if (name == null || country == null || value < 0 || category == null) {
            throw new IllegalArgumentException("Wrong data");
        }
        na = name;
        co = country;
        val = value;
        cat = category;
    }

    /*
    Since the system will produce more than one bar throughout the program, the factory of each bar will remain the same at runtime, 
    so it has been implemented as static.
     */
    public static void setBarFactory(AbstractBarFeatureFactory f) {
        factory = f;
    }

    //factory method for bar font
    public String getFont() {
        font = factory.createBarFont();
        return font.createFont();
    }

    //factory method for bar image
    public String getImage(String country) {
        image = factory.createBarImage();
        return image.createImage(country);
    }

    // Returns the name of this bar.
    public String getName() {
        return na;
    }

    // Returns the value of this bar.
    public int getValue() {
        return val;
    }

    // Returns the category of this bar.
    public String getCategory() {
        return cat;
    }

    public String getCountryName() {
        return co;
    }

    Bar() {

    }

    // Compare two bars by value.
    public int compareTo(Bar that) {
        if (that == null) {
            throw new NullPointerException();
        }
        return Integer.compare(this.val, that.val);
    }
}
