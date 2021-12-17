package com.example.examen_andorid_daniel_soto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText user, pass;
    private TextView msj;
    private Administrador adm= new Administrador();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        user = (EditText)findViewById(R.id.etuser);
        pass =(EditText)findViewById(R.id.etpass);
        msj = (TextView)findViewById(R.id.msj);
    }
    public void LoadSesion(View view)
    {
        String usuario = user.getText().toString().trim();
        String contraseña = pass.getText().toString().trim();

        String userObj = adm.getUser().trim();
        String passObj = adm.getPass().trim();

        switch (usuario)
        {
            case "Daniel":
                if(usuario.equals(userObj) && contraseña.equals(passObj))
                {
                    Intent i = new Intent(this, home_act.class);
                    startActivity(i);
                }
                break;
            case "":
                if(usuario.equals("") && contraseña.equals(""))
                {
                    msj.setText("campos vacios por favor intente nuevamente ");
                }
            default:
                if(!usuario.equals(userObj) && !contraseña.equals(passObj))
                {
                    msj.setText("campos incorrectos intente nuevamente");
                }
                break;
        }
    }
}