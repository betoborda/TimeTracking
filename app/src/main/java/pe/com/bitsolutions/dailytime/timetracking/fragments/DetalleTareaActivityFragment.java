package pe.com.bitsolutions.dailytime.timetracking.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

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

        View detalleView = inflater.inflate(R.layout.fragment_detalle_tarea, container, false);
        Intent intent = getActivity().getIntent();

        if (intent != null && intent.hasExtra(Intent.EXTRA_TEXT)) {
            String nombreTarea = intent.getStringExtra(Intent.EXTRA_TEXT);

            ((TextView) detalleView.findViewById(R.id.nombre_tarea_text)).
                    setText(nombreTarea);

        }

        return detalleView;
    }
}
