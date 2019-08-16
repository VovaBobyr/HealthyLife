package top.bobyr.healthlife;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Registration04 extends Activity {
    private static final boolean LOG = true;
    private static final String LOG_TAG = "Hello";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration04);

        Button btn_register = (Button)findViewById(R.id.button_reg04_next);
        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v2) {
                startActivity(new Intent(Registration04.this, Registration05.class));
            }
        });
    }
}
