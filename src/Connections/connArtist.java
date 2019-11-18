package Connections;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class connArtist {

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

    //------------- TO PRINT EVERYTHING IN THE LIST -------------------
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

    //----------------- TO PRINT SOMETHING THAT THE USER CHOOSE -----------------------
    public List<Artist> QueryUserArtist(String artistName){

        String queryPlusUser_prepareState = "SELECT * FROM artists WHERE name = ?";
        List<Artist> albumList = new ArrayList<Artist>(); //create an List

        try{
            PreparedStatement ps = conn.prepareStatement(queryPlusUser_prepareState);
            ps.setString(1,artistName);

            ResultSet rs = ps.executeQuery();

            while (rs.next()){
                albumList.add(new Artist(rs.getInt("_id"),rs.getString("name")));
            }

            return albumList;

        }catch (SQLException e){
            System.out.println(e.getMessage());
            return null;
        }
    }




}
