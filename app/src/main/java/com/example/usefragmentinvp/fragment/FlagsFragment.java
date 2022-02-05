package com.example.usefragmentinvp.fragment;

import android.os.Bundle;
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
import com.example.usefragmentinvp.adapter.FlagAdapter;
import com.example.usefragmentinvp.model.Country;

import java.util.ArrayList;

public class FlagsFragment extends Fragment {

    private final MainActivity mainActivity;
    private RecyclerView recyclerView;

    public FlagsFragment(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_flag_of_countries, container, false);
        intiViews(view);
        return view;
    }

    private void intiViews(View view) {
        recyclerView = view.findViewById(R.id.rv_flagOf_countries);
        recyclerView.setLayoutManager(new GridLayoutManager(requireContext(), 1));
        refreshAdapter();
    }

    private void refreshAdapter() {
        ArrayList<Country> countries = mainActivity.prepareCountryList();
        FlagAdapter adapter = new FlagAdapter(countries);
        recyclerView.setAdapter(adapter);
    }

}
