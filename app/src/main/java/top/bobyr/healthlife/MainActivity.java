package top.bobyr.healthlife;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainactivity);
        // Delay
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {

            @Override
            public void run() {
                View vg = findViewById(R.id.textView);
                vg.invalidate();
                Intent i = new Intent();
                String pkg = "top.bobyr.healthlife";
                String cls = "top.bobyr.healthlife.Login";
                i.setComponent(new ComponentName(pkg, cls));
                MainActivity.this.startActivity(i);
                finish();
            }

        }, 2000); // 5000ms delay


    }

}
