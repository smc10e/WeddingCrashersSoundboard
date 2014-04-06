package com.soundboardinc.weddingcrasherssoundboard;


import android.R;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;


public class IntroActivity extends Activity {

	MediaPlayer mpsplash;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_intro);
		TextView myTextView=(TextView)findViewById(R.id.help_button);
		TextView myTextView1=(TextView)findViewById(R.id.select_char_button);
		TextView myTextView2=(TextView)findViewById(R.id.buy_movie_button);
		TextView myTextView3=(TextView)findViewById(R.id.play_trailer_button);
		Typeface typeFace=Typeface.createFromAsset(getAssets(),"fonts/Futura.ttf");
		myTextView.setTypeface(typeFace);
		myTextView1.setTypeface(typeFace);
		myTextView2.setTypeface(typeFace);
		myTextView3.setTypeface(typeFace);
		
		mpsplash = MediaPlayer.create(this, R.raw.faith);
		//mpsplash.start();
		
	}
	
	@Override
	protected void onPause(){
		//mpsplash.pause();
		super.onPause();
	}
	
	@Override
	protected void onResume(){
		super.onResume();
		//mpsplash.start();
	}
	
	@Override
	protected void onDestroy(){
		//mpsplash.release();
		super.onDestroy();
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.intro, menu);
		return true;
	}
	
	public void page1(View view){
		//mpsplash.release();
		Intent intent = new Intent(this, SelectCharacterActivity.class);
		startActivity(intent);
	}
	


}
