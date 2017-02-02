package at.fh.swengb.resifo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class InputTwoActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.religion2_page);
    }

    public void onUnderstand(View view) {
        Intent myIntent = new Intent(this, InputThreeActivity.class);

        this.startActivity(myIntent);
    }

}
