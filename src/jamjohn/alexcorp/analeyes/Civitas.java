package jamjohn.alexcorp.analeyes;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Civitas extends ActionBarActivity {
	
	TextView civitas_asia, civitas_citizens, civitas_cone, civitas_cyberark, 
	civitas_grupo, civitas_medley, civitas_smart, civitas_travelport, civitas_vantage;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.civitas);
		civitas_asia = (TextView)findViewById(R.id.civitas7);
		civitas_citizens = (TextView)findViewById(R.id.civitas11);
		civitas_cone = (TextView)findViewById(R.id.civitas3);
		civitas_cyberark = (TextView)findViewById(R.id.civitas8);
		civitas_grupo = (TextView)findViewById(R.id.civitas10);
		civitas_medley = (TextView)findViewById(R.id.civitas6);
		civitas_smart = (TextView)findViewById(R.id.civitas9);
		civitas_travelport = (TextView)findViewById(R.id.civitas5);
		civitas_vantage = (TextView)findViewById(R.id.civitas4);
		
civitas_asia.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent i = new Intent("android.intent.action.CIVITAS_CONE");
				startActivity(i);
			}
		});

civitas_citizens.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Intent i = new Intent("android.intent.action.CIVITAS_VANTAGE");
		startActivity(i);
	}
});

civitas_cone.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Intent i = new Intent("android.intent.action.CIVITAS_CONE");
		startActivity(i);
	}
});

civitas_cyberark.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Intent i = new Intent("android.intent.action.CIVITAS_TRAVELPORT");
		startActivity(i);
	}
});
civitas_grupo.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Intent i = new Intent("android.intent.action.CIVITAS_MEDLEY");
		startActivity(i);
	}
});



civitas_medley.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Intent i = new Intent("android.intent.action.CIVITAS_CYBERARK");
		startActivity(i);
	}
});

civitas_smart.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Intent i = new Intent("android.intent.action.CIVITAS_SMART");
		startActivity(i);
	}
});
		
civitas_travelport.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Intent i = new Intent("android.intent.action.CIVITAS_GRUPO");
		startActivity(i);
	}
});

civitas_vantage.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Intent i = new Intent("android.intent.action.CIVITAS_VANTAGE");
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
