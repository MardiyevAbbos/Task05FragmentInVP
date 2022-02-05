package com.example.usefragmentinvp.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.usefragmentinvp.R;
import com.example.usefragmentinvp.adapter.ViewpagerAdapter;
import com.example.usefragmentinvp.fragment.CapitalsFragment;
import com.example.usefragmentinvp.fragment.FlagsFragment;
import com.example.usefragmentinvp.fragment.InfoFragment;
import com.example.usefragmentinvp.model.Country;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ViewpagerAdapter viewpagerAdapter;
    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

    }

    private void initViews() {
        viewPager = findViewById(R.id.viewPager_pager);
        viewpagerAdapter = new ViewpagerAdapter(getSupportFragmentManager());

        viewpagerAdapter.add(new CapitalsFragment((MainActivity) this), "Capitals");
        viewpagerAdapter.add(new FlagsFragment((MainActivity) this), "Flags");
        viewpagerAdapter.add(new InfoFragment((MainActivity) this), "Info");

        viewPager.setAdapter(viewpagerAdapter);

        tabLayout = findViewById(R.id.tabLayout_pager);
        tabLayout.setupWithViewPager(viewPager);
    }


    public ArrayList<Country> prepareCountryList() {
        ArrayList<Country> countries = new ArrayList<>();
        int index = 1;
        for (int i = 1; i < 5; i++) {
            countries.add(new Country((index++) + ")Uzbekiston", "Toshkent", "Oʻzbekiston (rasman: Oʻzbekiston Respublikasi) — Markaziy Osiyoning markaziy qismida joylashgan mamlakat. Maydoni — 448,978[5] km2. Aholi soni (2022) — 35,111,621[6].", R.drawable.uzb));
            countries.add(new Country((index++) + ")Qozog`iston", "Nur-Sulton", "Qozogʻiston yoki Qozogʻiston Respublikasi (qozoqcha: Қазақстан, Qazaqstan, Қазақстан Республикасы, Qazaqstan Respublikası) – Oʻrta Osiyoda joylashgan mamlakat.Qozogʻiston yer maydoni boʻyicha (2 million 724,9 ming km²) jahonda 9-oʻrinda turadi.", R.drawable.qozoq));
            countries.add(new Country((index++) + ")Qirg`iziston", "Bishkek", "Qirgʻiziston (Qirgʻizcha: Kirgizstan — Ruscha: Kirgizstan), Qirgʻiz Respublikasi (Qirgʻizcha. Kirgiz Respublikasi — Ruscha. Kirgizskaya Respublika) — Oʻrta Osiyoning shimoli-sharqida joylashgan davlat. Qirg'izistonning aholisi soni 6 550 000 kishi.", R.drawable.qirgiz));
            countries.add(new Country((index++) + ")Tojikiston", "Dushanbe", "Tojikiston (tojikcha: Тоҷикистон), Tojikiston Respublikasi (tojikcha. Ҷумҳурии Тоҷикистон) — Oʻrta Osiyoning janubi-sharqida joylashgan davlat. Maydoni 143.100 ming km². Aholisi 8,486,300 kishi (2014).", R.drawable.tojik));
            countries.add(new Country((index++) + ")Turkmaniston", "Ashxobod", "Turkmaniston (turkmancha. Türkmenistan), Turkmaniston Respublikasi (turkmancha. Türkmenistan Respublikasy) — Markaziy Osiyodagi suveren davlat. Mamlakat aholisi 6 millionni tashkil etadi.", R.drawable.turkman));
        }
        return countries;
    }


}