package com.lioved.empresas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class Crear_Cargo extends AppCompatActivity {

    private ArrayList<String> names =new ArrayList<>();

    public void save(String name)
    {
        names.add(name);
    }

    public ArrayList<String> getNames()
    {

        return names;
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.crear_cargo);
    }
}