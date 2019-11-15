package Connections;

public class Artist {

    private int id;
    private String name;

    //SETTERS
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    //GETTERS
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    //CONSTRUCTOR
    public Artist(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
