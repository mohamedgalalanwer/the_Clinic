package com.example.projectos2;

import android.os.Bundle;
//import android.R.string;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {
	 
Button go;
	ImageView img;
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      go  =(Button)findViewById(R.id.b1);
        img=(ImageView)findViewById(R.id.img1);
    	Animation a=AnimationUtils.loadAnimation(getApplicationContext()
				,R.anim.fade);
		img.startAnimation(a);
		
		Animation n=AnimationUtils.loadAnimation(getApplicationContext()
		,R.anim.fade);
		go.startAnimation(n);
		
		
		
        go.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			Intent i=new Intent(MainActivity.this,Second.class);
			startActivity(i);
//				
			
				
			}
		});
        
        
        
        
       // bert.animate().setDuration(100);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
