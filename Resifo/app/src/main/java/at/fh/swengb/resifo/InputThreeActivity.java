package at.fh.swengb.resifo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class InputThreeActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.travel3_page);
    }

    public void onNextPage(View view) {
        Intent myIntent = new Intent(this, InputFourActivity.class);

        this.startActivity(myIntent);
    }
}
