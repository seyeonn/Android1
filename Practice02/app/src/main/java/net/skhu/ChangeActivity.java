package net.skhu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;

public class ChangeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change);

        Button button = (Button) findViewById(R.id.button);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editText1 = (EditText) findViewById(R.id.editText1);
                String title1 = editText1.getText().toString();
                EditText editText2 = (EditText) findViewById(R.id.editText2);
                String title2 = editText2.getText().toString();
                editText2.setText(title1);
                editText1.setText(title2);
            }
        };
        button.setOnClickListener(listener);
    }
}