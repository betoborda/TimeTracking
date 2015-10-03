package pe.com.bitsolutions.dailytime.timetracking.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import pe.com.bitsolutions.dailytime.timetracking.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    private List<String> generarDatos() {
        String[] data = new String[11];
        data[0] = "aa";
        data[1] = "bb";
        data[2] = "bb";
        data[3] = "bb";
        data[4] = "bb";
        data[5] = "bb";
        data[6] = "bb";
        data[7] = "bb";
        data[8] = "bb";
        data[9] = "bb";
        data[10] = "bb";
        return new ArrayList<>(Arrays.asList(data));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View fragmento = inflater.inflate(R.layout.fragment_main, container, false);

        ArrayAdapter<String> tareaAdapter = new ArrayAdapter<String>(
                getActivity(), // contexto
                R.layout.list_item_tarea, // layout ID
                R.id.list_item_tarea_textview, // ID del control
                generarDatos() //
        );

        ListView listaDeTareas = (ListView) fragmento.findViewById(R.id.listview_tarea);
        listaDeTareas.setAdapter(tareaAdapter);

        return fragmento;
    }
}
