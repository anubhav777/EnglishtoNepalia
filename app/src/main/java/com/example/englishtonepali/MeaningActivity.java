package com.example.englishtonepali;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;


public class MeaningActivity extends AppCompatActivity {

    private TextView dicView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meaning);

        Bundle bundle = getIntent().getExtras();

        if(bundle != null) {
            String meaning = bundle.getString("anish");
            dicView =findViewById(R.id.dicView);
            dicView.setText(meaning);
        }
        else {
            Toast.makeText(this, "Not Found In Dictionary", Toast.LENGTH_SHORT).show();
        }
    }
}
