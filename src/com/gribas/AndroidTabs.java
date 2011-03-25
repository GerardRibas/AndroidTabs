package com.gribas;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TabHost;

import com.gribas.tabs.FirstTab;
import com.gribas.tabs.SecondTab;

public class AndroidTabs extends TabActivity {
	
	private static final String CLASSNAME = AndroidTabs.class.getName();

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        addTabs();
    }
    
    private void addTabs(){
    	
//    	Resources res = getResources();	// Resource object to get Drawables
        TabHost tabHost = getTabHost(); // The activity TabHost
        TabHost.TabSpec spec;  		 	// Resusable TabSpec for each tab
        Intent intent;  				// Reusable Intent for each tab
    	
     // Create an Intent to launch an Activity for the tab (to be reused)
        intent = new Intent().setClass(this, FirstTab.class);
        spec = tabHost.newTabSpec("firstTab").setIndicator("First",null).setContent(intent);
        tabHost.addTab(spec);
        Log.d(CLASSNAME, "Tab1 Added");
               
     // Add second tab
        intent = new Intent().setClass(this, SecondTab.class);
        spec = tabHost.newTabSpec("secondTab").setIndicator("Second", null).setContent(intent);
        tabHost.addTab(spec);
        Log.d(CLASSNAME, "Tab2 Added");
        
//        tabHost.setCurrentTab(1);
    }
}