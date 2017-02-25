package domain;

import javax.tools.DocumentationTool;

/**
 * Created by pk on 25.02.2017.
 */
public class Player {

    private String name;
    private Location currentLocation;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Location getCurrentLocation() {
        return currentLocation;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCurrentLocation(Location location) {
        this.currentLocation = location;

    }

    public String getCurrentLocationDescription() {
       return  this.currentLocation.getDescription();
    }
}
