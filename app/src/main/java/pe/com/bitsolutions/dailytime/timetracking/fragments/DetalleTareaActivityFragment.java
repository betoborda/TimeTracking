package pe.com.bitsolutions.dailytime.timetracking.fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import pe.com.bitsolutions.dailytime.timetracking.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class DetalleTareaActivityFragment extends Fragment {

    public DetalleTareaActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_detalle_tarea, container, false);
    }
}
