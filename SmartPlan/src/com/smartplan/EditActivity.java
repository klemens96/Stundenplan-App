package com.smartplan;

import java.util.ArrayList;
import java.util.List;

import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.smartplan.R;

public class EditActivity extends Activity {
	
	
	public Spinner sp_day, sp_hour; 
	public Button bt_submit; 
	public EditText et_teacher, et_subject;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_edit);
		// Show the Up button in the action bar.
		setupActionBar();
		addItemsOnSpinnerDay(); 
		addItemsOnSpinnerHour();
		addListenerOnButton(); 
	}

	/**
	 * Set up the {@link android.app.ActionBar}, if the API is available.
	 */
	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	private void setupActionBar() {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
			getActionBar().setDisplayHomeAsUpEnabled(true);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.edit, menu);
		
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			NavUtils.navigateUpFromSameTask(this);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	
	//Implementierung der Methoden der Spinner
	
	public void addItemsOnSpinnerDay(){
		sp_day = (Spinner) findViewById(R.id.Tagwahl);
		List<String> list = new ArrayList<String>();
		list.add("Montag");
		list.add("Dienstag");
		list.add("Mittwoch");
		list.add("Donnerstag");
		list.add("Freitag");
		ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
			android.R.layout.simple_spinner_item, list);
		dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		sp_day.setAdapter(dataAdapter);
	}
	
	public void addItemsOnSpinnerHour(){
		sp_hour = (Spinner) findViewById(R.id.Stundenwahl);
		List<String> list = new ArrayList<String>();
		list.add("1. Stunde");
		list.add("2. Stunde");
		list.add("3. Stunde");
		list.add("4. Stunde");
		list.add("5. Stunde");
		list.add("6. Stunde");
		list.add("7. Stunde");
		list.add("8. Stunde");
		list.add("9. Stunde");
		list.add("10. Stunde");
		list.add("11. Stunde");
		list.add("12. Stunde");
		ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
			android.R.layout.simple_spinner_item, list);
		dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		sp_hour.setAdapter(dataAdapter);
	}
	
	public void addListenerOnButton(){
		
		bt_submit = (Button) findViewById(R.id.button_Edit);
	 
		bt_submit.setOnClickListener(new OnClickListener() {
		
			@Override
		public void onClick(View arg0) {
			Toast.makeText(EditActivity.this,"Die eingegebenen Daten wurden in den Stundenplan eingetragen!" ,Toast.LENGTH_SHORT).show();
			enterText(); 
			
		}
	 
		});
	}
	
	public void enterText(){
		sp_day = (Spinner) findViewById(R.id.Tagwahl);
		sp_hour = (Spinner) findViewById(R.id.Stundenwahl);
//		String day = String.valueOf(sp_day.getSelectedItem());
//		String hour = String.valueOf(sp_hour.getSelectedItem());
		String day = sp_day.getSelectedView().toString(); 
		String hour = sp_hour.getSelectedView().toString(); 
		String subject_name = et_subject.getText().toString();
		String teacher_name = et_teacher.getText().toString(); 
		
		int d = 0 , h = 0; 
		
//		Umwandlung des Tages in einen Integer-Wert, dieser wird der Tages-Wert des Timetable-Feldes
		if (day.equals("Montag")){
			d = 0; 
		}
		if (day.equals("Dienstag")){
			d = 1; 
		}
		if (day.equals("Mittwoch")){
			d = 2; 
		}
		if (day.equals("Donnerstag")){
			d = 3; 
		}
		if (day.equals("Freitag")){
			d = 4; 
		}
		
		
//		Umwandlung der Stunde in einen Integer-Wert, dieser wird der Stunden-Wert des Timetable-Feldes
		if (hour.equals("1. Stunde")){
			h = 0; 
		}
		if (hour.equals("2. Stunde")){
			h = 1; 
		}
		if (hour.equals("3. Stunde")){
			h = 2; 
		}
		if (hour.equals("4. Stunde")){
			h = 3; 
		}
		if (hour.equals("5. Stunde")){
			h = 4; 
		}
		if (hour.equals("6. Stunde")){
			h = 5; 
		}
		if (hour.equals("7. Stunde")){
			h = 6; 
		}
		if (hour.equals("8. Stunde")){
			h = 7; 
		}
		if (hour.equals("9. Stunde")){
			h = 8; 
		}
		if (hour.equals("10. Stunde")){
			h = 9; 
		}
		if (hour.equals("11. Stunde")){
			h = 10; 
		}
		if (hour.equals("12. Stunde")){
			h = 11; 
		}
		
		Subject toEnter = new Subject(subject_name, teacher_name);
		Timetable.changeSubject(toEnter, d, h); 
		
	}
	

}
