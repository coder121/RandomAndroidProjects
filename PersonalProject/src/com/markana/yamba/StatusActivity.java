package com.markana.yamba;

import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;


public class StatusActivity extends Activity {
	private static final String TAG="Status Activity"; 
	
	private Button getHadith;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status);
   
        getHadith=(Button) findViewById(R.id.buttonTweet);
       // getHadith.setOnClickListener(this);
        getHadith.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=null;
				intent=new Intent(StatusActivity.this,ActivityTwo.class);
				startActivity(intent);
				
				
			}
		});
        Log.i(TAG,"Entered the onCreate() method");
    }
    
  
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.status, menu);
        return true;
    }

  
 





	
}
