package dk.vonfrank.plexify.Model;

/**
 * Created by Von Frank on 11-07-2016.
 */
public class Artist {

    private int id;
    private String artistTitle;

    public Artist(int id, String artistTitle){
        this.id = id;
        this.artistTitle = artistTitle;
    }

    public int getId(){
        return id;
    }

    public String getAlbumTitle(){
        return artistTitle;
    }

    public void setArtistTitle(String artistTitle){
        this.artistTitle = artistTitle;
    }
}
