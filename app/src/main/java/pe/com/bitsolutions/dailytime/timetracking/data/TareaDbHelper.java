package pe.com.bitsolutions.dailytime.timetracking.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import pe.com.bitsolutions.dailytime.timetracking.tools.Logging;

/**
 * Created by Alberto on 10/3/2015.
 */

public class TareaDbHelper extends SQLiteOpenHelper {

    private static final String NOMBRE_BASE_DATOS = "tarea.db";
    private static final int VERSION_BASE_DATOS = 1;

    private String LOG_TAG = TareaDbHelper.class.getSimpleName();

    public TareaDbHelper(Context context) {
        super(context, NOMBRE_BASE_DATOS, null, VERSION_BASE_DATOS);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        Logging.v(LOG_TAG, "onCreate method");
        String SQL_CREATE_TABLE_TAREA = "CREATE TABLE " +
                TareaContract.TareaEstructura.NOMBRE_TABLA + " (" +
                TareaContract.TareaEstructura._ID + " INTEGER PRIMARY KEY," +
                TareaContract.TareaEstructura.COLUMNA_NOMBRE + " TEXT NOT NULL," +
                TareaContract.TareaEstructura.COLUMNA_DESCRIPCION + " TEXT NOT NULL" +
                ")";

        // TODO ... Añadir las otras columnas

        db.execSQL(SQL_CREATE_TABLE_TAREA);
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        Logging.v(LOG_TAG, "onUpgrade method");

    }
}
