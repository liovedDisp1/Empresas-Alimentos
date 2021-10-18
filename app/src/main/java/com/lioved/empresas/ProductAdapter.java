package com.lioved.empresas;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import Modelo.Pro;

public class ProductAdapter extends BaseAdapter {

    protected Activity activity;
    protected ArrayList<Pro> product;

    public ProductAdapter(Activity activity, ArrayList<Pro> product) {
        this.activity = activity;
        this.product = product;
    }

    @Override
    public int getCount() {
        return product.size();
    }

    @Override
    public Object getItem(int position) {
        return product.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertview, ViewGroup parent) {
        View v = convertview;
        if(convertview == null){
            LayoutInflater inf = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inf.inflate(R.layout.product_item,null);
        }
        Pro proElement = product.get(position);

        TextView txtNombreProduct = v.findViewById(R.id.txtNombreProduct);
        txtNombreProduct.setText(proElement.getNombre());

        TextView txtIdProducto = v.findViewById(R.id.txtIdProducto);
        txtIdProducto.setText(proElement.getId());

        TextView txtCantidadProduct = v.findViewById(R.id.txtCantidadProduct);
        txtCantidadProduct.setText(proElement.getCantidad());

        TextView txtPrecioProduct = v.findViewById(R.id.txtPrecioProduct);
        txtPrecioProduct.setText(proElement.getPrecio());

        ImageView imagenView = v.findViewById(R.id.imagenView);
        Picasso.get().load(proElement.getUrlImage()).into(imagenView);
        return v;

    }
}
