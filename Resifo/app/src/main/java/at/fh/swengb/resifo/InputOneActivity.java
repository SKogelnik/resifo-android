package at.fh.swengb.resifo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;

import java.util.Date;


public class InputOneActivity extends Activity {

    Person pers;
    EditText tfVorname;
    EditText tfNachname;
    EditText tfOldNachname;
    EditText tfGebDat;
    EditText tfGebOrt;
    RadioGroup rgGeschlecht;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.input1_page);

        
        tfVorname = (EditText)findViewById(R.id.tfVorname);
        tfNachname = (EditText)findViewById(R.id.tfNachname);
        tfOldNachname = (EditText)findViewById(R.id.tfNameVorEhe);
        tfGebDat = (EditText)findViewById(R.id.tfGeburtsdatum);
        tfGebOrt = (EditText)findViewById(R.id.tfGeburtsort);
        rgGeschlecht = (RadioGroup) findViewById(R.id.rgGeschlecht);

        pers = new Person();
    }


    public void onNextPage(View view) {
        //Befüllen des Personen Objekts
        pers.setVorname(tfVorname.getText().toString());
        pers.setNachname(tfNachname.getText().toString());
        pers.setOldNachname(tfOldNachname.getText().toString());
        pers.setGeburtsdatum(tfGebDat.getText().toString()); //DATE(?)
        pers.setGeburtsort(tfGebOrt.getText().toString());

        pers.setGeschlecht("männlich");


        Intent intent = new Intent(this, InputTwoActivity.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("Person", pers);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
