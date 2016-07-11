package dk.vonfrank.plexify.Model;

/**
 * Created by Von Frank on 11-07-2016.
 */
public class Song {

    private int id;
    private String songTitle;
    private Artist artist;
    private Album album;

    public Song(int id, String songTitle, Artist artist, Album album){
        this.id = id;
        this.songTitle = songTitle;
        this.artist = artist;
        this.album = album;
    }

    public int getId(){
        return id;
    }

    public String getTitle(){
        return songTitle;
    }

    public void setSongTitle(String songTitle){
        this.songTitle = songTitle;
    }

    public Artist getArtist(){
        return artist;
    }

    public void setArtist(Artist artist){
        this.artist = artist;
    }

    public Album getAlbum(){
        return album;
    }

    public void setAlbum(Album album){
        this.album = album;
    }
}
