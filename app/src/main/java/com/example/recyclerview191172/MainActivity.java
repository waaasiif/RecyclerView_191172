package com.example.recyclerview191172;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new adapter(getLayoutInflater(), getRecyclerItems()));
    }

    private ArrayList<String> getRecyclerItems() {
        ArrayList<String> items = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            items.add("Recycler Item " + (i + 1));
        }
        return items;
    }
}