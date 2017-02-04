package at.fh.swengb.resifo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fabian on 03.02.17.
 */

public class FormularsActivity extends Activity implements AdapterView.OnItemClickListener   {


    private ListView myListView;

    private List listPerson;

    private CustomAdapter myAdapter;

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        String selectedPerson = listPerson.get(i).toString();
        Intent intent = new Intent(view.getContext(),ShowPerson.class);
        intent.putExtra("person", /*(Parcelable)*/ selectedPerson); //TODO: fix pls
        startActivity(intent);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.formulars);
        myListView = (ListView) findViewById(R.id.listViewFormulare);


        DBHandler db = new DBHandler(this);
        List liste = db.getAllPersons();

        listPerson = (List) liste;

        myAdapter = new CustomAdapter(this, listPerson);
        myListView.setAdapter(myAdapter);
    }

}
