package id.ac.polinema.aplikasiku;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
	}

	public void clickForgot(View view) {
		Intent intent = new Intent(this, ForgotPasswordActivity.class);
		startActivity(intent);
	}

	public void postLogin(View view) {
		Intent intent = new Intent(this, SuccessLoginActivity.class);
		startActivity(intent);
	}
}
