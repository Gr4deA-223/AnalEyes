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

public class Asia extends ActionBarActivity implements OnClickListener{
	
	TextView asiacone, asiavantage, asiacivitas, asiatravelport, asiamedley, asiacyberark, asiasmart, asiagrupo, asiacitizens; 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.asia);
		
		asiacone = (TextView)findViewById(R.id.asia3);
		asiavantage = (TextView)findViewById(R.id.asia4);
		asiacivitas = (TextView)findViewById(R.id.asia5);
		asiatravelport = (TextView)findViewById(R.id.asia6);
		asiamedley = (TextView)findViewById(R.id.asia7);
		asiacyberark = (TextView)findViewById(R.id.asia8);
		asiasmart = (TextView)findViewById(R.id.asia9);
		asiagrupo = (TextView)findViewById(R.id.asia10);
		asiacitizens = (TextView)findViewById(R.id.asia11);
		
asiacone.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent i = new Intent("android.intent.action.ASIA_CONE");
				startActivity(i);
			}
		});

asiavantage.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Intent i = new Intent("android.intent.action.ASIA_VANTAGE");
		startActivity(i);
	}
});

asiacivitas.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Intent i = new Intent("android.intent.action.ASIA_CIVITAS");
		startActivity(i);
	}
});

asiatravelport.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Intent i = new Intent("android.intent.action.ASIA_TRAVELPORT");
		startActivity(i);
	}
});
asiamedley.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Intent i = new Intent("android.intent.action.ASIA_MEDLEY");
		startActivity(i);
	}
});



asiacyberark.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Intent i = new Intent("android.intent.action.ASIA_CYBERARK");
		startActivity(i);
	}
});

asiasmart.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Intent i = new Intent("android.intent.action.ASIA_SMART");
		startActivity(i);
	}
});
		
asiagrupo.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Intent i = new Intent("android.intent.action.ASIA_GRUPO");
		startActivity(i);
	}
});

asiacitizens.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Intent i = new Intent("android.intent.action.ASIA_CITIZENS");
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
