package com.barnajroccelerator.breathe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onRelaxClicked(View view)
    {
        Intent intent = new Intent(this, RelaxList.class);

        startActivity(intent);
    }

    public void onBreatheClicked(View view)
    {
        Intent intent = new Intent(this, BreatheList.class);

        startActivity(intent);
    }

    public void onChillClicked(View view)
    {
        Intent intent = new Intent(this, ChillList.class);

        startActivity(intent);
    }

    public void onAllClicked(View view)
    {
        Intent intent = new Intent(this, AllList.class);

        startActivity(intent);
    }
}
