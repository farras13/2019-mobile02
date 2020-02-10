package id.ac.polinema.androidlifecycle;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	// TODO: tambahkan callback onStart() di sini

	@Override
	protected void onStart() {
		super.onStart();
		Toast.makeText(this, "APP on start", Toast.LENGTH_SHORT).show();
	}
	// TODO: tambahkan callback onStop() di sini

	@Override
	protected void onStop() {
		super.onStop();

		Toast.makeText(this, "APP on stop", Toast.LENGTH_SHORT).show();
	}

	// TODO: lengkapi callback untuk onRestart()

	@Override
	protected void onRestart() {
		super.onRestart();
		Toast.makeText(this, "APP on Restart", Toast.LENGTH_SHORT).show();
	}

	// TODO: lengkapi callback untuk onResume()

	@Override
	protected void onResume() {
		super.onResume();
		Toast.makeText(this, "APP on Restart", Toast.LENGTH_SHORT).show();
	}

	// TODO: lengkapi callback untuk onPause()

	@Override
	protected void onPause() {
		super.onPause();
		Toast.makeText(this, "APP on Pause", Toast.LENGTH_SHORT).show();
	}

	// TODO: lengkapi callback untuk onDestroy()

	@Override
	protected void onDestroy() {
		super.onDestroy();
		Toast.makeText(this, "APP on Desetroy", Toast.LENGTH_SHORT).show();
	}
}
