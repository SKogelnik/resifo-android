package at.fh.swengb.resifo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class InstructionActivity extends Activity{

    TextView instruction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.instruction_page);

        instruction = (TextView)findViewById(R.id.instructionText  );
        instruction.setText(

                        "ANLEITUNG \n" +
                        "ANLEITUNG \n" +
                        "ANLEITUNG \n" +
                        "ANLEITUNG \n" +
                        "ANLEITUNG \n" +
                        "ANLEITUNG \n" +
                        "ANLEITUNG \n"

        );


    }

    public void onUnderstand(View view) {
        Intent myIntent = new Intent(this, InputOneActivity.class);

        this.startActivity(myIntent);
    }

}
