package com.cxz.fallview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private FallView fallView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fallView = findViewById(R.id.fall_view);

        FallObject fallObject = new FallObject.Builder(getResources().getDrawable(R.mipmap.icon_snowflake_01))
                .build();
        FallObject fallObject2 = new FallObject.Builder(getResources().getDrawable(R.mipmap.icon_snowflake_02))
                .build();

        fallView.addFallObject(fallObject, 6);
        fallView.addFallObject(fallObject2, 6);
    }
}
