/*
 * Created by Sathishkumar Durai
 * Code Help 4 You
 * Write to: sathish.codehelp4you@gmail.com
 * Web: www.codehelp4you.com
 */

package com.codehelp4you.simplefragmentdemo;

import com.codehelp4you.simplefragmentdemo.R.id;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;

/**
 * 
 * @author Sathish
 *
 */

public class HomeActivity extends Activity implements OnClickListener {

	private Button button1;
	private Button button2;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_home);
	}
	 
	@Override
	protected void onResume() {
		super.onResume();

		button1 = (Button)findViewById(R.id.fragmentButton1);
		button1.setOnClickListener(this);
		
		button2 = (Button)findViewById(R.id.fragmentButton2);
		button2.setOnClickListener(this);		
	}

	@Override
	public void onClick(View v) {
		Fragment fragment;
		switch(v.getId())
		{
			case id.fragmentButton1:
				fragment = new FragmentOne();
				LoadFragment(fragment);
				break;
				
			case id.fragmentButton2:
				fragment = new FragmentTwo();
				LoadFragment(fragment);
				break;
				
			default:
				break;
		}
		
	}

	/***
	 * This function initiates the FragmentManager and loads the Fragment based on sele
	 * @param fr
	 */
	void LoadFragment(Fragment fr)
	{
		FragmentManager fm = getFragmentManager();
		FragmentTransaction fragmentTransaction = fm.beginTransaction();
		fragmentTransaction.replace(R.id.fragmentHolder, fr);
		fragmentTransaction.commit();
	}
}
