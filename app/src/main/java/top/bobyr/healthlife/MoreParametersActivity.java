package top.bobyr.healthlife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MoreParametersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_parameters);

        Button btn_more_parameters_next = (Button)findViewById(R.id.btn_more_parameters_next);
        btn_more_parameters_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v1) {
                onBackPressed();
                //startActivity(new Intent(MoreParametersActivity.this, RegistartionGolograma.class));
            }
        });

    }
}
