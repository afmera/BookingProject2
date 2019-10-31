package com.example.bookingproject.utils;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.bookingproject.R;

public class DrawerListAdapter extends ArrayAdapter {
    public DrawerListAdapter(@NonNull Context context, int resource) {
        super(context, resource);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) parent.getContext().
                    getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.app_bar_menu__principal_, null);
        }
        TextView textView_nombUsuario = (TextView) convertView.findViewById(R.id.NombreUsuarioTextView);
        textView_nombUsuario.setText("Desconocido");
        return convertView;
    }
}
