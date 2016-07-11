package dk.vonfrank.plexify.Model;

import java.util.ArrayList;

/**
 * Created by Von Frank on 11-07-2016.
 */
public class Playlist {

    private int id;
    private ArrayList<Song> songArrayList;

    public Playlist(){
        songArrayList = new ArrayList<>();
    }

    public void addSong(Song song){
        songArrayList.add(song);
    }

    public ArrayList<Song> getSongArrayList(){
        return songArrayList;
    }
}
