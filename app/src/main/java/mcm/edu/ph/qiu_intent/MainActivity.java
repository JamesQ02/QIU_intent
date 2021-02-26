package mcm.edu.ph.qiu_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button next1 = findViewById(R.id.button);
        Button next2 = findViewById(R.id.button);

        next1.setOnClickListener((View.OnClickListener) this);
        next2.setOnClickListener((View.OnClickListener) this);
    }

    public void onClick(View v){


        TextView display = findViewById(R.id.txtmonth);
        EditText input = findViewById(R.id.txtnum);

        Intent i = new Intent(MainActivity.this,Activity2.class);

        startActivity(i);

        int numberMonths = Integer.parseInt(String.valueOf(input.getText()));





        switch(v.getId()) {
            case R.id.button:

                i.putExtra("INT_MONTHS", numberMonths);
                startActivity(i);
                break;

        }
    }
}