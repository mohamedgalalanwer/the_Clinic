package com.example.projectos2;

//import android.R.string;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;

//import android.text.Editable;
import android.view.Menu;
//import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
//import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class Book_Heart extends Activity {
ImageButton phone1;
Button send1;
EditText name,age ,city;
private SharedPreferences spf;
private String prefName="mypref";
String CName="UserName";
String CAge="UserAge";
String CCity="UserCity";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_book__heart);
		phone1=(ImageButton)findViewById(R.id.book2_phone);
	send1=(Button)findViewById(R.id.book1_buttonsend);
	
	name=(EditText)findViewById(R.id.book1_txtname);
	age=(EditText)findViewById(R.id.book1_txtage);
	city=(EditText)findViewById(R.id.book1_txtcity);
	
	send1.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			
			
			spf=getSharedPreferences(prefName,MODE_PRIVATE);
			SharedPreferences.Editor edit=spf.edit();
			
			edit.putString(CName,name.getText().toString());
			edit.putString(CAge,age.getText().toString());
			edit.putString(CCity,city.getText().toString());
			edit.commit();
			
			name.setText("");
			age.setText("");
			city.setText("");
			
			
			
		}
	});
	
	
	
	
	
	
	
	
	
		phone1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent i=new Intent(Intent.ACTION_DIAL);
				i.setData(Uri.parse("tel:01023031798"));
				startActivity(i);
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.book__heart, menu);
		return true;
	}

}
