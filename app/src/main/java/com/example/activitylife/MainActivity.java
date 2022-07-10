package com.example.activitylife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("AAA","chạy vào onCreate ");
        txt=findViewById(R.id.txt);
        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("AAA","chạy vào onRestart 1");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("AAA","chạy vào onStart 1");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("AAA","chạy vào onStop ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("AAA","chạy vào onDestroy 1212121");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("AAA","chạy vào onPause ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("AAA","chạy vào onRe00sume ");
    }
}
