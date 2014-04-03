package com.fourfoureight.lolhelper;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;

public class ChampionSelect extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_champion_select);

		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.champion_select, menu);
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

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_champion_select,
					container, false);
			return rootView;
		}
	}
	
    public void ingame(View view) {
    	Intent intent = new Intent(this, InGame.class);
    	startActivity(intent);
    }
    
    /** Called when the user clicks the Champion Select button */
    public void championselect(View view) {
    	Intent intent = new Intent(this, MainActivity.class);
    	startActivity(intent);
    }
    
    public void teambuilder(View view) {
    	Intent intent = new Intent(this, TeamBuilder.class);
    	startActivity(intent);
    }
    
    public void counters(View view) {
    	Intent intent = new Intent(this, Counters.class);
    	startActivity(intent);
    }
    
    /** Called when the user clicks the Post Game button */
    public void postgame(View view) {
    	Intent intent = new Intent(this, PostGame.class);
    	startActivity(intent);
    }
    
    /** Called when the user clicks the General Info button */
    public void generalinfo(View view) {
    	Intent intent = new Intent(this, GeneralInfo.class);
    	startActivity(intent);
    }
    
    /** Called when the user clicks the Options button */
    public void options(View view) {
    	Intent intent = new Intent(this, Options.class);
    	startActivity(intent);
    }

}
