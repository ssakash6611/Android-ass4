package com.example.user.ass4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 4/2/2018.
 */

public class ada extends BaseAdapter {
ArrayList<Name> list;
Context cc;

    public ada(Context cc) {
        this.cc = cc;
        list=new ArrayList<Name>();
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater=(LayoutInflater)cc.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row=layoutInflater.inflate(R.layout.rr,viewGroup,false);
        TextView emp=row.findViewById(R.id.tv);
        Name tmp=list.get(i);
        emp.setText(tmp.name);
        return row;
    }
}
class Name{
    String name;
    Name(String name){
        this.name=name;
    }
}
