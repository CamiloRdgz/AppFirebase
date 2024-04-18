package com.camilordgz.appfirebase;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    private Button addQuoteButton;
    private Button viewQuotesButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Referencias a los botones flotantes
        addQuoteButton = findViewById(R.id.addQuoteButton);
        viewQuotesButton = findViewById(R.id.viewAllQuotesButton);

        addQuoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AddQuote.class);
                startActivity(intent);
            }
        });

        viewQuotesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ViewAllQuotes.class);
                startActivity(intent);
            }
        });
    }
}