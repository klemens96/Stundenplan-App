package com.smartplan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.classes.Timetable;
import com.example.smartplan.R;

public class MainActivity extends Activity {

	static Timetable tt; 
	Button bt_print;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    
    // Füllen des Menüs mit den in /res/menu/main angegebenen Menüpunkten
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    
    // Überprüfung, welches MenuItem gedrückt wurde & Reaktion darauf
    @Override
    public boolean onOptionsItemSelected (MenuItem menuitem){
    	
    	if (menuitem.toString().equals("Bearbeiten"))
    	{
    		Intent intent = new Intent(this, EditActivity.class);
    		startActivity(intent); 
    		
    	}
    	return true;
    }
    
    public void addListenerOnButton(){

		bt_print = (Button) findViewById(R.id.button_Print);
	 
		bt_print.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View arg0) {
			printOutTT(); 
			
		}
	 
		});
	}
    
    public void printOutTT (){
    	for(int i = 0; i < 5; i++)
    		for (int j = 0; j < 12; j++){
    			System.out.println(tt.substrSubject(i, j));
    		}
    }
}
