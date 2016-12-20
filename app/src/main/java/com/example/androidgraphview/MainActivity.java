package com.example.androidgraphview;

import java.util.Random;

import android.os.Bundle;
import android.app.Activity;

public class MainActivity extends Activity {
	
	MyGraphView myGraphView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		myGraphView = (MyGraphView)findViewById(R.id.myview);
		
		Random random = new Random();

		for(int i = 0; i <= 500; i++){
			myGraphView.addItem(i, random.nextInt(500));
		}

	}

}
