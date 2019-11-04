package id.ac.polinema.aplikasiku;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ResetPasswordActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_reset_password);
	}

	public void postChangePassword(View view) {
		Intent intent = new Intent(this, SuccessResetPasswordActivity.class);
		startActivity(intent);
	}
}
