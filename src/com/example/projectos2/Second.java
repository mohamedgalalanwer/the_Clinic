package com.example.projectos2;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
//import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;

import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Second extends Activity {
Spinner sp,spin2;
Button b1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		b1=(Button)findViewById(R.id.sp2);
		sp=(Spinner)findViewById(R.id.sp1);
		spin2=(Spinner)findViewById(R.id.sp3);
		
		
		
		
		
		
		/////////////////////////////////////////////////////////
		
		ArrayAdapter<CharSequence>ar=ArrayAdapter.createFromResource(this,
				R.array.spcial,android.R.layout.simple_list_item_1);
		
		ar.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
		sp.setAdapter(ar);
		//sp.getSelectedItem().toString()="ÌÑÇÍå ÇáÚÙÇã";
		
		
		
		
		
		final ArrayAdapter<CharSequence>ar1=ArrayAdapter.createFromResource(this,
				R.array.Dctor1,android.R.layout.simple_list_item_1);
		ar1.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
		
		//////////////////////////////////
		final ArrayAdapter<CharSequence>ar2=ArrayAdapter.createFromResource(this,
				R.array.Dctor2,android.R.layout.simple_list_item_1);
		
		ar2.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
		
///////////////////////////////////////////
		final ArrayAdapter<CharSequence>ar3=ArrayAdapter.createFromResource(this,
				R.array.Dctor3,android.R.layout.simple_list_item_1);
		
		ar3.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
		
		///////////////////////////////////////////
		final ArrayAdapter<CharSequence>ar4=ArrayAdapter.createFromResource(this,
				R.array.Dctor4,android.R.layout.simple_list_item_1);
		ar4.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
		
		///////////////////////////////////////////////////////////////////////
		
		
		
		
		
//		
	sp.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				if(arg2==0){
			
					spin2.setAdapter(ar1);
					b1.setOnClickListener(new OnClickListener() {
						
						@Override
						public void onClick(View arg0) {
							// TODO Auto-generated method stub
							if(spin2.getSelectedItemPosition()==0){
							Intent i=new Intent(Second.this,Book_Heart.class);
							startActivity(i);}
							else {
								Intent i=new Intent(Second.this,BookMohamedElsayed.class);
								startActivity(i);
								
								
							}
						}
					});
					
					
				}
				
				else if (arg2==1) {
					spin2.setAdapter(ar2);
b1.setOnClickListener(new OnClickListener() {
						
						@Override
						public void onClick(View arg0) {
							// TODO Auto-generated method stub
							if(spin2.getSelectedItemPosition()==0){
							Intent i=new Intent(Second.this,Book_AlaaElb3.class);
							startActivity(i);}
							else {
								Intent i=new Intent(Second.this,Book_ibrahimMahmoud.class);
								startActivity(i);
								
								
							}
						}
				});
				}
else if (arg2==2) {
	spin2.setAdapter(ar3);
	
	b1.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
		if(spin2.getSelectedItemPosition()==0){
			Intent i=new Intent(Second.this,Book_AlaaHus.class);
			startActivity(i);}
			else {
				Intent i=new Intent(Second.this,Book_AhmedReda.class);
				startActivity(i);
				
				
			}
		}
	});
				}
else if (arg2==3) {spin2.setAdapter(ar4);

b1.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		if(spin2.getSelectedItemPosition()==0){
		Intent i=new Intent(Second.this,Book_IbrahimElsayed.class);
		startActivity(i);}
		else {
			Intent i=new Intent(Second.this,Book_RedaMahmoud.class);
			startActivity(i);
			
			
		}
	}
});	
}
				
			}
			@Override
		public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		
		
		
//		
//	
//		
//		
//		
//	
//		
//		
//		
	}

	}

