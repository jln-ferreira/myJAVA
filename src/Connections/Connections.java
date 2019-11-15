package Connections;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

//have to download an file: https://bitbucket.org/xerial/sqlite-jdbc/downloads/
//right click in project (java-master)
//open modulus settings
//library
//+
//find the file that you downloaded

public class Connections {

    //Create a basic to do a connection in the boolean Method
    private Connection conn;
    private String connectionString = "jdbc:sqlite:/Users/jose-lucas.neves/Downloads/Java-master/connectionInfo_db/DB_Java/music.db";


    //MAKE THE CONNECTION
    public boolean open() {
        try {
            conn = DriverManager.getConnection(connectionString); //connect to my DB
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    //inside the music.db, i have table Artist. In gonna input all info inside a list
    public List<Artist> queryForArtists(){

        List<Artist> artists = new ArrayList<Artist>(); //create an List
        try{
            Statement statement = conn.createStatement(); //create a box to put a query inside
            statement.execute("SELECT * FROM artists");

            //all information of the table is here now
            ResultSet rs = statement.getResultSet();

            //im gonna input all artirst inside the list
            //and all artists have to have an informaton of id and name:
            while (rs.next()){
                //listName      artist     inside DB: ID            and                     name
                artists.add(new Artist(rs.getInt("_id"), rs.getString("name")));
            }
            return artists;

        }catch (SQLException e){
            System.out.println(e.getMessage());
            return null;
        }
    }
}










//---------------THIS IS THE WAY TO MAKE CONNECTION IN THE MAIN EASLY-------------------

//        try{
//            //way to connect to db
//            Connection conn = DriverManager.getConnection("jdbc:sqlite:/Users/jose-lucas.neves/Downloads/Java-master/connectionInfo_db/DB_Java/music.db");
//
//            //create a box that you gonna send to DB (inside you gonna put the QUERY)
//            Statement statement = conn.createStatement();
//            //statement.execute("CREATE TABLE IF NOT EXISTS Classroom3(name TEXT, capacity integer)");
//            //statement.execute("INSERT INTO artists VALUES (203, 'Negra Mari')");
//            statement.execute("SELECT *  FROM artists");
//
//            //i can save the information inside a variable:
//            ResultSet results = statement.getResultSet();
//
//            //to print in the console:
//            while (results.next()){ //while we have something, print
//                System.out.println(results.getString("name")); //gonna put the column that you want
//            }
//
//            //have to close to be secure
//            statement.close();
//            conn.close();
//
//        }catch (SQLException e){
//            System.out.println(e.getMessage());
//      }
