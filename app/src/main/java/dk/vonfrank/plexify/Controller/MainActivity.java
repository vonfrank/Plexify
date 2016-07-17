package dk.vonfrank.plexify.Controller;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import dk.vonfrank.plexify.R;
import dk.vonfrank.plexify.View.SongFragment;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private SongFragment sf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Toolbar must be initialized, in order to create hamburger menu
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        // Initialize drawer layout, and add hamburger menu to toolbar
        drawerLayout = (DrawerLayout)findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        // Add song fragment, to the content_fragment_container. Song fragment is the default fragment
        if(savedInstanceState == null){
            sf = new SongFragment();
            getSupportFragmentManager().beginTransaction().add(R.id.content_fragment_container, sf).commit();
        }
    }
}
