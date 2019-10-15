package net.skhu;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Exam2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam2);

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(R.string.test);
        builder.setMessage(R.string.inputData);
        builder.setPositiveButton(R.string.second, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int index) {
                EditText editText = (EditText) findViewById(R.id.editText);
                editText.setText(R.string.second);
            }
        });
        builder.setNegativeButton(R.string.first, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int index) {
                EditText editText = (EditText) findViewById(R.id.editText);
                editText.setText(R.string.first);
            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    public void button_clicked(View button) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(R.string.test);
        builder.setMessage(R.string.inputData);
        builder.setPositiveButton(R.string.second, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int index) {
                EditText editText = (EditText) findViewById(R.id.editText);
                editText.setText(R.string.second);
            }
        });
        builder.setNegativeButton(R.string.first, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int index) {
                EditText editText = (EditText) findViewById(R.id.editText);
                editText.setText(R.string.first);
            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}
