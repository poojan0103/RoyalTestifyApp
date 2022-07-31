package com.example.royaltestify;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class DashboardActivity extends AppCompatActivity {
    GridView gridView;
    String strLang[] = {"Java", "PHP", "C", "C++", "Python"};
    int imgLang[] = {R.mipmap.ic_launcher_round, R.drawable.java, R.drawable.php,
            R.drawable.c, R.drawable.cc, R.drawable.python};
    ArrayList<LangModel> langModelArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        gridView = findViewById(R.id.grid);
        langModelArrayList = new ArrayList<LangModel>();
        for (int i = 0; strLang.length > i; i++) {

            LangModel langModel = new LangModel(strLang[i], imgLang[i]);
            langModelArrayList.add(langModel);

        }
        MyGridAdapter myGridAdapter = new MyGridAdapter(this, langModelArrayList);
        gridView.setAdapter(myGridAdapter);
    }
}