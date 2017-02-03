package at.fh.swengb.resifo;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class SummaryActivity extends Activity{
    Person pers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent intent = this.getIntent();
        Bundle bundle = intent.getExtras();
        pers = (Person)bundle.getSerializable("Person");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.details);
        
    }
}
