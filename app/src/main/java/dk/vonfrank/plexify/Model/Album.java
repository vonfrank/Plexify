package dk.vonfrank.plexify.Model;

/**
 * Created by Von Frank on 11-07-2016.
 */
public class Album {

    private int id;
    private String albumTitle;

    public Album(int id, String albumTitle){
        this.id = id;
        this.albumTitle = albumTitle;
    }

    public int getId(){
        return id;
    }

    public String getAlbumTitle(){
        return albumTitle;
    }

    public void setAlbumTitle(String albumTitle){
        this.albumTitle = albumTitle;
    }
}
