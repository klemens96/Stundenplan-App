package com.smartplan;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.Toast;

import com.example.smartplan.R;

public class MainActivity extends Activity {
 
	Button bt_print;
	
	public MainActivity(){
		
	}
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        
//        TableLayout layout = new TableLayout (this);
//        layout.setLayoutParams( new TableLayout.LayoutParams(5 , 12) );
//
//        layout.setPadding(1,1,1,1);
//
//        for (int f=0; f<=13; f++) {
//            TableRow tr = new TableRow(this);
//            for (int c=0; c<=5; c++) {
//                Button b = new Button (this);
//                b.setText(Timetable.substrSubject(c, f));
//                b.setTextSize(10.0f);
//                b.setTextColor(Color.rgb( 100, 200, 200));
//                b.setOnClickListener((OnClickListener) this);
//                tr.addView(b, 30,30);
//            } // for
//            layout.addView(tr);
//        } // for

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
    
//    public void addListenerOnButton(){
//
//		bt_print = (Button) findViewById(R.id.button_Print);
//	 
//		bt_print.setOnClickListener(new OnClickListener() {
//		@Override
//		public void onClick(View arg0) {
//			printOutTT(); 
//			
//		}
//	 
//		});
//	}
    
    
//	Ändert den Speicherplatz im angegebenen Feld auf das angegebene Fach
	public static void changeSubject(Subject newSubject, int x, int y){
			Timetable.changeSubject(newSubject, x, y);
	}
	

}
