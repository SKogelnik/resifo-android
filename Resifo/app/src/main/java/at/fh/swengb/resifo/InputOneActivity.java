package at.fh.swengb.resifo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;


public class InputOneActivity extends Activity {

    Person pers;
    EditText tfVorname;
    EditText tfNachname;
    EditText tfOldNachname;
    EditText tfGebDat;
    EditText tfGebOrt;
    RadioGroup rgGeschlecht;
    RadioButton rbMann;
    RadioButton rbFrau;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.input1_page);

        Intent intent = this.getIntent();
        Bundle bundle = intent.getExtras();
        pers = (Person)bundle.getSerializable("Person");

        
        tfVorname = (EditText)findViewById(R.id.tfVorname);
        tfNachname = (EditText)findViewById(R.id.tfNachname);
        tfOldNachname = (EditText)findViewById(R.id.tfNameVorEhe);
        tfGebDat = (EditText)findViewById(R.id.tfGeburtsdatum);
        tfGebOrt = (EditText)findViewById(R.id.tfGeburtsort);
        rgGeschlecht = (RadioGroup) findViewById(R.id.rgGeschlecht);
        rbFrau=(RadioButton)findViewById(R.id.ButtonWeiblich);
        rbMann=(RadioButton)findViewById(R.id.ButtonMaennlich);



        tfVorname.setText(pers.getVorname());
        tfNachname.setText(pers.getNachname());
        tfOldNachname.setText(pers.getOldNachname());
        tfGebDat.setText(pers.getGeburtsdatum());
        tfGebOrt.setText(pers.getGeburtsort());

        if(pers.getGeschlecht()==rbMann.getText().toString())
            rbMann.setChecked(true);
        else if(pers.getGeschlecht()==rbFrau.getText().toString())
            rbFrau.setChecked(true);


    }

    boolean isLegalDate(String s) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.mm.yyyy");
        sdf.setLenient(false);
        return sdf.parse(s, new ParsePosition(0)) != null;
    }


    public void onNextPage(View view) {
        //Befüllen des Personen Objekts
        String vorname = tfVorname.getText().toString();
        String nachname = tfNachname.getText().toString();
        String oldNachname = tfOldNachname.getText().toString();
        String geburtsort = tfGebOrt.getText().toString();
        String geschlecht = ((RadioButton)findViewById(rgGeschlecht.getCheckedRadioButtonId())).getText().toString();
        String geburtsDat = tfGebDat.getText().toString();



        if (!(vorname.isEmpty() || nachname.isEmpty() || oldNachname.isEmpty() ||
                geburtsort.isEmpty() || geschlecht.isEmpty()))
        {
            if (isLegalDate(geburtsDat)) {
                pers.setGeburtsdatum(geburtsDat);

                pers.setVorname(vorname);
                pers.setNachname(nachname);
                pers.setOldNachname(oldNachname);
                pers.setGeburtsort(geburtsort);
                pers.setGeschlecht(geschlecht);

                Intent intent = new Intent(this, InputTwoActivity.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("Person", pers);
                intent.putExtras(bundle);
                startActivity(intent);
            }
            else
                Toast.makeText(this,"Ungültiges Datumsformat!", Toast.LENGTH_LONG).show();
        }
        else
            Toast.makeText(this,"Alle Felder ausfüllen!", Toast.LENGTH_LONG).show();

    }
}
