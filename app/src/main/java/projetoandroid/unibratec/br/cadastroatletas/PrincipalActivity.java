package projetoandroid.unibratec.br.cadastroatletas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Spinner;
import static projetoandroid.unibratec.br.cadastroatletas.R.drawable.security_keyandlock;

public class PrincipalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(security_keyandlock);


    }

    public void chamarPrincipal(View view){

        Spinner combo = findViewById(R.id.spinner);
        if(combo.getSelectedItem().equals("ADMINISTRADOR")) {
            Intent it = new Intent(this, MenuCadastroActivity.class);
            startActivity(it);
        }

    }

}
