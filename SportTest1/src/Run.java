package com.example.sporttest1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Run extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_run);
    }

    public void clicEnBoton_IrAFlexiones (View view) {
        Intent intent = new Intent(this, Flex.class);
        startActivity(intent);
    }

}