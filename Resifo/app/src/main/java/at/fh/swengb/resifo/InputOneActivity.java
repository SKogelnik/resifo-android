package at.fh.swengb.resifo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class InputOneActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.input1_page);
    }


    public void onNextPage(View view) {
        Intent intent = new Intent(this, InputTwoActivity.class);
        startActivity(intent);
    }
}
