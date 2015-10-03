package pe.com.bitsolutions.dailytime.timetracking.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.widget.ShareActionProvider;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import pe.com.bitsolutions.dailytime.timetracking.R;
import pe.com.bitsolutions.dailytime.timetracking.activities.DetalleTareaActivity;
import pe.com.bitsolutions.dailytime.timetracking.tools.Logging;

/**
 * A placeholder fragment containing a simple view.
 */
public class DetalleTareaActivityFragment extends Fragment {

    private String LOG_TAG = DetalleTareaActivity.class.getSimpleName();

    public DetalleTareaActivityFragment() {
        setHasOptionsMenu(true);
        Logging.v(LOG_TAG, "DetalleTareaActivityFragment");
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {

        Logging.v(LOG_TAG, "onCreateOptionsMenu");
        inflater.inflate(R.menu.menu_detalle_tarea_fragment, menu);

        MenuItem menuItem = menu.findItem(R.id.action_compartir);
        ShareActionProvider comparirProvider = (ShareActionProvider)
                MenuItemCompat.getActionProvider(menuItem);

        Intent compartirIntent = new Intent(Intent.ACTION_SEND);
        compartirIntent.setType("text/plain");
        compartirIntent.putExtra(Intent.EXTRA_TEXT, "cadena para compartir");

        if (comparirProvider != null) {
            comparirProvider.setShareIntent(compartirIntent);
        } else {
            Logging.v(LOG_TAG, "Proveedor para compartir nulo");
        }
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
