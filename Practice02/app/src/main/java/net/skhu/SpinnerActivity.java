package net.skhu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;


public class SpinnerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        Spinner spinner = (Spinner) findViewById(R.id.spinner_phoneType);

        View.OnClickListener listener1 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Spinner spinner1 = (Spinner) findViewById(R.id.spinner_phoneType);
                int index1 = spinner1.getSelectedItemPosition();
                String text1 = spinner1.getSelectedItem().toString();

                EditText editText_type = (EditText) findViewById(R.id.editText_type);
                editText_type.setText(text1);

                EditText editText_phone = (EditText) findViewById(R.id.editText_phone);
                String phone = editText_phone.getText().toString();
                EditText editText_number = (EditText) findViewById(R.id.editText_number);
                editText_number.setText(phone);
            }
        };
        Button button = (Button) findViewById(R.id.button_confirm);
        button.setOnClickListener(listener1);

        Button button2 = (Button) findViewById(R.id.button_move);
        View.OnClickListener listener2 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SpinnerActivity.this, ListViewActivity.class);
                startActivity(intent);
            }
        };
        button2.setOnClickListener(listener2);
    }
}
