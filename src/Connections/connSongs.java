package Connections;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class connSongs {

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

    //inside the music.db, i have table Songs. In gonna input all info inside a list
    public List<songs> queryForSongs(String titleSong){

        //prepare the query with "?"
        String queryPlusUser_prepareState = "SELECT * FROM songs WHERE title = ?";

        List<songs> SongsList = new ArrayList<songs>(); //create an List
        try{
            //create a box to insert query
            PreparedStatement ps = conn.prepareStatement(queryPlusUser_prepareState);
            ps.setString(1,titleSong);

            //input all information inside the resultSet
            ResultSet rs = ps.executeQuery();

            //im gonna input all songs inside the list
            //and all artists have to have an informaton of _id | track | title | album:
            while (rs.next()){
                //listName      artist     inside DB:           ID                            track                                title                        album
                SongsList.add(new songs(rs.getInt("_id"), rs.getInt("track"), rs.getString("title"), rs.getInt("album")));
            }
            return SongsList;

        }catch (SQLException e){
            System.out.println(e.getMessage());
            return null;
        }
    }





}
