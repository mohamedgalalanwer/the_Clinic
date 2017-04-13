package com.example.projectos2;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Book_RedaMahmoud extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_book__reda_mahmoud);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.book__reda_mahmoud, menu);
		return true;
	}

}
