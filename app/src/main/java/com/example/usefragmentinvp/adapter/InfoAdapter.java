package com.example.usefragmentinvp.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.usefragmentinvp.R;
import com.example.usefragmentinvp.model.Country;

import java.util.ArrayList;

public class InfoAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private ArrayList<Country> countries;

    public InfoAdapter(ArrayList<Country> countries) {
        this.countries = countries;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout_info_view, parent, false);
        return new InfoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof InfoViewHolder) {
            Country country = countries.get(position);
            TextView info = ((InfoViewHolder) holder).info;

            String allInfo = ("   "+country.getInfo());
            info.setText(allInfo);
        }
    }

    @Override
    public int getItemCount() {
        return countries.size();
    }


    class InfoViewHolder extends RecyclerView.ViewHolder {
        View view;
        TextView info;

        InfoViewHolder(View view) {
            super(view);
            this.view = view;
            info = view.findViewById(R.id.tvInfo_infoCountry);
        }
    }

}
