package com.example.mp3player;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Button;

public class MainActivity extends Activity {

	private Button selectFile;
	private Button play;
	private Button pause;
	private Button stop;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		selectFile = (Button)findViewById(R.id.button_selectFile);
		play = (Button)findViewById(R.id.button_play);
		pause = (Button)findViewById(R.id.button_pause);
		stop = (Button)findViewById(R.id.button_stop);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
