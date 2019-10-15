package net.skhu;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button2 = (Button) findViewById(R.id.btnExam2);
        View.OnClickListener listener2 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editText1 = (EditText) findViewById(R.id.editText1);
                editText1.setText("");

                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle(R.string.ok);
                builder.setMessage(R.string.doYouWantToDelete);
                builder.setPositiveButton(R.string.cancel, null);
                builder.setNegativeButton(R.string.delete, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int index) {
                        EditText editText1 = (EditText) findViewById(R.id.editText1);
                        editText1.setText(R.string.delete);
                    }
                });
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        };
        button2.setOnClickListener(listener2);

        Button button1 = (Button) findViewById(R.id.btnExam1);
        View.OnClickListener listener1 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Exam1Activity.class);
                startActivity(intent);
            }
        };
        button1.setOnClickListener(listener1);

    }
}


