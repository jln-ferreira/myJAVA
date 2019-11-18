package Connections;

public class songs {

    private int _id;
    private int track;
    private String title;
    private int album;

    //SETTERS
    public void set_id(int _id) {
        this._id = _id;
    }

    public void setTrack(int track) {
        this.track = track;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAlbum(int album) {
        this.album = album;
    }

    //GETTERS

    public int get_id() {
        return _id;
    }

    public int getTrack() {
        return track;
    }

    public String getTitle() {
        return title;
    }

    public int getAlbum() {
        return album;
    }

    //CONTRUCTOR
    public songs(int _id, int track, String title, int album) {
        this._id = _id;
        this.track = track;
        this.title = title;
        this.album = album;
    }
}
