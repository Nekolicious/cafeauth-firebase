package lat.pam.cafeauth;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText username, password;
    Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = (EditText) findViewById(R.id.uname);
        password = (EditText) findViewById(R.id.pw);
        loginBtn = (Button) findViewById(R.id.login_btn);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = username.getText().toString();
                String pw = password.getText().toString();

                if (user.equals("superuser") && pw.equals("123456")) {
                    Toast.makeText(getApplicationContext(), "Berhasil Login",Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    LoginActivity.this.startActivity(intent);
                    finish();
                } else {
                    AlertDialog.Builder builder = new AlertDialog.Builder(LoginActivity.this);
                    builder.setMessage("Username atau Password salah")
                            .setNegativeButton("Retry", null).create().show();
                }
            }
        });
    }
}