package top.bobyr.moneytracker;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Checklogin extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checklogin);
        // Delay
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {

            @Override
            public void run() {
                View vg = findViewById(R.id.imageView2);
                vg.invalidate();
            }

        }, 10000); // 5000ms delay

        Intent intent = new Intent();
        intent.setComponent(new ComponentName("top.bobyr.moneytracker","top.bobyr.moneytracker.MainActivity"));
        startActivity(intent);
        finish();
    }

}
