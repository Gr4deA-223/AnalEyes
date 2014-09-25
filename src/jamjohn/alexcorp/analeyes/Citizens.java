package jamjohn.alexcorp.analeyes;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class Citizens extends ActionBarActivity {
	
	TextView citizens_asia, citizens_civitas, citizens_cone, citizens_cyberark, 
	citizens_grupo, citizens_medley, citizens_smart, citizens_travelport, citizens_vantage;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.citizens);
		
		citizens_asia = (TextView)findViewById(R.id.citizens8);
		citizens_civitas = (TextView)findViewById(R.id.citizens5);
		citizens_cone = (TextView)findViewById(R.id.citizens3);
		citizens_cyberark = (TextView)findViewById(R.id.citizens9);
		citizens_grupo = (TextView)findViewById(R.id.citizens11);
		citizens_medley = (TextView)findViewById(R.id.citizens7);
		citizens_smart = (TextView)findViewById(R.id.citizens10);
		citizens_travelport = (TextView)findViewById(R.id.citizens6);
		citizens_vantage = (TextView)findViewById(R.id.citizens4);
		
citizens_asia.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent i = new Intent("android.intent.action.CITIZENS_CONE");
				startActivity(i);
			}
		});

citizens_civitas.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Intent i = new Intent("android.intent.action.CITIZENS_VANTAGE");
		startActivity(i);
	}
});

citizens_cone.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Intent i = new Intent("android.intent.action.CITIZENS_CIVITAS");
		startActivity(i);
	}
});

citizens_cyberark.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Intent i = new Intent("android.intent.action.CITIZENS_TRAVELPORT");
		startActivity(i);
	}
});
citizens_grupo.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Intent i = new Intent("android.intent.action.CITIZENS_MEDLEY");
		startActivity(i);
	}
});



citizens_medley.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Intent i = new Intent("android.intent.action.CITIZENS_CYBERARK");
		startActivity(i);
	}
});

citizens_smart.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Intent i = new Intent("android.intent.action.CITIZENS_SMART");
		startActivity(i);
	}
});
		
citizens_travelport.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Intent i = new Intent("android.intent.action.CITIZENS_GRUPO");
		startActivity(i);
	}
});

citizens_vantage.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Intent i = new Intent("android.intent.action.CITIZENS_VANTAGE");
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
