package com.example.usefragmentinvp.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.usefragmentinvp.R;
import com.example.usefragmentinvp.model.Country;

import java.util.ArrayList;

public class CapitalAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private ArrayList<Country> countries;

    public CapitalAdapter(ArrayList<Country> countries) {
        this.countries = countries;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout_capital_view, parent, false);
        return new CapitalViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof CapitalViewHolder) {
            Country country = countries.get(position);
            TextView countryName = ((CapitalViewHolder) holder).countryName;
            TextView capitalName = ((CapitalViewHolder) holder).capitalName;
            ImageView image = ((CapitalViewHolder) holder).imageFlag;

            countryName.setText(country.getName());
            capitalName.setText(country.getCapital());
            image.setImageResource(country.getFlag());
        }
    }

    @Override
    public int getItemCount() {
        return countries.size();
    }


    class CapitalViewHolder extends RecyclerView.ViewHolder {
        View view;
        TextView countryName;
        TextView capitalName;
        ImageView imageFlag;

        CapitalViewHolder(View view) {
            super(view);
            this.view = view;
            countryName = view.findViewById(R.id.tvCapital_nameOfCountry);
            capitalName = view.findViewById(R.id.tvCapital_nameOfCapital);
            imageFlag = view.findViewById(R.id.ivCapital_imageFlag);
        }
    }

}
