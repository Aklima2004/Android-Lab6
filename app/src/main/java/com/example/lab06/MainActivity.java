package com.example.lab06;

import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Country> countryList = new ArrayList<>();
        countryList.add(new Country("Vietnam", "vn_flag", 98000000));
        countryList.add(new Country("United States", "usa_flag", 340000000));
        countryList.add(new Country("Russia", "ru_flag", 142000000));

        ListView listView = findViewById(R.id.listView);
        CustomListAdapter adapter = new CustomListAdapter(this, countryList);
        listView.setAdapter(adapter);
    }
}
