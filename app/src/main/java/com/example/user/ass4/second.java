package com.example.user.ass4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class second extends AppCompatActivity {
ListView list;
String json;
ada aa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent i=getIntent();
        json=i.getExtras().getString("json");
        list=findViewById(R.id.ll);
        aa=new ada(this);
        list.setAdapter(aa);

        try {
            JSONArray jsonArray=new JSONArray(json);
            int count=0;
            String emp;
            while(count<jsonArray.length()){
                JSONObject jsonObject=jsonArray.getJSONObject(count);
                emp=jsonObject.getString("name");
                Name namee=new Name(emp);
                aa.list.add(namee);
                count++;
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }


    }
}
