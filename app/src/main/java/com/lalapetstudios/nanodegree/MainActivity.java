package com.lalapetstudios.nanodegree;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.app_bar);
        this.setSupportActionBar(toolbar);

        // Only used for the red button as it uses custom theme.
        // Others are handled in activity_main.xml using android:onClick
        findViewById(R.id.capstone_app_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showSnackBar(v);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void showSnackBar(View view) {

        String snackbarText = "";
        if (view.getId() == R.id.spotify_steamer_btn) {
            snackbarText = "This button will launch the Spotify Streamer app!";
        } else if (view.getId() == R.id.scores_app_btn) {
            snackbarText = "This button will launch the Scores app!";
        } else if (view.getId() == R.id.library_app_btn) {
            snackbarText = "This button will launch the Library app!";
        } else if (view.getId() == R.id.builditbigger_app_btn) {
            snackbarText = "This button will launch the Build It Bigger app!";
        } else if (view.getId() == R.id.xyzreader_app_btn) {
            snackbarText = "This button will launch the XYZ Reader app!";
        } else if (view.getId() == R.id.capstone_app_btn) {
            snackbarText = "This button will launch my capstone app!";
        }

        final View coordinatorLayoutView = findViewById(R.id.snackbarPosition);

        Snackbar
                .make(coordinatorLayoutView, snackbarText, Snackbar.LENGTH_LONG)
                .show();
    }
}
