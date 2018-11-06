package projetoandroid.unibratec.br.cadastroatletas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuCadastroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_cadastro);

        Button btnCadastroAtleta = (Button)findViewById(R.id.btnCadastroAtleta);
        btnCadastroAtleta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuCadastroActivity.this, CadastroAtletasActivity.class);
                startActivity(intent);
            }
        });
    }
}
