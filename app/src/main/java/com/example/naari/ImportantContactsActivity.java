package com.example.naari;


import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;

public class ImportantContactsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_important_contacts);

        TextView contactsTextView = findViewById(R.id.contacts_text_view);
        String contacts = "1. Police: 100\n" +
                "2. Ambulance: 102\n" +
                "3. Fire Service: 101\n" +
                "4. Women Helpline: 181";
        contactsTextView.setText(contacts);
    }
}

