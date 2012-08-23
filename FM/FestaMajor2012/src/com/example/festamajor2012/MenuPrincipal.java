package com.example.festamajor2012;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MenuPrincipal extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_menu_principal, menu);
        return true;
    }
}
