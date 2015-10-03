package pe.com.bitsolutions.dailytime.timetracking.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import pe.com.bitsolutions.dailytime.timetracking.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    private ArrayAdapter<String> mtareaAdapter;

    public MainActivityFragment() {
    }

    private List<String> generarDatos() {
        String[] data = new String[11];
        data[0] = "aa";
        data[1] = "bb";
        data[2] = "cc";
        data[3] = "dd";
        data[4] = "ee";
        data[5] = "ff";
        data[6] = "gg";
        data[7] = "hh";
        data[8] = "ii";
        data[9] = "jj";
        data[10] = "kk";
        return new ArrayList<>(Arrays.asList(data));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View fragmento = inflater.inflate(R.layout.fragment_main, container, false);

        mtareaAdapter = new ArrayAdapter<String>(
                getActivity(), // contexto
                R.layout.list_item_tarea, // layout ID
                R.id.list_item_tarea_textview, // ID del control
                generarDatos() //
        );

        ListView listaDeTareas = (ListView) fragmento.findViewById(R.id.listview_tarea);
        listaDeTareas.setAdapter(mtareaAdapter);


        listaDeTareas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String tarea = mtareaAdapter.getItem(position);

                Toast.makeText(getActivity(), "Selecciono " + tarea, Toast.LENGTH_LONG).show();
            }
        });


        return fragmento;
    }
}
