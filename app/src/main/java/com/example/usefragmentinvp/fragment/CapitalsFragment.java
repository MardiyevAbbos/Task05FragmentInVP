package com.example.usefragmentinvp.fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.usefragmentinvp.R;
import com.example.usefragmentinvp.activity.MainActivity;
import com.example.usefragmentinvp.adapter.CapitalAdapter;
import com.example.usefragmentinvp.model.Country;

import java.util.ArrayList;

public class CapitalsFragment extends Fragment {

    private RecyclerView recyclerView;
    private final MainActivity mainActivity;

    public CapitalsFragment(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_capitals_of_countries, container, false);
        initViews(view);
        return view;
    }


    private void initViews(View view) {
        recyclerView = view.findViewById(R.id.rv_capitalOf_countries);
        recyclerView.setLayoutManager(new GridLayoutManager(requireContext(), 1));
        refreshAdapter();
    }


    private void refreshAdapter() {
        ArrayList<Country> countries = mainActivity.prepareCountryList();
        Log.d("@@@country", "countries: "+countries);
        CapitalAdapter adapter = new CapitalAdapter(countries);
        recyclerView.setAdapter(adapter);
    }

}
