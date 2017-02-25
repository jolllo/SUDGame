import domain.Location;
import domain.Player;

/**
 * Created by pk on 25.02.2017.
 */
public class Main {

    public static void main (String[] args){

        Player player = new Player("Gracz");
        Location startLoc = new Location("Small room", "you are in small, dark room. Single bed ............");

        player.setCurrentLocation(startLoc);

        System.out.println(player.getCurrentLocationDescription());


    }

}
