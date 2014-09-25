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

public class Smart extends ActionBarActivity implements OnClickListener {
	
	

	TextView smart_asia, smart_civitas, smart_citizens, smart_cone, 
	smart_cyberark, smart_grupo, smart_medley, smart_travelport, smart_vantage;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.smart);
		
		smart_asia = (TextView)findViewById(R.id.smart8);
		smart_citizens = (TextView)findViewById(R.id.smart11);
		smart_civitas = (TextView)findViewById(R.id.smart5);
		smart_cone = (TextView)findViewById(R.id.smart3);
		smart_cyberark = (TextView)findViewById(R.id.smart9);
		smart_grupo = (TextView)findViewById(R.id.smart10);
		smart_medley = (TextView)findViewById(R.id.smart7);
		smart_travelport = (TextView)findViewById(R.id.smart6);
		smart_vantage = (TextView)findViewById(R.id.smart4);
		
smart_asia.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent i = new Intent("android.intent.action.SMART_ASIA");
				startActivity(i);
			}
		});

smart_citizens.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Intent i = new Intent("android.intent.action.SMART_CITIZENS");
		startActivity(i);
	}
});

smart_civitas.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Intent i = new Intent("android.intent.action.SMART_CIVITAS");
		startActivity(i);
	}
});

smart_cone.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Intent i = new Intent("android.intent.action.SMART_CONE");
		startActivity(i);
	}
});
smart_cyberark.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Intent i = new Intent("android.intent.action.SMART_CYBERARK");
		startActivity(i);
	}
});



smart_grupo.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Intent i = new Intent("android.intent.action.SMART_GRUPO");
		startActivity(i);
	}
});

smart_medley.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Intent i = new Intent("android.intent.action.SMART_MEDLEY");
		startActivity(i);
	}
});
		
smart_travelport.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Intent i = new Intent("android.intent.action.SMART_TRAVELPORT");
		startActivity(i);
	}
});

smart_vantage.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Intent i = new Intent("android.intent.action.SMART_VANTAGE");
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
