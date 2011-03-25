/**
 * 
 */
package com.gribas.tabs;

import com.gribas.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * @author Gerard Ribas
 * 
 */
public class SecondTab extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.secondtab);
		TextView textView = (TextView) findViewById(R.id.txtSecondTab);
		textView.setText("Second Tab!");
	}

}
