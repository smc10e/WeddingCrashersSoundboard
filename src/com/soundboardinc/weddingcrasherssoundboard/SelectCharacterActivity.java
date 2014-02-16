package com.soundboardinc.weddingcrasherssoundboard;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class SelectCharacterActivity extends Activity {

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_select_character);
	}

	@Override
	protected void onPause(){
		super.onPause();
	}
	
	protected void onResume(){
		super.onResume();
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.select_character, menu);
		return true;
	}

	public void jeremyPage(View view){
		Intent intent = new Intent(this, JeremyActivity.class);
		startActivity(intent);
	}
}
