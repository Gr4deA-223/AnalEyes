package jamjohn.alexcorp.analeyes;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Travelport extends ActionBarActivity implements OnClickListener {
	

	TextView travelport_asia, travelport_civitas, travelport_citizens, travelport_cone, 
	travelport_cyberark, travelport_grupo, travelport_medley, travelport_smart, travelport_vantage;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.travelport);
		
		travelport_asia = (TextView)findViewById(R.id.travelport7);
		travelport_citizens = (TextView)findViewById(R.id.travelport11);
		travelport_civitas = (TextView)findViewById(R.id.travelport5);
		travelport_cone = (TextView)findViewById(R.id.travelport3);
		travelport_cyberark = (TextView)findViewById(R.id.travelport8);
		travelport_grupo = (TextView)findViewById(R.id.travelport10);
		travelport_medley = (TextView)findViewById(R.id.travelport6);
		travelport_smart = (TextView)findViewById(R.id.travelport9);
		travelport_vantage = (TextView)findViewById(R.id.travelport4);
		
travelport_asia.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent i = new Intent("android.intent.action.TRAVELPORT_ASIA");
				startActivity(i);
			}
		});

travelport_citizens.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Intent i = new Intent("android.intent.action.TRAVELPORT_CITIZENS");
		startActivity(i);
	}
});

travelport_civitas.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Intent i = new Intent("android.intent.action.TRAVELPORT_CIVITAS");
		startActivity(i);
	}
});

travelport_cone.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Intent i = new Intent("android.intent.action.TRAVELPORT_CONE");
		startActivity(i);
	}
});
travelport_cyberark.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Intent i = new Intent("android.intent.action.TRAVELPORT_CYBERARK");
		startActivity(i);
	}
});



travelport_grupo.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Intent i = new Intent("android.intent.action.TRAVELPORT_GRUPO");
		startActivity(i);
	}
});

travelport_medley.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Intent i = new Intent("android.intent.action.TRAVELPORT_MEDLEY");
		startActivity(i);
	}
});
		
travelport_smart.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Intent i = new Intent("android.intent.action.TRAVELPORT_SMART");
		startActivity(i);
	}
});

travelport_vantage.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Intent i = new Intent("android.intent.action.TRAVELPORT_VANTAGE");
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


	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
}
