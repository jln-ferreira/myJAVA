package Connections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConnectMain {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

//        //-------to call the connection artists--------
//        connArtist cn = new connArtist();
//
//        //Create a list to insert everything inside
//        List<Artist> artistList = new ArrayList<Artist>();
//
//        if (cn.open()){//if the connections works
//            artistList = cn.queryForArtists(); //insert everything of artist inside the new list
//        }
//        else{ //if the connection doesnt work
//            System.out.println("Something is wrong in connection!");
//        }
//
//        //print everything now in the console
//        for (Artist i : artistList){
//            System.out.println(i.getId() + " - " + i.getName());
//        }
//
        //----------------ARTIST------------------
        //-------to call the connection artists--------
        System.out.println("-----=== ARTISTS ===-----");
        System.out.println("Please, chose a Artist: ");

        String NextArtist = sn.nextLine();

        //create a list
        List<Artist> listArtist = new ArrayList<Artist>();

        //create an object and make a connection
        connArtist newConnectionArtist = new connArtist();

        //this ".open" have to have to connect
        if (newConnectionArtist.open()){//if the connections works
            listArtist = newConnectionArtist.QueryUserArtist(NextArtist);
        }
        else{ //if the connection doesnt work
            System.out.println("Something is wrong in connection!");
        }

        //print everything now in the console
        for (Artist i : listArtist){
            System.out.println(i.getId() + "| " + i.getName());
        }



        //----------------SONGS------------------
        //-------to call the connection Songs--------
        System.out.println("-----=== SONGS ===-----");
        System.out.println("Please, chose a title: ");

        String NextTitle = sn.nextLine();

        //new object
        connSongs newConnectionSongs  = new connSongs();

        //Create a list to insert everything inside
        List<songs> songsList = new ArrayList<songs>();

        if (newConnectionSongs.open()){//if the connections works
            songsList = newConnectionSongs.queryForSongs(NextTitle); //insert everything of artist inside the new list
        }
        else{ //if the connection doesnt work
            System.out.println("Something is wrong in connection!");
        }

        //print everything now in the console
        for (songs i : songsList){
            System.out.println(i.get_id() + "| " + i.getTrack() + "| " + i.getTitle() + "| " + i.getAlbum());
        }



        //----------------Albums------------------
        //-------to call the connection Albums--------
        System.out.println("-----=== ALBUM ===-----");
        System.out.println("Please, chose a name of Album: ");

        String nextAlbum = sn.nextLine();

        //new object
        connAlbum newConnectionAlbum  = new connAlbum();

        //Create a list to insert everything inside
        List<Album> AlbumList = new ArrayList<Album>();

        if (newConnectionAlbum.open()){//if the connections works
            AlbumList = newConnectionAlbum.queryForAlbum(nextAlbum); //insert everything of artist inside the new list
        }
        else{ //if the connection doesnt work
            System.out.println("Something is wrong in connection!");
        }

        //print everything now in the console
        for (Album i : AlbumList){
            System.out.println(i.get_id() + "| " + i.getName() + "| " + i.getArtist());
        }


    }
}
