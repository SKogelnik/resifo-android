package at.fh.swengb.resifo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class InputThreeActivity extends Activity{

    Person pers;

    EditText tfRNummer;
    EditText tfAusstellungsdat;
    EditText tfBehörde;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.travel3_page);

        tfRNummer = (EditText)findViewById(R.id.tfNummer);
        tfAusstellungsdat = (EditText)findViewById(R.id.tfAusstellungsdatum);
        tfBehörde = (EditText)findViewById(R.id.tfBehoerde);
    }

    public void onNextPage(View view) {

        Intent myIntent = new Intent(this, InputFourActivity.class);
        this.startActivity(myIntent);
    }
}
