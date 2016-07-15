package dk.vonfrank.plexify.View;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import dk.vonfrank.plexify.R;

/**
 * Created by Von Frank on 14-07-2016.
 */
public class SongFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.song_fragment, container, false);

        TextView mtextview = (TextView) view.findViewById(R.id.testview);

        mtextview.setText("Hej med dig");

        return view;
    }
}
