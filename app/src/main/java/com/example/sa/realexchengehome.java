package com.example.sa;

import android.content.Intent;
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
import android.widget.Button;
import android.widget.ImageButton;

public class realexchengehome extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private Button shopbt;
    private Button dickshopbt;
    private ImageButton shopcar;
    private ImageButton product1;
    private ImageButton product2;
    private ImageButton product3;
    private ImageButton product4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_realexchengehome);
        Toolbar toolbar = findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        shopcar = (ImageButton) findViewById(R.id.shopcar);
        shopcar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent= new Intent(realexchengehome.this, shoppingcar.class);
                startActivity(intent);
            }
        });
        shopcar.bringToFront();

        shopbt = (Button) findViewById(R.id.functionlist_shopbt);
        shopbt.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intent= new Intent(realexchengehome.this, realhome.class);
                startActivity(intent);
            }
        });

        dickshopbt = (Button) findViewById(R.id.functionlist_dickshopbt);
        dickshopbt.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intent= new Intent(realexchengehome.this, dickshop.class);
                startActivity(intent);
            }
        });
        product1 = (ImageButton) findViewById(R.id.product1);
        product1.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intent= new Intent(realexchengehome.this, bartergoods.class);
                startActivity(intent);
            }
        });
        product2 = (ImageButton) findViewById(R.id.product2);
        product2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intent= new Intent(realexchengehome.this, bartergoods.class);
                startActivity(intent);
            }
        });
        product3 = (ImageButton) findViewById(R.id.product3);
        product3.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intent= new Intent(realexchengehome.this, bartergoods.class);
                startActivity(intent);
            }
        });
        product4 = (ImageButton) findViewById(R.id.product4);
        product4.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intent= new Intent(realexchengehome.this, exchangehome.class);
                startActivity(intent);
            }
        });
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
