package Connections;

public class Album {

    private int _id;
    private String name;
    private int artist;

    //SETTERS

    public void set_id(int _id) {
        this._id = _id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setArtist(int artist) {
        this.artist = artist;
    }


    //GETTERS

    public int get_id() {
        return _id;
    }

    public String getName() {
        return name;
    }

    public int getArtist() {
        return artist;
    }

    //CONSTRUCTOR


    public Album(int _id, String name, int artist) {
        this._id = _id;
        this.name = name;
        this.artist = artist;
    }
}
