package com.example.alarmonspecifieddate;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class AlarmClass extends BroadcastReceiver {

	@Override
	public void onReceive(Context arg0, Intent arg1)
	{
		// TODO Auto-generated method stub
		
		Toast.makeText(arg0, "Time is Over", Toast.LENGTH_LONG).show();

	}

}
