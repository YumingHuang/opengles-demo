package com.example.opengl;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.opengl.activity.AirHockey1Activity;
import com.example.opengl.activity.AirHockey2Activity;
import com.example.opengl.activity.AirHockey3Activity;
import com.example.opengl.activity.AirHockey4Activity;
import com.example.opengl.activity.AirHockey5Activity;
import com.example.opengl.activity.AirHockey6Activity;
import com.example.opengl.activity.FirstOpenGLActivity;

import java.util.ArrayList;

public class MainActivity extends ListActivity {
    private ArrayList<String> mTaskList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mTaskList.add("FirstOpenGL");
        mTaskList.add("AirHockey1");
        mTaskList.add("AirHockey2");
        mTaskList.add("AirHockey3");
        mTaskList.add("AirHockey4");
        mTaskList.add("AirHockey5");
        mTaskList.add("AirHockey6");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, mTaskList);
        setListAdapter(adapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        switch (position) {
            case 0:
                startActivity(new Intent(this, FirstOpenGLActivity.class));
                break;
            case 1:
                startActivity(new Intent(this, AirHockey1Activity.class));
                break;
            case 2:
                startActivity(new Intent(this, AirHockey2Activity.class));
                break;
            case 3:
                startActivity(new Intent(this, AirHockey3Activity.class));
                break;
            case 4:
                startActivity(new Intent(this, AirHockey4Activity.class));
                break;
            case 5:
                startActivity(new Intent(this, AirHockey5Activity.class));
                break;
            case 6:
                startActivity(new Intent(this, AirHockey6Activity.class));
                break;
            default:
                break;
        }
    }
}
