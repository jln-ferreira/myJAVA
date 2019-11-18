package Connections;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

//have to download an file: https://bitbucket.org/xerial/sqlite-jdbc/downloads/
//right click in project (java-master)
//open modulus settings
//library
//+
//find the file that you downloaded

public class Connections {

    public static void main(String[] args) {


//---------------THIS IS THE WAY TO MAKE CONNECTION IN THE MAIN EASLY-------------------

        try {
            //way to connect to db
            Connection conn = DriverManager.getConnection("jdbc:sqlite:/Users/jose-lucas.neves/Downloads/Java-master/connectionInfo_db/DB_Java/music.db");

            //create a box that you gonna send to DB (inside you gonna put the QUERY)
            Statement statement = conn.createStatement();
            //statement.execute("CREATE TABLE IF NOT EXISTS Classroom3(name TEXT, capacity integer)");
            //statement.execute("INSERT INTO artists VALUES (203, 'Negra Mari')");
            statement.execute("SELECT *  FROM artists");

            //i can save the information inside a variable:
            ResultSet results = statement.getResultSet();

            //to print in the console:
            while (results.next()) { //while we have something, print
                System.out.println(results.getString("name")); //gonna put the column that you want
            }

            //have to close to be secure
            statement.close();
            conn.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
