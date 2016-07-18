package dk.vonfrank.plexify.Controller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import dk.vonfrank.plexify.R;
import dk.vonfrank.plexify.View.LoginFragment;

public class LoginActivity extends AppCompatActivity {

    private LoginFragment lf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        if(savedInstanceState == null){
            lf = new LoginFragment();
            getSupportFragmentManager().beginTransaction().add(R.id.content_fragment_container_extended_toolbar, lf).commit();
        }
    }
}
