package dk.vonfrank.plexify.View;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import dk.vonfrank.plexify.R;

/**
 * Created by Von Frank on 14-07-2016.
 * Song fragment provides the basic GUI, when "songs" have been pressed. "Songs" is also the default view for Plexify.
 */
public class SongFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.song_fragment, container, false);

        // Content goes here

        return view;
    }
}
