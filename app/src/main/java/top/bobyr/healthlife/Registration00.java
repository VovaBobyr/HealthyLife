package top.bobyr.healthlife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Registration00 extends AppCompatActivity {

    public void sendMessage(View view)
    {
        Intent intent = new Intent(Registration00.this, Registration01.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration00);
    }
}
