package com.example.train_android_spinner;

import java.util.ArrayList;

import android.R.array;
import android.os.Bundle;
import android.app.Activity;
import android.text.Selection;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends Activity {

	String list[] = {"Dang",
	"Vo",
	"Anh",
	"Thai"};
	ArrayAdapter<String>adapter;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	

		
		adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list);
		
		Spinner spinner = (Spinner) findViewById(R.id.spinner);
		spinner.setAdapter(adapter);
		
		final TextView selection = (TextView) findViewById(R.id.selection);
		
		adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
		spinner.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				selection.setText(list[arg2]);
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
