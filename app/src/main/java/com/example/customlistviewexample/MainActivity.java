package com.example.customlistviewexample;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
{
    ListView listView;

    List<String> meyveler;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        meyveler = new ArrayList<>();
        meyveler.add("Elma");
        meyveler.add("Armut");
        meyveler.add("Çilek");
        meyveler.add("Muz");
        meyveler.add("Karpuz");
        meyveler.add("Mango");

        CustomAdapter adapter = new CustomAdapter(this, meyveler);
        listView.setAdapter(adapter);
    }
}