package io.github.xmu_android_basics.helloapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText personName;
    TextView messageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        personName = findViewById(R.id.personName);
        messageView = findViewById(R.id.welcomeMessage);
    }

    public void hello(View view) {
        String messageTemplate = getString(R.string.welcomeMessage);
        String message = String.format(messageTemplate, personName.getText().toString());

        messageView.setText(message);
    }
}