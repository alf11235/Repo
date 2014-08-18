package com.example.el_deporte;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Correr extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_correr);
    }

    public void clicEnBoton_IrAFlexiones (View view) {
        Intent intent = new Intent(this, Flexiones.class);
        startActivity(intent);
    }

}