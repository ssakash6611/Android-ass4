package com.example.user.ass4;

import android.os.AsyncTask;

import org.json.JSONArray;
import org.json.JSONException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by user on 4/2/2018.
 */

public class fetchdata extends AsyncTask<Void,Void,Void>{
String data="";

    @Override
    protected Void doInBackground(Void... voids) {
        try {
            URL url=new URL("http://anontech.info/courses/cse491/employees.json");
            HttpURLConnection http=(HttpURLConnection)url.openConnection();
            InputStream inputStream=http.getInputStream();
            BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(inputStream));
            String br="";
            while(br!=null){
                br=bufferedReader.readLine();
                data=data+br;
            }
            JSONArray ja=new JSONArray(data);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
        MainActivity.data=this.data;
    }
}
