package jamjohn.alexcorp.analeyes;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Cone extends ActionBarActivity {
	
	TextView cone_asia, cone_civitas, cone_citizens, cone_cyberark, 
	cone_grupo, cone_medley, cone_smart, cone_travelport, cone_vantage;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.cone);
		
		cone_asia = (TextView)findViewById(R.id.cone7);
		cone_citizens = (TextView)findViewById(R.id.cone11);
		cone_civitas = (TextView)findViewById(R.id.cone4);
		cone_cyberark = (TextView)findViewById(R.id.cone8);
		cone_grupo = (TextView)findViewById(R.id.cone10);
		cone_medley = (TextView)findViewById(R.id.cone6);
		cone_smart = (TextView)findViewById(R.id.cone9);
		cone_travelport = (TextView)findViewById(R.id.cone5);
		cone_vantage = (TextView)findViewById(R.id.cone3);
		
cone_asia.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent i = new Intent("android.intent.action.CONE_ASIA");
				startActivity(i);
			}
		});

cone_citizens.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Intent i = new Intent("android.intent.action.CONE_CITIZENS");
		startActivity(i);
	}
});

cone_civitas.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Intent i = new Intent("android.intent.action.CONE_CIVITAS");
		startActivity(i);
	}
});

cone_cyberark.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Intent i = new Intent("android.intent.action.CONE_TRAVELPORT");
		startActivity(i);
	}
});
cone_grupo.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Intent i = new Intent("android.intent.action.CONE_MEDLEY");
		startActivity(i);
	}
});



cone_medley.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Intent i = new Intent("android.intent.action.CONE_CYBERARK");
		startActivity(i);
	}
});

cone_smart.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Intent i = new Intent("android.intent.action.CONE_SMART");
		startActivity(i);
	}
});
		
cone_travelport.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Intent i = new Intent("android.intent.action.CONE_GRUPO");
		startActivity(i);
	}
});

cone_vantage.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Intent i = new Intent("android.intent.action.CONE_VANTAGE");
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
