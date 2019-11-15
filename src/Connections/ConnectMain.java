package Connections;

import java.util.ArrayList;
import java.util.List;

public class ConnectMain {
    public static void main(String[] args) {

        //-------to call the connection artists--------
        Connections cn = new Connections();

        //Create a list to insert everything inside
        List<Artist> artistList = new ArrayList<Artist>();

        if (cn.open()){//if the connections works
            artistList = cn.queryForArtists(); //insert everything of artist inside the new list
        }
        else{ //if the connection doesnt work
            System.out.println("Something is wrong in connection!");
        }

        //print everything now in the console
        for (Artist i : artistList){
            System.out.println(i.getId() + " - " + i.getName());
        }



    }
}
