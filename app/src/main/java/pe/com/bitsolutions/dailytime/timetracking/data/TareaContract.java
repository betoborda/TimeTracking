package pe.com.bitsolutions.dailytime.timetracking.data;

import android.provider.BaseColumns;

/**
 * Created by Alberto on 10/3/2015.
 */
public class TareaContract {

    public static final class TareaEstructura implements BaseColumns{

        public static final String NOMBRE_TABLA = "tarea";

        public static final String COLUMNA_NOMBRE = "nombre_tarea";
        public static final String COLUMNA_DESCRIPCION = "descripcion";

    }


}
