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

public class FlagAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private ArrayList<Country> countries;

    public FlagAdapter(ArrayList<Country> countries) {
        this.countries = countries;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout_flag_view, parent, false);
        return new FlagViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof FlagViewHolder) {
            Country country = countries.get(position);
            ImageView image = ((FlagViewHolder) holder).imageFlag;
            TextView name = ((FlagViewHolder) holder).nameCountry;

            image.setImageResource(country.getFlag());
            name.setText(country.getName());
        }
    }

    @Override
    public int getItemCount() {
        return countries.size();
    }


    class FlagViewHolder extends RecyclerView.ViewHolder {
        View view;
        ImageView imageFlag;
        TextView nameCountry;

        FlagViewHolder(View view) {
            super(view);
            this.view = view;
            imageFlag = view.findViewById(R.id.ivFlag_imageOfFlag);
            nameCountry = view.findViewById(R.id.tvFlag_nameOfCountry);
        }
    }

}
