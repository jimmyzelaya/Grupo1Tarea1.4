package com.aplication.tarea4;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;

import com.aplication.tarea4.tablas.Empleados;

import java.io.ByteArrayInputStream;

public class detalleMFoto extends AppCompatActivity {
    ImageView imageViewMostrarIMG;

    EditText Nombre, Descripcion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_mfoto);


        imageViewMostrarIMG = (ImageView) findViewById(R.id.IMGVMostrarFotoP);
        Nombre = (EditText) findViewById(R.id.txtMostNombre);
        Descripcion = (EditText) findViewById(R.id.txtMostDescripcion);
        Bundle objetEnvia = getIntent().getExtras();
        Empleados imagen = null;

        if(objetEnvia != null){
            imagen = (Empleados) objetEnvia.getSerializable("empleados");

            Nombre.setText(imagen.getNombres());
            Descripcion.setText(imagen.getDescripcion());
            mostrarImagen(imagen.getImage());
            Bitmap image = BitmapFactory.decodeFile(imagen.getPathImage());
            imageViewMostrarIMG.setImageBitmap(image);
        }

    }

    private void mostrarImagen(byte[] image) {
        Bitmap bitmap = null;
        ByteArrayInputStream bais = new ByteArrayInputStream(image);
        bitmap = BitmapFactory.decodeStream(bais);
        imageViewMostrarIMG.setImageBitmap(bitmap);
    }

}