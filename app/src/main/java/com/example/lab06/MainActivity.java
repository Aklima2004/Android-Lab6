package com.example.lab06;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private CountryAdapter countryAdapter;
    private List<Country> countryList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        countryList = getListData();
        countryAdapter = new CountryAdapter(this, countryList);
        recyclerView.setAdapter(countryAdapter);
    }

    private List<Country> getListData() {
        List<Country> list = new ArrayList<>();
        list.add(new Country("United States", "usa_flag", 340000000));
        list.add(new Country("Greece", "greece_flag", 10000000));
        list.add(new Country("Japan", "japan_flag", 124000000));
        list.add(new Country("Spain", "spain_flag", 48000000));
        return list;
    }
}
