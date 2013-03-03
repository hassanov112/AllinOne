package com.erlaa.allinone;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;

public class OpenedClass extends Activity implements OnClickListener,
		OnCheckedChangeListener {
	TextView Question, TvTest;
	Button RButton;
	RadioGroup Slist;
	String gotBread, SSB ;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.send);
		initialize();
		Bundle gotBasket = getIntent().getExtras();
		gotBread = gotBasket.getString("key");
		Question.setText(gotBread + " är...");
	}

	private void initialize() {
		Question = (TextView) findViewById(R.id.tvQuestion);
		TvTest = (TextView) findViewById(R.id.TvTest);
		RButton = (Button) findViewById(R.id.Breturn);
		Slist = (RadioGroup) findViewById(R.id.RGA);
		RButton.setOnClickListener(this);
		Slist.setOnCheckedChangeListener(this);

	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
	
	}

	@Override
	public void onCheckedChanged(RadioGroup arg0, int arg1) {
		// TODO Auto-generated method stub
		switch (arg1) {
		case R.id.RSnygg:
			SSB = "Japp, " + gotBread +  " är snygg";
			break;
		case R.id.RSot:
			SSB = gotBread +  " är jätte söt";
			break;
		case R.id.Rbade:
			SSB = "Självklart är " + gotBread + " både snygg och söt";
			break;
		}
		TvTest.setText(SSB);
	}

}
