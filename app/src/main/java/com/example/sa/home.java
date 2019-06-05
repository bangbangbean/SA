package com.example.sa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;

public class home extends AppCompatActivity {

    private Button exchangebt;
    private ImageButton productbt;
    private ImageButton productbt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Spinner spinner = (Spinner) findViewById(R.id.hotrank);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.planets_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        exchangebt = (Button) findViewById(R.id.functionlist_exchangebt);
        exchangebt.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intent= new Intent(home.this, exchangehome.class);
                startActivity(intent);
            }
        });
        productbt = (ImageButton) findViewById(R.id.newproduct1);
        productbt.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intent= new Intent(home.this, newproducts.class);
                startActivity(intent);
            }
        });
        productbt2 = (ImageButton) findViewById(R.id.newproduct2);
        productbt2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intent= new Intent(home.this, newproducts.class);
                startActivity(intent);
            }
        });
    }

    public class SpinnerActivity extends home implements AdapterView.OnItemSelectedListener {

        public void onItemSelected(AdapterView<?> parent, View view,
                                   int pos, long id) {
            // An item was selected. You can retrieve the selected item using
            // parent.getItemAtPosition(pos)
        }
        public void onNothingSelected(AdapterView<?> parent) {
            // Another interface callback
        }
    }
}
