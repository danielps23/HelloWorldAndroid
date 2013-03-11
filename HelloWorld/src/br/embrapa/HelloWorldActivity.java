package br.embrapa;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HelloWorldActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        final TextView textView = (TextView) findViewById(R.id.textView);
		final EditText editText = (EditText) findViewById(R.id.editText);
        Button button = (Button) findViewById(R.id.button);
        
        button.setOnClickListener( new View.OnClickListener() {
			
			public void onClick(View v) {
				
				textView.setText( "Bem vindo " +editText.getText() );
				editText.setText("");
			}
		} );
        
        Log.i("CICLO DE VIDA", "onCreate");
    }
    
    @Override
    protected void onResume() {
    	super.onResume();
    	Log.i("CICLO DE VIDA", "onResume");
    }
    
    @Override
    protected void onStart() {
    	super.onStart();
    	Log.i("CICLO DE VIDA", "onStart");
    }
    
    @Override
    protected void onRestart() {
    	super.onRestart();
    	Log.i("CICLO DE VIDA", "onRestart");
    }
    
    @Override
    protected void onPause() {
    	super.onPause();
    	Log.i("CICLO DE VIDA", "onPause");
    }
    
    @Override
    protected void onDestroy() {
    	super.onDestroy();
    	Log.i("CICLO DE VIDA", "onDestroy");
    }
    
    @Override
    protected void onStop() {
    	super.onStop();
    	Log.i("CICLO DE VIDA", "onStop");
    }
}