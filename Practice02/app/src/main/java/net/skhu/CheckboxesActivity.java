package net.skhu;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;



public class CheckboxesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkboxes);

        CompoundButton.OnCheckedChangeListener listener1 = new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked == true) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(CheckboxesActivity.this);
                    builder.setMessage(R.string.loginSuccess);
                    builder.setNeutralButton(R.string.close, null);
                    AlertDialog dialog = builder.create();
                    dialog.show();
                }
            }
        };
        final CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox);
        final Switch switch1 = (Switch) findViewById(R.id.switch1);
        checkBox.setOnCheckedChangeListener(listener1);
        switch1.setOnCheckedChangeListener(listener1);

        RadioGroup.OnCheckedChangeListener listener2 = new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radioButton = (RadioButton) findViewById(checkedId);
                String s = radioButton.getText().toString();
                EditText editText_job = (EditText) findViewById(R.id.editText_job);
                editText_job.setText(s);
            }
        };
        final RadioGroup radioGroup2 = (RadioGroup) findViewById(R.id.radioGroup2);
        radioGroup2.setOnCheckedChangeListener(listener2);

    }
}
