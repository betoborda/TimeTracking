package pe.com.bitsolutions.dailytime.timetracking.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Alberto on 10/3/2015.
 */

public class TareaDbHelper extends SQLiteOpenHelper {

    private static final String NOMBRE_BASE_DATOS = "tarea.db";
    private static final int VERSION_BASE_DATOS = 1;

    public TareaDbHelper(Context context) {
        super(context, NOMBRE_BASE_DATOS, null, VERSION_BASE_DATOS);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
