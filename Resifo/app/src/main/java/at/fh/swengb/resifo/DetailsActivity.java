package at.fh.swengb.resifo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class DetailsActivity extends Activity {

    Person pers;

    TextView tvVorname;
    TextView tvNachname;
    TextView tvOldNachname;
    TextView tvGebDat;
    TextView tvGebOrt;
    TextView tvGeschlecht;
    TextView tvReligon;
    TextView tvFamilienstand;
    TextView tvNation;
    TextView tvZMR;
    TextView tvReisedokNr;
    TextView tvAusstellDat;
    TextView tvBehoerde;
    TextView tvStrasse;
    TextView tvHausNr;
    TextView tvPLZ;
    TextView tvOrt;

    int index;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent intent = this.getIntent();

        index = Integer.parseInt(intent.getStringExtra("Person"));

        DBHandler db = new DBHandler(this);

        pers = db.getPerson(index);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.details);

        Button btnChange = (Button)findViewById(R.id.btnChange);
        Button btnOk = (Button)findViewById(R.id.btnOk);
        Button btnDel = (Button)findViewById(R.id.btnDelete);
        btnDel.setVisibility(View.VISIBLE);
        btnOk.setVisibility(View.GONE);
        btnChange.setVisibility(View.VISIBLE);

        tvVorname = (TextView)findViewById(R.id.tvDetailsVorName);
        tvNachname = (TextView)findViewById(R.id.tvDetailsNachname);
        tvOldNachname = (TextView)findViewById(R.id.tvDetailsNameVorEhe);
        tvGebDat = (TextView)findViewById(R.id.tvDetailsGeburtsdatum);
        tvGebOrt = (TextView)findViewById(R.id.tvDetailsGeburtsOrt);
        tvGeschlecht = (TextView)findViewById(R.id.tvDetailsGeschlecht);
        tvReligon = (TextView)findViewById(R.id.tvDetailsReligion);
        tvFamilienstand = (TextView)findViewById(R.id.tvDetailsFamilienstand);
        tvNation = (TextView)findViewById(R.id.tvDetailsStaatsangehoerigkeit);
        tvZMR = (TextView)findViewById(R.id.tvDetailsZMRZahl);
        tvReisedokNr = (TextView)findViewById(R.id.tvDetailsNummer);
        tvAusstellDat = (TextView)findViewById(R.id.tvDetailsAusstellungsdatum);
        tvBehoerde = (TextView)findViewById(R.id.tvDetailsAusstellendeBehoerde);
        tvStrasse = (TextView)findViewById(R.id.tvDetailsStrasse);
        tvHausNr = (TextView)findViewById(R.id.tvDetailsHausnummer);
        tvPLZ = (TextView)findViewById(R.id.tvDetailsPostleitzahl);
        tvOrt = (TextView)findViewById(R.id.tvDetailsOrt);

        tvVorname.setText(pers.getVorname());
        tvNachname.setText(pers.getNachname());
        tvOldNachname.setText(pers.getOldNachname());
        tvGebDat.setText(pers.getGeburtsdatum());
        tvGebOrt.setText(pers.getGeburtsort());
        tvGeschlecht.setText(pers.getGeschlecht());
        tvReligon.setText(pers.getReligion());
        tvFamilienstand.setText(pers.getFamilienstand());
        tvNation.setText(pers.getNation());
        tvZMR.setText(pers.getZmr());
        tvReisedokNr.setText(pers.getDokNummer());
        tvAusstellDat.setText(pers.getAusstellDat());
        tvBehoerde.setText(pers.getAusstellBeh());
        tvStrasse.setText(pers.getStrasse());
        tvHausNr.setText(pers.getHausnr());
        tvPLZ.setText(pers.getPlz());
        tvOrt.setText(pers.getOrt());
    }

    public void onSaveForm(View view)
    {

        Intent intent = new Intent(this, FormularsActivity.class);
        startActivity(intent);
    }

    public void onDeleteForm(View view)
    {
        DBHandler db = new DBHandler(this);
        db.deletePerson(index);

        Toast.makeText(this, "Formular gelöscht!", Toast.LENGTH_LONG).show();


        Intent intent = new Intent(this, FormularsActivity.class);
        startActivity(intent);
    }

    public void onChangeForm (View view)
    {
        Intent intent = new Intent(this, InputOneActivity.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("Person", pers);
        intent.putExtras(bundle);
        intent.putExtra("index",""+index);
        startActivity(intent);
    }


}
