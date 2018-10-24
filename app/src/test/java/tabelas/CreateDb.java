package tabelas;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import basicas.Usuario;

public class CreateDb extends SQLiteOpenHelper {

    private static final String dbEscola = "dbEscola";
    private static final int version = 2;


    public CreateDb(Context context) {

        super(context, dbEscola,null,version);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "create table usuario (codUsuario integer primary key autoincrement" +
                ",usuario varchar(30) not null," +
                "senha varchar(8)) not null, perfil enum('ADMINISTRADOR','DIRIGENTE')not null)";
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists usuario");
        onCreate(db);
    }
}
