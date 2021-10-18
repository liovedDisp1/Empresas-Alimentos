package com.lioved.empresas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import Modelo.Pro;

public class Listado_Productos extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView lstPro;
    private ArrayList<Pro> products = new ArrayList<Pro>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado_productos);

        lstPro = findViewById(R.id.listViewProductos);
        Bundle intent = getIntent().getBundleExtra("extra");

        products = (ArrayList<Pro>) intent.getSerializable("lista");




        ProductAdapter adapter = new ProductAdapter(this,products);
        //ArrayAdapter<Pro> adapter = new ArrayAdapter<Pro>(this, android.R.layout.simple_list_item_1,products);
        lstPro.setAdapter(adapter);
        lstPro.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this,"Producto selecionado "+products.get(position),Toast.LENGTH_SHORT).show();
    }
}