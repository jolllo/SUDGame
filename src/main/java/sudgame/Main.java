package sudgame;

import domain.Location;
import domain.Player;

import java.util.Scanner;

/**
 * Created by pk on 25.02.2017.
 */
public class Main {

    public static void main (String[] args){

        String playerName = askPlayerAboutName();


        Player player = new Player(playerName);
        Location startLoc = new Location("Small room", "you are in small, dark room. Single bed ............");
        Location secondLocation = new Location("Dark corridor", "...");
        startLoc.addExit("polnoc", secondLocation);
        secondLocation.addExit("poludnie", startLoc);

        player.setCurrentLocation(startLoc);

        System.out.println(player.getCurrentLocationDescription());


    }

    private static String askPlayerAboutName() {
        System.out.println("What's is your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("\n Hello " + name + "\n");
        scanner.close();
        return name;

    }

}
