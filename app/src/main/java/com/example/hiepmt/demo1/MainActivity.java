package com.example.hiepmt.demo1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    MyAdapter mAdapter;
    RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recyclerView);

        ArrayList<MyObject> myObjects = new ArrayList<>();
        myObjects.add(new MyObject("Name 1", "Sub title 1"));
        myObjects.add(new MyObject("Name 2", "Sub title 2"));
        myObjects.add(new MyObject("Name 3", "Sub title 3"));
        myObjects.add(new MyObject("Name 4", "Sub title 4"));
        myObjects.add(new MyObject("Name 5", "Sub title 5"));

        mAdapter = new MyAdapter();
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(mAdapter);

        mAdapter.updateData(myObjects);
    }
}
