package edu.ycp.cs.cs496.TGOH;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
    // Method for displaying data entry view
    public void setDefaultView() {
        setContentView(R.layout.activity_main);
        
        // Obtain references to widgets
        Button signIn = (Button) findViewById(R.id.btnSignIn);
        Button signUp = (Button) findViewById(R.id.btnSignUp);
        
        final EditText username = (EditText) findViewById(R.id.txtUserName);
        final EditText password = (EditText) findViewById(R.id.txtPassword);
    
        
// Set onClickListeners for buttons   
        //Sign In
        signIn.setOnClickListener(new View.OnClickListener()
        {
        	@Override
			public void onClick(View v)
        	{
        		String userName = username.getText().toString();
        		String passWord = password.getText().toString();
        		
        		if(userName.equals(null))
        		{
        			Toast.makeText(MainActivity.this, "Please enter a username.", Toast.LENGTH_SHORT).show();
        		}
        		else
        		{
        			
        		}
        	}
        });
    
        //Sign Up
        signUp.setOnClickListener(new View.OnClickListener()
        {
        	@Override
			public void onClick(View v)
        	{
        		
        	}
        });        
    }

}
