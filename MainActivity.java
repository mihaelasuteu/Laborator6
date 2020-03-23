package com.example.laborator6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private EditText editText;
    private Button savedatabutton;
    private Button gotosecondactivity;

    public static final String SHARED_PREFERENCE = "sharedPreference";
    public static final String TEXT = "text";

    private String text;
    //class MySharedPreference{
      //  public TextView name;
        //public Button;


    //}



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        //Button gotosecondactiviti = findViewById(R.id.gotosecondactivity);
        //gotosecondactiviti.setOnClickListener(new View.OnClickListener(){
          // Intent

        //});

        textView = (TextView) findViewById(R.id.textview);
        editText = (EditText) findViewById(R.id.edittext);
        savedatabutton = (Button) findViewById(R.id.savedatabutton);
        gotosecondactivity = (Button) findViewById(R.id.gotosecondactivity);

        savedatabutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                savedata();
            }
        });
        loadData();
        updateViews();
    }

    public void savedata(){
    SharedPreferences sharedPreference = getSharedPreferences(SHARED_PREFERENCE, MODE_PRIVATE);
    SharedPreferences.Editor editor = sharedPreference.edit();

    editor.putString(TEXT, textView.getText().toString());

    editor.apply();

        Toast.makeText(this, "Data saved", Toast.LENGTH_SHORT).show();

    }

    public void loadData(){
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFERENCE, MODE_PRIVATE);
        text = sharedPreferences.getString(TEXT, "");

    }

    public void updateViews() {
        textView.setText(text);

    }
}
