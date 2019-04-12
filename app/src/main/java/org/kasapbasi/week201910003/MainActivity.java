package org.kasapbasi.week201910003;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn;


    @Override
    protected void onResume() {
        super.onResume();
        SharedPreferences setting= PreferenceManager.getDefaultSharedPreferences(this);
        String bhyt=setting.getString("butonName","Click Me");
        btn.setText(bhyt);


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     btn =(Button) findViewById(R.id.button);

    }

public void Git(View v ){

    Intent myint = new Intent(this,Preferences.class);
    startActivity(myint);

}
}
