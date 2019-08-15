package top.bobyr.healthlife;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login  extends Activity {

    @OverrideSeparateLoginActivity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button btn_separate_login = (Button)findViewById(R.id.login_separate_button);
        btn_separate_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v1) {
                startActivity(new Intent(Login.this, SeparateLoginActivity.class));
            }
        });

        Button btn_register = (Button)findViewById(R.id.login_separate_button);
        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v2) {
                startActivity(new Intent(Login.this, Registration00.class));
            }
        });
    }
}
