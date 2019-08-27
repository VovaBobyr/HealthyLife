package top.bobyr.healthlife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegistartionGolograma extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registartion_golograma);

        Button btn_more_parameters_reg = (Button)findViewById(R.id.button_more_registration);
        btn_more_parameters_reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v1) {
                startActivity(new Intent(RegistartionGolograma.this, MoreParametersActivity.class));
            }
        });

        Button btn_create_healthy_life = (Button)findViewById(R.id.button_create_healthy_life);
        btn_create_healthy_life.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v1) {
                startActivity(new Intent(RegistartionGolograma.this, MainForm.class));
            }
        });

    }
}
