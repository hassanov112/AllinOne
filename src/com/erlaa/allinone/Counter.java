package com.erlaa.allinone;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Counter extends Activity {
	
	int counter;
	Button add, sub;
	TextView visa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starting_point);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.starting_point, menu);
        counter = 0;
        add = (Button) findViewById(R.id.Badd);
        sub = (Button) findViewById(R.id.Bsub);
        visa = (TextView) findViewById(R.id.textshow);
        add.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				counter++;
				visa.setText("totalt " + counter);
			}
		});
        sub.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				counter--;
				visa.setText("totalt " + counter);
			}
		});
        return true;
    }
    
}
