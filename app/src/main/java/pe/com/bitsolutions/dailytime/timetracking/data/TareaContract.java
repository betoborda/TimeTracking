package pe.com.bitsolutions.dailytime.timetracking.data;

import android.net.Uri;
import android.provider.BaseColumns;

/**
 * Created by Alberto on 10/3/2015.
 */
public class TareaContract {

    public static final String CONTENT_AUTHORITY = "pe.com.bitsolutions.dailytime";

    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);

    public static final String PATH_TAREA = "tarea";



    public static final class TareaEstructura implements BaseColumns{

        public static final String NOMBRE_TABLA = "tarea";

        public static final String COLUMNA_NOMBRE = "nombre_tarea";
        public static final String COLUMNA_DESCRIPCION = "descripcion";

    }

    // TODO crear las otras tablas

}
