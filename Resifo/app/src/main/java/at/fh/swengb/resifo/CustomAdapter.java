package at.fh.swengb.resifo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by fabian on 03.02.17.
 */
public class CustomAdapter extends android.widget.BaseAdapter {

    List listPersons;
    Context context;
    LayoutInflater inflter;

    public CustomAdapter(Context applicationContext, List<Person> listPersons) {
        this.context = applicationContext;
        this.listPersons= listPersons;
        inflter = (LayoutInflater.from(applicationContext));
    }


    @Override
    public int getCount() {
        return listPersons.size();
    }

    @Override
    public Object getItem(int i) { return listPersons.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view==null) {
            view = inflter.inflate(R.layout.row_item, null);//set layout for displaying items
        }
        TextView viewVorname=(TextView)view.findViewById(R.id.tvRowVorname);
        TextView viewNachname=(TextView)view.findViewById(R.id.tvRowNachname);

        //person = listPersons.get(i);
        viewVorname.setText(listPersons.get(i).toString());
        //viewNachname.setText(person.getNachname());


        return view;
    }


}
