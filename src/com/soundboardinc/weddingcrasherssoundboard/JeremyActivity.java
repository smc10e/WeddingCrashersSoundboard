package com.soundboardinc.weddingcrasherssoundboard;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Typeface;
import android.view.Menu;
import android.widget.TextView;

public class JeremyActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_jeremy);
		TextView myTextView=(TextView)findViewById(R.id.jeremy_q1text);
		Typeface typeFace=Typeface.createFromAsset(getAssets(),"fonts/Futura.ttf");
		myTextView.setTypeface(typeFace);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.jeremy, menu);
		return true;
	}

}
