package com.example.naari;


import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;

public class SafetyLawsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_safety_laws);

        TextView lawsTextView = findViewById(R.id.laws_text_view);
        String laws = "1. Law on Sexual Harassment\n" +
                "2. Dowry Prohibition Act\n" +
                "3. Protection of Women from Domestic Violence Act\n" +
                "4. The Criminal Law Amendment Act";
        lawsTextView.setText(laws);
    }
}
