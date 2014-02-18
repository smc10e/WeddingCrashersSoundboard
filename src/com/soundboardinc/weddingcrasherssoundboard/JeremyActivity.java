package com.soundboardinc.weddingcrasherssoundboard;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.graphics.Typeface;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class JeremyActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_jeremy);
		TextView myTextView=(TextView)findViewById(R.id.jeremy_q1text);
		Typeface typeFace=Typeface.createFromAsset(getAssets(),"fonts/Futura.ttf");
		myTextView.setTypeface(typeFace);
		
		final MediaPlayer mp = MediaPlayer.create(this, R.raw.tattoo);
		
		ImageButton musicButton = (ImageButton) findViewById(R.id.arrow);
		
		musicButton.setOnClickListener(new View.OnClickListener(){
			public void onClick(View v){
				mp.start();
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.jeremy, menu);
		return true;
	}

}
