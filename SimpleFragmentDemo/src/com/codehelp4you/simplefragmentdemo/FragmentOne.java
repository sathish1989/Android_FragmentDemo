/*
 * Created by Sathishkumar Durai
 * Code Help 4 You
 * Write to: sathish.codehelp4you@gmail.com
 * Web: www.codehelp4you.com
 */

package com.codehelp4you.simplefragmentdemo;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * @author sdurai
 *
 */
public class FragmentOne extends Fragment {
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		//Inflates this View
		return inflater.inflate(R.layout.fragment_one, container, false);
	}

}
