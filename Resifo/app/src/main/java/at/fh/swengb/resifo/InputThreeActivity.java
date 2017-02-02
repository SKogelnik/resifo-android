package at.fh.swengb.resifo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Stefan on 02.02.2017.
 */

public class InputThreeActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.travel3_page);
    }

    public void onUnderstand(View view) {
        Intent myIntent = new Intent(this, InputOneActivity.class);

        this.startActivity(myIntent);
    }
}
