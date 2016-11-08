package com.example.user.wordcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by user on 08/11/2016.
 */

public class MainApptivity extends AppCompatActivity {

    EditText mEditText;
    TextView mText;
    Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("MainApptivity", "onCreate called");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditText = (EditText) findViewById(R.id.edit_text);
        mText = (TextView) findViewById(R.id.counter_text);
        mButton = (Button) findViewById(R.id.button);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("MainApptivity", "Button clicked");
                String textEntry = mEditText.getText().toString();
                Log.d("MainApptivity", "The text entered was '" + textEntry + "'");

                WordCounter wordCounter = new WordCounter(textEntry);
                String entryCount = wordCounter.wordCount().toString();
                mText.setText(entryCount);
            }
        });
    }
}
