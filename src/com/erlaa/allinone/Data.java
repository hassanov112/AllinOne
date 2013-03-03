package com.erlaa.allinone;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Data extends Activity implements OnClickListener {
	
	Button StartFor, Start;
	EditText sendET;
	TextView gotAnswer, YN;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.get);
		initialize();
	}

	private void initialize()	{
		YN = (TextView) findViewById(R.id.YN);
		StartFor = (Button) findViewById(R.id.bSAFR);
		Start = (Button) findViewById(R.id.bSA);
		sendET = (EditText) findViewById(R.id.etSend);
		gotAnswer = (TextView) findViewById(R.id.tvGot);
		Start.setOnClickListener(this);
		StartFor.setOnClickListener(this);
		
	}
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		switch(arg0.getId())	{
		case R.id.bSA:
			String bread = sendET.getText().toString();
			Bundle basket = new Bundle();
			basket.putString("key", bread);
			Intent a = new Intent(Data.this, OpenedClass.class);
			a.putExtras(basket);
			startActivity(a);
			break;
		case R.id.bSAFR:
		
			break;
		
		}
	}
	
	

}
