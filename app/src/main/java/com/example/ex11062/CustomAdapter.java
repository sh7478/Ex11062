package com.example.ex11062;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    private Context context;
    private Costume costumes[];
    private LayoutInflater inflater;

    public CustomAdapter(Context context, Costume[] costumes) {
        this.context = context;
        this.costumes = costumes;
        this.inflater = (LayoutInflater.from(context));
    }

    @Override
    public int getCount() {
        return costumes.length;
    }

    @Override
    public Object getItem(int i) {
        return costumes[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflater.inflate(R.layout.custom_spinner_layout, viewGroup,false);
        ImageView imgCstm = (ImageView) view.findViewById(R.id.imgCstm);
        TextView tvNameCstm = (TextView) view.findViewById(R.id.tvNameCstm);
        TextView tvCatCstm = (TextView) view.findViewById(R.id.tvCatCstm);
        TextView tvLvlCstm = (TextView) view.findViewById(R.id.tvLvlCstm);
        if(costumes[i] != null) {
            imgCstm.setImageResource(costumes[i].get_img());
            tvNameCstm.setText(costumes[i].get_name());
            tvCatCstm.setText(costumes[i].get_Category());
            tvLvlCstm.setText(String.valueOf(costumes[i].get_level()));
        }
        return view;

    }
}
