package com.example.sahildeswal.widget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    private HorizontalPicker picker;
    private FrameLayout frame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        picker = (HorizontalPicker)findViewById(R.id.picker);
        picker.getValues();
        picker.getSelectedItem();
        frame = (FrameLayout)findViewById(R.id.frameLayout);
        frame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                picker.getSelectedItem();
                Log.d("check", picker.getSelectedItem() + "this is the selected item");
            }
        });
    }
}
