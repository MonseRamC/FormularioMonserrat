package com.example.formulario;


import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    private Button MC;
    private EditText et_nombre_proveedor, et_descripcion, et_contacto,et_articulos, et_precio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_nombre_proveedor = findViewById(R.id.et_nombre_proveedor);
        et_descripcion = findViewById(R.id.et_descripcion);
        et_contacto = findViewById(R.id.et_contacto);
        et_articulos = findViewById(R.id.et_articulos);
        et_precio = findViewById(R.id.et_precio);

        MC = findViewById(R.id.btn_msg);

        MC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { String texto = et_nombre_proveedor.getText().toString();
                String texto2 = et_descripcion.getText().toString();
                String texto3 = et_contacto.getText().toString();
                String texto4 = et_articulos.getText().toString();
                String texto5 = et_precio.getText().toString();
                new AlertDialog.Builder(MainActivity.this)
                        .setMessage("\n Nombre: " + texto +
                                "\n Aprellidos: " + texto2 +
                                "\n Edad: " + texto3 +
                                "\n Estatura: " + texto4 +
                                "\n Domicilio: " + texto5)
                        // Especificar un oyente le permite realizar una acción antes de cerrar el cuadro de diálogo.
                        // El diálogo se descarta automáticamente cuando se hace clic en un botón de diálogo.
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                // Continuar con la operación de eliminación
                            }
                        })
                        .setIcon(android.R.drawable.ic_dialog_alert)
                        .show();
            }
        });
    }
}