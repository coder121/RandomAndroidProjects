package com.markana.yamba;

import java.util.ArrayList;
import java.util.Arrays;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class ActivityTwo extends Activity {
	//private Button AnotherHadith;
	ArrayList<String> hadiths=new ArrayList<String>(Arrays.asList("Allah said: Sons of Adam inveigh against [the vicissitudes of] Time, and I am Time, in My hand is the night and the day (1). (1) As the Almighty is the Ordainer of all things, to inveigh against misfortunes that are part of Time is tantamount to inveighing against Him. It was related by al-Bukhari (also by Muslim).",
			"Allah (glorified and exalted be He) said: I am so self-sufficient that I am in no need of having an associate. Thus he who does an action for someone else's sake as well as Mine will have that action renounced by Me to him whom he associated with Me. It was related by Muslim (also by Ibn Majah).",
			"The messenger of Allah say: Your Lord delights at a shepherd who, on the peak of a mountain crag, gives the call to prayer and prays. Then Allah (glorified and exalted be He) say: Look at this servant of Mine, he gives the call to prayer and performs the prayers; he is in awe of Me. I have forgiven My servant [his sins] and have admitted him to Paradise. It was related by an-Nasa'i with a good chain of authorities.",
			"Allah (mighty and sublime be He) said: Spend (on charity), O son of Adam, and I shall spend on you. It was related by al-Bukhari (also by Muslim)"));
	private String hadith ;
	private ArrayList<String> check=new ArrayList<String>()  ;
	
	TextView hadithText;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_two);
		
		hadithText=(TextView) findViewById(R.id.hadith);
		hadith=hadiths.get((int)Math.floor(Math.random()*hadiths.size()));
	    hadithText.setText(hadith);
	    //check.add(hadith);
	    
	   // AnotherHadith=(Button) findViewById(R.id.AnotherHadith);
	 /*   AnotherHadith.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				String anhadith=hadiths.get((int)Math.floor(Math.random()*hadiths.size()));
				while((check.get(0))==hadith){
					hadith.replace(hadith, anhadith);
			   
	    }
				
			}
		});*/
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_two, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
