package dk.vonfrank.plexify.View;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import dk.vonfrank.plexify.R;

/**
 * Created by Von Frank on 18-07-2016.
 */
public class LoginFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.login_fragment, container, false);

        return view;
    }
}
