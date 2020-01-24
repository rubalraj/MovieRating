package com.example.ratingapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends Activity {
	EditText et1;
	RatingBar r;
	Button b;
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=(EditText)findViewById(R.id.editText1);
        r=(RatingBar)findViewById(R.id.ratingBar1);
        b=(Button)findViewById(R.id.button1);
       b.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			String mv=et1.getText().toString();
			double rt= r.getRating();
			if(mv.equals(""))
				Toast.makeText(getApplicationContext(), "Please Enter Movie Name!", 5000).show();
			else
			{
				Toast.makeText(getApplicationContext(), "Your rating Is"+rt, 5000).show();
			}
			
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
