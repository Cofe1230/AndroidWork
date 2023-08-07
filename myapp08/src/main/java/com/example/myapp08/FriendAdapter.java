package com.example.myapp08;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class FriendAdapter extends BaseAdapter {
    Context context;
    ArrayList<Friend> friendList = new ArrayList<>();
    public FriendAdapter(Context context){
        this.context = context;
    }
    @Override
    public int getCount() {
        return friendList==null?0:friendList.size();
    }

    @Override
    public Object getItem(int i) {
        return friendList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View friendView = LayoutInflater.from(context).inflate(R.layout.friend_list,null);

        return null;
    }
}
