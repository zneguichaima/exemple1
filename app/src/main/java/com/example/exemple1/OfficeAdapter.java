package com.example.exemple1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class OfficeAdapter extends ArrayAdapter<Office> {
    public OfficeAdapter(@NonNull Context context, int resource) {
        super(context, resource);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View itemView = convertView;
        layoutInflater layoutInflater =(layoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (itemView == null) {
            itemView = getLayoutInflater().inflate(R.layout.office_cell, parent,false); }
        Office currentOffice = myOffice.get(position);
        ImageView imageView = (ImageView)itemView.findViewById(R.id.image1);
        imageView.setImageResource(currentOffice.getIconId());
        TextView TextName = (TextView) itemView.findViewById(R.id.name);
        makeText.setText(currentOffice.getName());
        TextView TextDescription =(TextView) itemView.findViewById(R.id.description);
        TextPrice.setText(currentOffice.getPrice());
        return itemView;



}}
