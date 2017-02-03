package at.fh.swengb.resifo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DBHandler db = new DBHandler(this);
        List liste = db.getAllPersons();

        List testid = (List)liste.get(0);

    }


    public void onNewFormular(View view) {
        Intent myIntent = new Intent(this, InstructionActivity.class);

        this.startActivity(myIntent);
    }

    public void onShowFormulars(View view) {

    }

    public void onAbout(View view) {
        Intent intent = new Intent(this, AboutActivity.class);
        startActivity(intent);
    }
}
