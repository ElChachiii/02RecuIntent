package com.example.a02recuintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtUser;
    EditText txtPassw;
    Button button;
    String user = "daniel";
    String passw = "joyfe";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtUser = findViewById(R.id.txtUser);
        txtPassw = findViewById(R.id.txtPassw);
        button = findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usuario = txtUser.getText().toString();
                String contraseña = txtPassw.getText().toString();
                if ((usuario.equals(user)) && (contraseña.equals(passw))){
                    Toast.makeText(getApplicationContext(), "Usuario Correcto", Toast.LENGTH_LONG).show();
                    Intent intent= new Intent(getApplicationContext(),Ventana2.class);
                    intent.putExtra("nombre",user);
                    startActivity(intent);
                }else {
                    Toast.makeText(getApplicationContext(), "Usuario Incorrecto", Toast.LENGTH_LONG).show();

                }



            }
        });
    }//Fin onCreate
}