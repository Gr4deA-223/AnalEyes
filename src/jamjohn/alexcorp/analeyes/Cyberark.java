package jamjohn.alexcorp.analeyes;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Cyberark extends ActionBarActivity {
	
	TextView cyberark_asia, cyberark_civitas, cyberark_citizens, cyberark_cone, 
	cyberark_grupo, cyberark_medley, cyberark_smart, cyberark_travelport, cyberark_vantage;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.cyberark);
		
		cyberark_asia = (TextView)findViewById(R.id.cyberark8);
		cyberark_citizens = (TextView)findViewById(R.id.cyberark11);
		cyberark_civitas = (TextView)findViewById(R.id.cyberark5);
		cyberark_cone = (TextView)findViewById(R.id.cyberark3);
		cyberark_grupo = (TextView)findViewById(R.id.cyberark10);
		cyberark_medley = (TextView)findViewById(R.id.cyberark7);
		cyberark_smart = (TextView)findViewById(R.id.cyberark9);
		cyberark_travelport = (TextView)findViewById(R.id.cyberark6);
		cyberark_vantage = (TextView)findViewById(R.id.cyberark4);
		
cyberark_asia.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent i = new Intent("android.intent.action.CYBERARK_ASIA");
				startActivity(i);
			}
		});

cyberark_citizens.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Intent i = new Intent("android.intent.action.CYBERARK_CITIZENS");
		startActivity(i);
	}
});

cyberark_civitas.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Intent i = new Intent("android.intent.action.CYBERARK_CIVITAS");
		startActivity(i);
	}
});

cyberark_cone.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Intent i = new Intent("android.intent.action.CYBERARK_CONE");
		startActivity(i);
	}
});
cyberark_grupo.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Intent i = new Intent("android.intent.action.CYBERARK_GRUPO");
		startActivity(i);
	}
});



cyberark_medley.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Intent i = new Intent("android.intent.action.CYBERARK_MEDLEY");
		startActivity(i);
	}
});

cyberark_smart.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Intent i = new Intent("android.intent.action.CYBERARK_SMART");
		startActivity(i);
	}
});
		
cyberark_travelport.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Intent i = new Intent("android.intent.action.CYBERARK_TRAVELPORT");
		startActivity(i);
	}
});

cyberark_vantage.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Intent i = new Intent("android.intent.action.CYBERARK_VANTAGE");
		startActivity(i);
	}
});
	
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
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
