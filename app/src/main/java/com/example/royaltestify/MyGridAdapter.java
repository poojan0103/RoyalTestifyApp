package com.example.royaltestify;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyGridAdapter extends BaseAdapter {
    Context context;
    ArrayList<LangModel> langModelArrayList;

    public MyGridAdapter(Context context,ArrayList<LangModel> langModelArrayList){
        this.context = context;
        this.langModelArrayList = langModelArrayList;
    }

    @Override
    public int getCount() {
        return langModelArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return langModelArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = layoutInflater.inflate(R.layout.raw_custom_list,null);

        TextView tvlang = view.findViewById(R.id.tv_lang);
        ImageView imgLang = view.findViewById(R.id.img_lang);
        tvlang.setText(langModelArrayList.get(i).getStrLang());
        imgLang.setImageResource((langModelArrayList.get(i).getImgLang()));


        return view;
    }
}
