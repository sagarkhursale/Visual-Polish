package com.sagar.visualpolish;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Four text views for four activities
        TextView colorAndFont = findViewById(R.id.colorAndFont);
        TextView style = findViewById(R.id.style);
        TextView responsiveLayouts =  findViewById(R.id.responsiveLayouts);
        TextView touchSelector =  findViewById(R.id.touchSelector);

        // end
    }


    // END
}
