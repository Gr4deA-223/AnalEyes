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

public class Grupo extends ActionBarActivity implements OnClickListener {
	
	
	TextView grupo_asia, grupo_civitas, grupo_citizens, grupo_cone, 
	grupo_cyberark, grupo_medley, grupo_smart, grupo_travelport, grupo_vantage;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.grupo);
		
		grupo_asia = (TextView)findViewById(R.id.grupo8);
		grupo_citizens = (TextView)findViewById(R.id.grupo11);
		grupo_civitas = (TextView)findViewById(R.id.grupo5);
		grupo_cone = (TextView)findViewById(R.id.grupo3);
		grupo_cyberark = (TextView)findViewById(R.id.grupo9);
		grupo_medley = (TextView)findViewById(R.id.grupo7);
		grupo_smart = (TextView)findViewById(R.id.grupo10);
		grupo_travelport = (TextView)findViewById(R.id.grupo6);
		grupo_vantage = (TextView)findViewById(R.id.grupo4);
		
grupo_asia.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent i = new Intent("android.intent.action.GRUPO_ASIA");
				startActivity(i);
			}
		});

grupo_citizens.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Intent i = new Intent("android.intent.action.GRUPO_CITIZENS");
		startActivity(i);
	}
});

grupo_civitas.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Intent i = new Intent("android.intent.action.GRUPO_CIVITAS");
		startActivity(i);
	}
});

grupo_cone.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Intent i = new Intent("android.intent.action.GRUPO_CONE");
		startActivity(i);
	}
});
grupo_cyberark.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Intent i = new Intent("android.intent.action.GRUPO_CYBERARK");
		startActivity(i);
	}
});



grupo_medley.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Intent i = new Intent("android.intent.action.GRUPO_MEDLEY");
		startActivity(i);
	}
});

grupo_smart.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Intent i = new Intent("android.intent.action.GRUPO_SMART");
		startActivity(i);
	}
});
		
grupo_travelport.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Intent i = new Intent("android.intent.action.GRUPO_TRAVELPORT");
		startActivity(i);
	}
});

grupo_vantage.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Intent i = new Intent("android.intent.action.GRUPO_VANTAGE");
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
