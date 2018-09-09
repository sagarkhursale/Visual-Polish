package com.sagar.visualpolish;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;


public class SelectorActivity extends AppCompatActivity implements SelectorItemAdapter.ListItemClickListener {

    private static final String TAG = SelectorActivity.class.getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selector);

        RecyclerView mRecyclerView = findViewById(R.id.mainRecyclerView);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(layoutManager);

        SelectorItemAdapter mAdapter = new SelectorItemAdapter(this);
        mRecyclerView.setAdapter(mAdapter);

        //
    }

    @Override
    public void onListItemClick(int clickedItemIndex) {

        Log.v(TAG, "List item clicked at index: " + clickedItemIndex);

    }


    // END
}
