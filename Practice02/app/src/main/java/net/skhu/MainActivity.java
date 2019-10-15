package net.skhu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Button;
import android.view.View;
import androidx.appcompat.app.AlertDialog;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioGroup.OnCheckedChangeListener listener = new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                int mipmapId = 0;
                switch (checkedId) {
                    case R.id.radioCat:
                        mipmapId = R.mipmap.animal_cat_large;
                        break;
                    case R.id.radioDog:
                        mipmapId = R.mipmap.animal_dog_large;
                        break;
                    case R.id.radioOwl:
                        mipmapId = R.mipmap.animal_owl_large;
                        break;
                }
                ImageView imageView1 = (ImageView) findViewById(R.id.imageView);
                imageView1.setImageResource(mipmapId);
            }
        };
        final RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(listener);
        }

    public void button1_clicked(View button) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(R.string.saveSuccess);
        builder.setNeutralButton(R.string.close, null);
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_login) {
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
        } else if (id == R.id.action_register) {
            Intent intent = new Intent(this, SpinnerActivity.class);
            startActivity(intent);
        } else if (id == R.id.action_edit) {
            Intent intent = new Intent(this, CheckboxesActivity.class);
            startActivity(intent);
        } else if (id == R.id.action_list) {
            Intent intent = new Intent(this, ListViewActivity.class);
            startActivity(intent);
        } else if (id == R.id.action_change) {
            Intent intent = new Intent(this, ChangeActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }

}
