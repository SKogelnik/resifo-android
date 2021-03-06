package at.fh.swengb.resifo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class InputFourActivity extends Activity {
    Person pers;
    String index;

    EditText tfStrasse;
    EditText tfHausNr;
    EditText tfPLZ;
    EditText tfOrt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent intent = this.getIntent();
        Bundle bundle = intent.getExtras();
        pers = (Person)bundle.getSerializable("Person");
        index = intent.getStringExtra("index");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.home4_page);

        tfStrasse = (EditText)findViewById(R.id.tfStreet);
        tfHausNr = (EditText)findViewById(R.id.tfhousenumber);
        tfPLZ = (EditText)findViewById(R.id.tfpostleitzahl);
        tfOrt = (EditText)findViewById(R.id.tfOrt);

        tfStrasse.setText(pers.getStrasse());
        tfHausNr.setText(pers.getHausnr());
        tfPLZ.setText(pers.getPlz());
        tfOrt.setText(pers.getOrt());

    }

    public void onNextPage(View view) {

        String strasse = tfStrasse.getText().toString();
        String hausnr = tfHausNr.getText().toString();
        String plz = tfPLZ.getText().toString();
        String ort = tfOrt.getText().toString();

        if(!(strasse.isEmpty() || hausnr.isEmpty() ||
            plz.isEmpty() || ort.isEmpty()))
        {
            pers.setStrasse(strasse);
            pers.setHausnr(hausnr);
            pers.setPlz(plz);
            pers.setOrt(ort);

            Intent intent = new Intent(this, SummaryActivity.class); //TO DETAILS PAGE
            Bundle bundle = new Bundle();
            bundle.putSerializable("Person", pers);
            intent.putExtras(bundle);
            intent.putExtra("index",""+index);
            startActivity(intent);
        }
        else
            Toast.makeText(this,"Alle Felder ausfüllen!", Toast.LENGTH_LONG).show();

    }

    public void onBack(View view)
    {
        String strasse = tfStrasse.getText().toString();
        String hausnr = tfHausNr.getText().toString();
        String plz = tfPLZ.getText().toString();
        String ort = tfOrt.getText().toString();

        pers.setStrasse(strasse);
        pers.setHausnr(hausnr);
        pers.setPlz(plz);
        pers.setOrt(ort);

        Intent intent = new Intent(this, InputThreeActivity.class); //TO DETAILS PAGE
        Bundle bundle = new Bundle();
        bundle.putSerializable("Person", pers);
        intent.putExtras(bundle);
        intent.putExtra("index",""+index);
        startActivity(intent);
    }

}
