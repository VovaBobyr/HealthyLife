package top.bobyr.healthlife;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Registration01 extends Activity {
    private static final boolean LOG = true;
    private static final String LOG_TAG = "Hello";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration01);

        final EditText editText = findViewById(R.id.reg1_age_edit);
        Button btn = findViewById(R.id.button_reg01);
        final TextView textView = findViewById(R.id.reg1_name_tv);

        textView.setVisibility(View.INVISIBLE);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = editText.getText().toString();
                String hello = getString(R.string.hello_user, name);
                textView.setText(hello);
                textView.setVisibility(View.VISIBLE);
                if (LOG) Log.d(name, name);

            }
        });

    }
}
