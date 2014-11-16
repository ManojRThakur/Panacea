package com.example.tabexample;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;


@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        TabHost tabHost = (TabHost)findViewById(android.R.id.tabhost);

        TabSpec tab_map = tabHost.newTabSpec("Map View");
        TabSpec tab_list = tabHost.newTabSpec("List View");

        tab_map.setIndicator("Map View");
        tab_map.setContent(new Intent(this,MapViewActivity.class));
        
        tab_list.setIndicator("List View");
        tab_list.setContent(new Intent(this,ListView.class));

        /** Add the tabs  to the TabHost to display. */
        tabHost.addTab(tab_map);
        tabHost.addTab(tab_list);
    }
    
    @Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
