package com.dany.androidsplashscreen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splash extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
		new Handler().postDelayed(new Runnable() {
			
			@Override
			public void run() {
				pindah();
			}
		}, 2000);
	}
	public void pindah() {
		Intent i = new Intent(this, Index.class);
		startActivity(i);
		finish();
		overridePendingTransition(R.layout.fadein, R.layout.fadeout);
	}
}
