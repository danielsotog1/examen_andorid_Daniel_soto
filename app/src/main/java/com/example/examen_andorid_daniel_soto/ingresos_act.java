package com.example.examen_andorid_daniel_soto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import objetos.Animal;

public class ingresos_act extends AppCompatActivity {

    private Spinner animal;
    private Spinner enfermedad;
    private TextView cotizacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingresos);


        animal = (Spinner) findViewById(R.id.animal);
        enfermedad = (Spinner) findViewById(R.id.enfermedad);
        cotizacion = (TextView) findViewById(R.id.cotizacion);


        Enfermedad enf = new Enfermedad();

        ArrayAdapter adapAnimal = new ArrayAdapter(this, android.R.layout.simple_list_item_1, enf.getEnfermedad());

        Animal ani = new Animal();

        ArrayAdapter adapEnfermedad = new ArrayAdapter(this, android.R.layout.simple_list_item_1, ani.getAnimal());

        animal.setAdapter(adapAnimal);
        enfermedad.setAdapter(adapEnfermedad);

    }

    public void Calcular(View view) {

        Animal ani = new Animal();
        Enfermedad enf = new Enfermedad();

        if (animal.getSelectedItem().toString().equals("Animal Domestico") && enfermedad.getSelectedItem().toString().equals("Brucelosis")) {
            cotizacion.setText("La Cotizacion final es  : " + (25000 + 70000));


        }

        if (animal.getSelectedItem().toString().equals("Animal Salvaje ") && enfermedad.getSelectedItem().toString().equals("Brucelosis")) {
            cotizacion.setText("La Cotizacion final es: " + (45000 + 75000));

        }

        if (animal.getSelectedItem().toString().equals("Otro") && enfermedad.getSelectedItem().toString().equals("Brucelosis")) {
            cotizacion.setText("La Cotizacion final es:  " + (18000 + 75000));

        }

        if (animal.getSelectedItem().toString().equals("Animal Domestico") && enfermedad.getSelectedItem().equals("Fiebre Aftosa")) {
            cotizacion.setText("La Cotizacion final es: " + ( + 150));


        }

        if (animal.getSelectedItem().toString().equals("Jacinta") && enfermedad.getSelectedItem().toString().equals("Porcelana")) {
            cotizacion.setText("El costo final es : " + (12500 + 350));


        }

    }
}