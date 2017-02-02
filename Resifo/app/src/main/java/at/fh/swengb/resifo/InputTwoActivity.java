package at.fh.swengb.resifo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class InputTwoActivity extends Activity {
    Person pers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent intent = this.getIntent();
        Bundle bundle = intent.getExtras();
        pers = (Person)bundle.getSerializable("Person");

        Toast.makeText(this, pers.getVorname(), Toast.LENGTH_LONG).show();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.religion2_page);


    }

    public void onNextPage(View view) {



        Intent myIntent = new Intent(this, InputThreeActivity.class);

        this.startActivity(myIntent);
    }

}
