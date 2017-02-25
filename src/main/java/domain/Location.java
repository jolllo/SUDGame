package domain;

/**
 * Created by pk on 25.02.2017.
 */
public class Location {

    private String longDescription;
    private String shortDescription;

    public Location(String longDescription, String shortDescription) {
        this.longDescription = longDescription;
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getDescription() {
       return this.shortDescription + "\n" + this.longDescription;
    }
}
