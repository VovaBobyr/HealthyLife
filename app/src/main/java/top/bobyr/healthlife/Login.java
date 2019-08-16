package top.bobyr.healthlife;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import top.bobyr.healthlife.ui.login.LoginActivity;

public class Login  extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button btn_login_witn_email = (Button)findViewById(R.id.login_separate_button);
        btn_login_witn_email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v2) {
                startActivity(new Intent(Login.this, LoginActivity.class));
            }
        });

        Button btn_register = (Button)findViewById(R.id.register_new_user);
        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v2) {
                startActivity(new Intent(Login.this, Registration00.class));
            }
        });
    }
}
