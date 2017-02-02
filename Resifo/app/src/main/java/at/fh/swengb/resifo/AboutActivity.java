package at.fh.swengb.resifo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class AboutActivity extends Activity{
    TextView tvImpressum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.impressum);

        tvImpressum = (TextView)findViewById(R.id.tvIMPRESSUM);
        tvImpressum.setText(

                "\n Gemacht von: \n \n \n Stefan Kogelnik \n Fabian Schopper \n \n \n \n \n Ein Projekt der \n FH Joanneum \n \n"

        );
    }
}
