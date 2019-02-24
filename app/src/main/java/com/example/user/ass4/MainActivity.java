package com.example.user.ass4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static TextView show;
    public static String data="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changing(View view) {
        fetchdata process=new fetchdata();
        process.execute();
        if(data.equals("")){
            Toast.makeText(getApplicationContext(),"can't get the data",Toast.LENGTH_SHORT).show();
        }
        else{
            Intent i=new Intent(MainActivity.this,second.class);
            i.putExtra("json",data.toString());
            startActivity(i);
        }
    }
}
