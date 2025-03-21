package com.example.lab06;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.BaseAdapter;
import java.util.List;

public class CustomListAdapter extends BaseAdapter {

    private List<Country> listData;
    private LayoutInflater layoutInflater;
    private Context context;

    public CustomListAdapter(Context context, List<Country> listData) {
        this.context = context;
        this.listData = listData;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return listData.size();
    }

    @Override
    public Object getItem(int position) {
        return listData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.list_item_layout, parent, false);
        }

        ImageView flagView = convertView.findViewById(R.id.image_flag);
        TextView countryNameView = convertView.findViewById(R.id.text_country);
        TextView populationView = convertView.findViewById(R.id.text_population);

        Country country = listData.get(position);
        countryNameView.setText(country.getCountryName());
        populationView.setText("Population: " + country.getPopulation());

        int flagResId = context.getResources().getIdentifier(country.getFlagName(), "drawable", context.getPackageName());
        flagView.setImageResource(flagResId);

        return convertView;
    }
}
