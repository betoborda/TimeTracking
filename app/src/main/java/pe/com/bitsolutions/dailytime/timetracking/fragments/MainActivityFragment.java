package pe.com.bitsolutions.dailytime.timetracking.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.List;

import pe.com.bitsolutions.dailytime.timetracking.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    private List<String> generarDatos() {
        return null;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);

        ArrayAdapter<String> tareaAdapter = new ArrayAdapter<String>(
                getActivity(), // contexto
                R.layout.list_item_tarea, // layout ID
                R.id.list_item_tarea_textview, // ID del control
                generarDatos() //
        );

        return root;
    }
}
