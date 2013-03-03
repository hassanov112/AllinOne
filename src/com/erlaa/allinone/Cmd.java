package com.erlaa.allinone;

import java.util.Random;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.AnalogClock;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;

public class Cmd extends Activity implements View.OnClickListener {
	Button Bact;
	EditText Input;
	TextView Tview;
	AnalogClock Digclock;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.word);
		metod();

		Bact.setOnClickListener(this);
	}

	private void metod() {
		// TODO Auto-generated method stub
		Bact = (Button) findViewById(R.id.Bact);
		Input = (EditText) findViewById(R.id.idpass);
		Tview = (TextView) findViewById(R.id.Tview);
		Digclock = (AnalogClock) findViewById(R.id.Digclock);
	}

	@SuppressWarnings("deprecation")
	@SuppressLint("NewApi")
	@Override
	public void onClick(View click) {
		// TODO Auto-generated method stub
		switch(click.getId()){
		case R.id.Bact:
			String check = Input.getText().toString();
			if (check.contains("left")) {
				Tview.setGravity(Gravity.LEFT);
			} else if (check.contains("center")) {
				Tview.setGravity(Gravity.CENTER);
			} else if (check.contains("right")) {
				Tview.setGravity(Gravity.RIGHT);
			} else if (check.contains("blue")) {
				Tview.setTextColor(Color.BLUE);
			} else if (check.contains("black")) {
				Tview.setTextColor(Color.BLACK);
			}else if (check.contains("hi")) {
				Tview.setText("Hi, Bro!");
			}else if(check.contains("random"))	{
				Random crazy = new Random();
				Tview.setTextColor(Color.rgb(crazy.nextInt(265), crazy.nextInt(265), crazy.nextInt(265)));
				Tview.setTextSize(crazy.nextInt(50));
				switch(crazy.nextInt(3))	{
				case 0:
					Tview.setGravity(Gravity.LEFT);
					break;
				case 1:
					Tview.setGravity(Gravity.CENTER);
					break;
				case 2:
					Tview.setGravity(Gravity.RIGHT);
					break;
				}
			}else if(check.isEmpty())	{
				Tview.setText("Please type atleast 1 command");
			}else if (check.contains("clock")) {
				Tview.setText("The time is");
				Digclock.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT));
			}else {
				Tview.setText("Invalid");
				Tview.setGravity(Gravity.CENTER);
				Tview.setTextColor(Color.BLACK);
			}
			break;
		}
	}

}