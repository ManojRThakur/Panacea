package com.example.tabexample;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Toast;

public class ListView extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_list_layout);
		String[] values = new String[] { "Dr. Vipul Shah", "Dr. Madur Jain", "Dr. Ketan Asawale",
				"Dr. Gaurav Singh" };
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				R.layout.doctor_profile, R.id.firstLine, values);
		setListAdapter(adapter);
	}

	@Override
	protected void onListItemClick(android.widget.ListView l, View v,
			int position, long id) {
		String item = (String) getListAdapter().getItem(position);
		Toast.makeText(this, item + " selected", Toast.LENGTH_LONG).show();
	}
}
