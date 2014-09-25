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

public class Medley extends ActionBarActivity implements OnClickListener {
	
	
	TextView medley_asia, medley_civitas, medley_citizens, medley_cone, 
	medley_cyberark, medley_grupo, medley_smart, medley_travelport, medley_vantage;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.medley);
		
		medley_asia = (TextView)findViewById(R.id.medley7);
		medley_citizens = (TextView)findViewById(R.id.medley11);
		medley_civitas = (TextView)findViewById(R.id.medley5);
		medley_cone = (TextView)findViewById(R.id.medley3);
		medley_cyberark = (TextView)findViewById(R.id.medley8);
		medley_grupo = (TextView)findViewById(R.id.medley10);
		medley_smart = (TextView)findViewById(R.id.medley9);
		medley_travelport = (TextView)findViewById(R.id.medley6);
		medley_vantage = (TextView)findViewById(R.id.medley4);
		
medley_asia.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent i = new Intent("android.intent.action.MEDLEY_ASIA");
				startActivity(i);
			}
		});

medley_citizens.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Intent i = new Intent("android.intent.action.MEDLEY_CITIZENS");
		startActivity(i);
	}
});

medley_civitas.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Intent i = new Intent("android.intent.action.MEDLEY_CIVITAS");
		startActivity(i);
	}
});

medley_cone.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Intent i = new Intent("android.intent.action.MEDLEY_CONE");
		startActivity(i);
	}
});
medley_cyberark.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Intent i = new Intent("android.intent.action.MEDLEY_CYBERARK");
		startActivity(i);
	}
});



medley_grupo.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Intent i = new Intent("android.intent.action.MEDLEY_GRUPO");
		startActivity(i);
	}
});

medley_smart.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Intent i = new Intent("android.intent.action.MEDLEY_SMART");
		startActivity(i);
	}
});
		
medley_travelport.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Intent i = new Intent("android.intent.action.MEDLEY_TRAVELPORT");
		startActivity(i);
	}
});

medley_vantage.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Intent i = new Intent("android.intent.action.MEDLEY_VANTAGE");
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
