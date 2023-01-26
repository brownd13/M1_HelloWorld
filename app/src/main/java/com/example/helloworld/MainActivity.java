package com.example.helloworld;

//import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int counter = 0;
    private TextView welcomeCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView) findViewById(R.id.countDisplay);
        textView.setText(getString(R.string.countText) + " " + counter);
    }
    public void counterIncr(View view){
        counter++;
        TextView textView = (TextView) findViewById(R.id.countDisplay);
        textView.setText(getString(R.string.countText) + " " + counter);
    }
    public void nextPage(View view){
        setContentView(R.layout.activity_second);
    }

    public void activityMain(View view){
        setContentView(R.layout.activity_main);
        TextView textView = (TextView) findViewById(R.id.countDisplay);
        textView.setText(getString(R.string.countText) + " " + counter);
    }
    
    public void totalToast(View view) {
        String msg = "Counter total: " + counter + ".";
        Toast toast = Toast.makeText(this, msg, Toast.LENGTH_SHORT);
        toast.show();
        }
}