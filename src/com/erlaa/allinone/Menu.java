package com.erlaa.allinone;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Menu extends ListActivity{

	String Classes[] = {"Counter", "Cmd", "Email", "Camera", "Data"};
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setListAdapter (new ArrayAdapter<String>(Menu.this, android.R.layout.simple_list_item_1, Classes));
	}
	
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		String ost = Classes[position];
		try{
		Class minclass = Class.forName("com.erlaa.allinone." + ost);
		Intent minintent = new Intent(Menu.this, minclass);
		startActivity(minintent);
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
}