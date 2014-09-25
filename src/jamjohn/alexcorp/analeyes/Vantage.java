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

public class Vantage extends ActionBarActivity implements OnClickListener {
	
	
	TextView vantage_asia, vantage_civitas, vantage_citizens, vantage_cone, 
	vantage_cyberark, vantage_grupo, vantage_medley, vantage_smart, vantage_travelport;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.vantage);
		
		vantage_asia = (TextView)findViewById(R.id.vantage7);
		vantage_citizens = (TextView)findViewById(R.id.vantage11);
		vantage_civitas = (TextView)findViewById(R.id.vantage4);
		vantage_cone = (TextView)findViewById(R.id.vantage3);
		vantage_cyberark = (TextView)findViewById(R.id.vantage8);
		vantage_grupo = (TextView)findViewById(R.id.vantage10);
		vantage_medley = (TextView)findViewById(R.id.vantage6);
		vantage_smart = (TextView)findViewById(R.id.vantage9);
		vantage_travelport = (TextView)findViewById(R.id.vantage5);
		
vantage_asia.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent i = new Intent("android.intent.action.VANTAGE_ASIA");
				startActivity(i);
			}
		});

vantage_citizens.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Intent i = new Intent("android.intent.action.VANTAGE_CITIZENS");
		startActivity(i);
	}
});

vantage_civitas.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Intent i = new Intent("android.intent.action.VANTAGE_CIVITAS");
		startActivity(i);
	}
});

vantage_cone.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Intent i = new Intent("android.intent.action.VANTAGE_CONE");
		startActivity(i);
	}
});
vantage_cyberark.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Intent i = new Intent("android.intent.action.VANTAGE_CYBERARK");
		startActivity(i);
	}
});



vantage_grupo.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Intent i = new Intent("android.intent.action.VANTAGE_GRUPO");
		startActivity(i);
	}
});

vantage_medley.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Intent i = new Intent("android.intent.action.VANTAGE_MEDLEY");
		startActivity(i);
	}
});
		
vantage_smart.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Intent i = new Intent("android.intent.action.VANTAGE_SMART");
		startActivity(i);
	}
});

vantage_travelport.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Intent i = new Intent("android.intent.action.VANTAGE_TRAVELPORT");
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
