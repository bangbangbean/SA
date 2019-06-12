package com.example.sa;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;

public class realhome extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private Button dickshopbt;
    private Button exchangebt;
    private ImageButton shopcar;
    private ImageButton productbt;
    private ImageButton productbt2;
    private TextView fabe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_realhome);

        fabe=(TextView) findViewById(R.id.fabe);
        SharedPreferences session = getSharedPreferences("save_useraccount",MODE_PRIVATE);
        SharedPreferences.Editor editor=session.edit();

        String x = session.getString("user_id","目前沒人登入");
        fabe.setText("帳號為 : "+x);

        Toolbar toolbar = findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        Spinner spinner = (Spinner) findViewById(R.id.hotrank);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.planets_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        shopcar = (ImageButton) findViewById(R.id.shopcar);
        shopcar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent= new Intent(realhome.this, shoppingcar.class);
                startActivity(intent);
            }
        });
        exchangebt = (Button) findViewById(R.id.functionlist_exchangebt);
        exchangebt.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intent= new Intent(realhome.this, realexchengehome.class);
                startActivity(intent);
            }
        });
        dickshopbt = (Button) findViewById(R.id.functionlist_dickshopbt);
        dickshopbt.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intent= new Intent(realhome.this, dickshop.class);
                startActivity(intent);
            }
        });
        productbt = (ImageButton) findViewById(R.id.newproduct1);
        productbt.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intent= new Intent(realhome.this, newproducts.class);
                startActivity(intent);
            }
        });
        productbt2 = (ImageButton) findViewById(R.id.newproduct2);
        productbt2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intent= new Intent(realhome.this, newproducts.class);
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

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.classification_1) {
            // Handle the camera action
        } else if (id == R.id.classification_2) {

        } else if (id == R.id.classification_3) {

        } else if (id == R.id.classification_4) {

        } else if (id == R.id.classification_5) {

        } else if (id == R.id.classification_6) {

        }else if (id == R.id.classification_7) {

        }else if (id == R.id.classification_8) {

        }else if (id == R.id.classification_9) {

        }else if (id == R.id.classification_10) {

        }else if (id == R.id.classification_12) {

        }else if (id == R.id.classification_13) {

        }else if (id == R.id.classification_14) {

        }else if (id == R.id.classification_15) {

        }else if (id == R.id.classification_16) {

        }else if (id == R.id.classification_17) {

        }else if (id == R.id.classification_18) {

        }else if (id == R.id.classification_19) {

        }else if (id == R.id.classification_20) {

        }else if (id == R.id.classification_21) {

        }else if (id == R.id.classification_22) {

        }else if (id == R.id.classification_23) {

        }else if (id == R.id.classification_24) {

        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
