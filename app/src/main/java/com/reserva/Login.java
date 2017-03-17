package com.reserva;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by CECyT9 on 16/03/2017.
 */

public class Login extends Activity implements OnClickListener{
    EditText nombre;
    EditText contra;
    Button envia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        nombre = (EditText) findViewById(R.id.user);

        contra = (EditText) findViewById(R.id.contra);
        envia = (Button) findViewById(R.id.envia);
        envia.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.envia:

                if ((nombre.getText().toString().equals("ulises")) & (contra.getText().toString().equals("123"))) {
                    Toast.makeText(getApplicationContext(),"Bienvenido",Toast.LENGTH_SHORT).show();
                     Intent intento = new Intent(Login.this,MainActivity.class);
                     startActivity(intento);
                     finish();
                } else {
                    Toast.makeText(getApplicationContext(),"Usuario o contraseña incorrecta",Toast.LENGTH_SHORT).show();
                }

            break;
        }
    }
}
