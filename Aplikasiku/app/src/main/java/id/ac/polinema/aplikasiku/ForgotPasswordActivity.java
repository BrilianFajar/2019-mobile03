package id.ac.polinema.aplikasiku;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ForgotPasswordActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_forgot_password);
	}

	public void postSentRequest(View view) {
		Intent intent = new Intent(this, ResetPasswordActivity.class);
		startActivity(intent);
	}
}
