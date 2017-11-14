package com.github.nkzawa.socketio.androidchat;

import android.app.Fragment;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    private DrawerLayout mDrawerLayout;

    private NavigationView mNavigationView;
    private ActionBarDrawerToggle mToggle;
    private Toolbar mToolBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolBar = (Toolbar) findViewById(R.id.nav_act);
        setSupportActionBar(mToolBar);

        mDrawerLayout = (DrawerLayout) findViewById(R.id.navigation_header);
        mToggle = new ActionBarDrawerToggle(this, mDrawerLayout,R.string.open, R.string.close);

        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        NavigationView navigationView = (NavigationView) findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(this);

        MainFragment firstFragment = new MainFragment();

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.fragment_container, firstFragment);
        ft.commit();
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    if(mToggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    //Navigation

    private void displaySelectedScreen(int id){
        Fragment fragment = null;
        switch(id){
            case R.id.account:
                Toast.makeText(this,"Account", Toast.LENGTH_SHORT).show();
                break;
            case R.id.viewUsers:
                Toast.makeText(this,"Users", Toast.LENGTH_SHORT).show();
                break;
            case R.id.settings:
                fragment = new Settings();
                Toast.makeText(this,"Settings", Toast.LENGTH_SHORT).show();
                break;
            case R.id.tsettings:
                fragment = new SelectLanguageFragment();
                Toast.makeText(this,"Translatiaon Settings", Toast.LENGTH_SHORT).show();
                break;
        }
        if(fragment != null){
            FragmentManager manager = getSupportFragmentManager();
            FragmentTransaction ft = manager.beginTransaction();
            ft.commit();
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.navigation_header);
        drawer.closeDrawer(GravityCompat.START);

    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item){
        //Navigation drawer item clicks here.
        int id = item.getItemId();
        displaySelectedScreen(id);
        return true;
    }

}

