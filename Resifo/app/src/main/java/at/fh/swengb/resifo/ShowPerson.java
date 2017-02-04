package at.fh.swengb.resifo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by fabian on 03.02.17.
 */
public class ShowPerson extends Activity{

    private Person person;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details);
        Intent intent = getIntent();
        person = (Person) intent.getExtras().get("person");


    }
}
