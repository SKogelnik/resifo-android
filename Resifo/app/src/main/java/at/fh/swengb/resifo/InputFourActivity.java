package at.fh.swengb.resifo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class InputFourActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home4_page);
    }

    public void onNextPage(View view) {
        Intent myIntent = new Intent(this, MainActivity.class);

        this.startActivity(myIntent);
    }
}
