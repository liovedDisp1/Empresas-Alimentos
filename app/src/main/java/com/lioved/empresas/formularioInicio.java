package com.lioved.empresas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

import Modelo.Pro;

public class formularioInicio extends AppCompatActivity implements View.OnClickListener {

    private EditText txtNombre;
    private EditText txtId;
    private EditText txtCantidad;
    private EditText txtCosto;
    private EditText txtImage;
    private Button btnAgregar;
    private Button btnConsultar;

    private ArrayList<Pro> productos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_inicio);

        productos = new ArrayList<>();

        txtNombre = findViewById(R.id.txtNombreProducto);
        txtId = findViewById(R.id.txtIdProduct);
        txtCantidad = findViewById(R.id.txtCantidadProducto);
        txtCosto = findViewById(R.id.txtPrecioProducto);
        txtImage = findViewById(R.id.txtImageUrl);

        btnAgregar = findViewById(R.id.btnAgregar);
        btnConsultar = findViewById(R.id.btnConsultar);

        btnAgregar.setOnClickListener(this);
        btnConsultar.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnAgregar:
                Pro pro = new Pro();
                pro.setNombre(txtNombre.getText().toString());
                pro.setId(txtId.getText().toString());
                pro.setCantidad(txtCantidad.getText().toString());
                pro.setPrecio(txtCosto.getText().toString());
                pro.setUrlImage(txtImage.getText().toString());
                productos.add(pro);
                this.cleaningForm();
                Toast.makeText(this, "Producto adicionado correctamente",Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnConsultar:

                Bundle extra = new Bundle();
                extra.putSerializable("lista",productos);


                Intent intent = new Intent(this,Listado_Productos.class);
                intent.putExtra("extra",extra);
                startActivity(intent);
                break;

        }
    }
    private void cleaningForm(){
        txtNombre.setText("");
        txtId.setText("");
        txtCantidad.setText("");
        txtCosto.setText("");
        txtImage.setText("");
    }
}