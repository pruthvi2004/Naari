package com.example.naari;


import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class RegistrationActivity extends AppCompatActivity {

    private EditText nameInput, phoneInput; // Add fields as needed

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        nameInput = findViewById(R.id.name_input);
        phoneInput = findViewById(R.id.phone_input);

        Button submitButton = findViewById(R.id.submit_button);
        submitButton.setOnClickListener(v -> registerUser());
    }

    private void registerUser() {
        String name = nameInput.getText().toString().trim();
        String phone = phoneInput.getText().toString().trim();

        if (!name.isEmpty() && !phone.isEmpty()) {
            // Store data (e.g., in SharedPreferences or a local database)
            Toast.makeText(this, "Registration Successful", Toast.LENGTH_SHORT).show();
            finish(); // Go back to MainActivity
        } else {
            Toast.makeText(this, "Please enter valid details", Toast.LENGTH_SHORT).show();
        }
    }
}
