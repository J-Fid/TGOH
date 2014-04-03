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
	
<<<<<<< HEAD
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

=======
	public void setDefaultView(){
		setContentView(R.layout.activity_main);
		
		Button Signin = (Button) findViewById(R.id.signin);
		Button Signup = (Button) findViewById(R.id.signup);
		
		final EditText Username = (EditText) findViewById(R.id.Username);
		final EditText Password = (EditText) findViewById(R.id.Password);
		
		
		Signup.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// setting a new account to the Database.
				setSigninPage();
			}
		});
		
		Signin.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// Jason will make a new method for the schedule page.
				setSchedule_page();

				
			}
		});
	}
	
	
	/**
	 *Display the Sign up page 
	 **/
	public void setSigninPage(){
		setContentView(R.layout.signuppage);
		
		Button Signin = (Button) findViewById(R.id.button1);
		Button Back = (Button) findViewById(R.id.button2);
		// TODO: pull information from text boxes and add the new user to the database
		//also error checking
		Signin.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				setDefaultView();
				// jason will implement controllers
			}
		});
		
		Back.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				//take user back to original sign in page
				setDefaultView();
			}
		});
	}
	
	public void setSchedule_page(){
		setContentView(R.layout.class_selection_page);
		
		Button VS = (Button) findViewById(R.id.button1);
		Button Req = (Button) findViewById(R.id.button2);
		
		VS.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				setContentView(R.layout.schedule_page);
				
			}
		});
	}
>>>>>>> refs/remotes/Sam/master
}
