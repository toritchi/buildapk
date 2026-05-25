package com.example.toolsrequest;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText nameInput = findViewById(R.id.nameInput);
        EditText toolInput = findViewById(R.id.toolInput);
        EditText quantityInput = findViewById(R.id.quantityInput);
        EditText descriptionInput = findViewById(R.id.descriptionInput);
        Button submitButton = findViewById(R.id.submitButton);
        TextView resultText = findViewById(R.id.resultText);

        submitButton.setOnClickListener(view -> {
            String name = nameInput.getText().toString().trim();
            String tool = toolInput.getText().toString().trim();
            String quantity = quantityInput.getText().toString().trim();
            String description = descriptionInput.getText().toString().trim();

            if (name.isEmpty() || tool.isEmpty() || quantity.isEmpty()) {
                Toast.makeText(this, "Please fill name, tool, and quantity", Toast.LENGTH_SHORT).show();
                return;
            }

            String request = "Request created:\n\n"
                    + "Name: " + name + "\n"
                    + "Tool: " + tool + "\n"
                    + "Quantity: " + quantity + "\n"
                    + "Description: " + description;

            resultText.setText(request);
            Toast.makeText(this, "Tool request submitted", Toast.LENGTH_SHORT).show();
        });
    }
}
