package com.fcbarcelona.mobile.socios;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MatchesActivity extends AppCompatActivity {
    private static final String[] DATA = new String[] {
            "FC Barcelona 1 - 1 Real Madrid"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matches);
        ListView listView = (ListView) findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, DATA);
        listView.setAdapter(adapter);
    }
}
