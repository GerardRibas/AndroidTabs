package com.gribas.tabs;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.gribas.R;

/**
 * @author Gerard Ribas
 * 
 */
public class FirstTab extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.firsttab);
		TextView textView = (TextView) findViewById(R.id.txtFirstTab);
		textView.setText("First Tab!");
	}

}
