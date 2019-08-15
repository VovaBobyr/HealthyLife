package top.bobyr.healthlife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Registration00 extends AppCompatActivity {

/*    public void sendMessage(View view)
    {
        Intent intent = new Intent(Registration00.this, Registration01.class);
        startActivity(intent);
    }*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration00);

        Button btn_mail_reg = (Button)findViewById(R.id.button_reg00_1);
        btn_mail_reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v1) {
                startActivity(new Intent(Registration00.this, Registration01.class));
            }
        });

        Button femail_reg = (Button)findViewById(R.id.button_reg00_2);
        femail_reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v2) {
                startActivity(new Intent(Registration00.this, Registration01.class));
            }
        });

        Button btn_next = (Button)findViewById(R.id.button_reg00_next);
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v1) {
                startActivity(new Intent(Registration00.this, Registration01.class));
            }
        });
    }

    public void sendMessage(View view)
    {
        Intent intent = new Intent(Registration00.this, Registration01.class);
        startActivity(intent);
    }

}
