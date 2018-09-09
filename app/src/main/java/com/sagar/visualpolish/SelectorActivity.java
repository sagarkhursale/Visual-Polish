package com.sagar.visualpolish;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class SelectorActivity extends AppCompatActivity {
    private static final String TAG = SelectorsActivity.class.getSimpleName();

    // recycler view and adapter
    RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selector);

        mRecyclerView = findViewById(R.id.mainRecyclerView);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(layoutManager);

        //
    }


    // END
}
