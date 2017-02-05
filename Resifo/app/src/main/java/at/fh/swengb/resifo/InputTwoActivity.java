package at.fh.swengb.resifo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class InputTwoActivity extends Activity {
    Person pers;
    String index;

    EditText tfReligion;
    EditText tfFamilienstand;
    EditText tfNation;
    EditText tfZMR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent intent = this.getIntent();
        Bundle bundle = intent.getExtras();
        pers = (Person)bundle.getSerializable("Person");
        index = intent.getStringExtra("index");


        super.onCreate(savedInstanceState);
        setContentView(R.layout.religion2_page);

        tfReligion = (EditText)findViewById(R.id.tfReligionsbekenntnis);
        tfFamilienstand = (EditText)findViewById(R.id.tfFamilienstand);
        tfNation = (EditText)findViewById(R.id.tfStaatsangehoerigkeit);
        tfZMR = (EditText)findViewById(R.id.tfZMRZahl);

        tfReligion.setText(pers.getReligion());
        tfFamilienstand.setText(pers.getFamilienstand());
        tfNation.setText(pers.getNation());
        tfZMR.setText(pers.getZmr());
    }

    public void onNextPage(View view) {

        String religion = tfReligion.getText().toString();
        String familienstand = tfFamilienstand.getText().toString();
        String nation = tfNation.getText().toString();
        String zmr = tfZMR.getText().toString();


        if(!(religion.isEmpty() || familienstand.isEmpty() || nation.isEmpty()))
        {
            pers.setReligion(religion);
            pers.setFamilienstand(familienstand);
            pers.setNation(nation);
            pers.setZmr(zmr);

            Intent intent = new Intent(this, InputThreeActivity.class);
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
        String religion = tfReligion.getText().toString();
        String familienstand = tfFamilienstand.getText().toString();
        String nation = tfNation.getText().toString();
        String zmr = tfZMR.getText().toString();

        pers.setReligion(religion);
        pers.setFamilienstand(familienstand);
        pers.setNation(nation);
        pers.setZmr(zmr);

        Intent intent = new Intent(this, InputOneActivity.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("Person", pers);
        intent.putExtras(bundle);
        intent.putExtra("index",""+index);
        startActivity(intent);

    }

}
