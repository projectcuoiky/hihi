package com.example.m;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class DangKyActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dangky);
        EditText editten=(EditText)findViewById(R.id.editten);
        EditText editho=(EditText)findViewById(R.id.editho);
        EditText editemail=(EditText)findViewById(R.id.editemail);
        EditText editmatkhau=(EditText)findViewById(R.id.editmatkhau);
        EditText editnhaplai=(EditText)findViewById(R.id.editnhaplai);
        Button buttondangky=(Button)findViewById(R.id.buttondangky);
        buttondangky.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
		finish();
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
