package com.example.naari;


import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;

public class AwarenessActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_awareness);

        TextView awarenessTextView = findViewById(R.id.awareness_text_view);
        String awareness = "Self-defense tips:\n" +
                "1. Be aware of your surroundings.\n" +
                "2. Trust your instincts.\n" +
                "3. Take self-defense classes.";
        awarenessTextView.setText(awareness);
    }
}


