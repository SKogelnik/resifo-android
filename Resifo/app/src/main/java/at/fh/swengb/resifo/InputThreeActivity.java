package at.fh.swengb.resifo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;


public class InputThreeActivity extends Activity{

    Person pers;
    String index;

    EditText tfRNummer;
    EditText tfAusstellungsdat;
    EditText tfBehoerde;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Intent intent = this.getIntent();
        Bundle bundle = intent.getExtras();
        pers = (Person)bundle.getSerializable("Person");
        index = intent.getStringExtra("index");


        super.onCreate(savedInstanceState);
        setContentView(R.layout.travel3_page);

        tfRNummer = (EditText)findViewById(R.id.tfNummer);
        tfAusstellungsdat = (EditText)findViewById(R.id.tfAusstellungsdatum);
        tfBehoerde = (EditText)findViewById(R.id.tfBehoerde);

        tfRNummer.setText(pers.getDokNummer());
        tfAusstellungsdat.setText(pers.getAusstellDat());
        tfBehoerde.setText(pers.getAusstellBeh());
    }

    boolean isLegalDate(String s) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.mm.yyyy");
        sdf.setLenient(false);
        return sdf.parse(s, new ParsePosition(0)) != null;
    }

    public void onNextPage(View view) {

        String dokNummer = tfRNummer.getText().toString();
        String ausstellDat = tfAusstellungsdat.getText().toString();
        String behoerde = tfBehoerde.getText().toString();

        if(!(dokNummer.isEmpty() || ausstellDat.isEmpty() || behoerde.isEmpty()) )
        {
            if(isLegalDate(ausstellDat))
            {
                pers.setDokNummer(dokNummer);
                pers.setAusstellDat(ausstellDat);
                pers.setAusstellBeh(behoerde);

                Intent intent = new Intent(this, InputFourActivity.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("Person", pers);
                intent.putExtras(bundle);
                intent.putExtra("index",""+index);
                startActivity(intent);
            }
            else
                Toast.makeText(this,"Ungültiges Datumsformat!", Toast.LENGTH_LONG).show();
        }
        else
            Toast.makeText(this,"Alle Felder ausfüllen!", Toast.LENGTH_LONG).show();


    }

    public void onBack(View view) {
        String dokNummer = tfRNummer.getText().toString();
        String ausstellDat = tfAusstellungsdat.getText().toString();
        String behoerde = tfBehoerde.getText().toString();

        pers.setDokNummer(dokNummer);
        pers.setAusstellDat(ausstellDat);
        pers.setAusstellBeh(behoerde);

        Intent intent = new Intent(this, InputTwoActivity.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("Person", pers);
        intent.putExtras(bundle);
        intent.putExtra("index",""+index);
        startActivity(intent);

    }
}
