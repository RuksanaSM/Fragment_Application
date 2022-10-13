package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class FragmentMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_main);

        ListView listv=findViewById(R.id.listviewid);

        List<String> list=new ArrayList<>();
        list.add("Cricket");
        list.add("FootBall");
        list.add("Hockey");
        list.add("BasketBall");
        ArrayAdapter ad=new ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1,list);
        listv.setAdapter(ad);
        listv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Second_Fragment secondFrag = new Second_Fragment();
                Bundle args = new Bundle();
                args.putString("Key","some value");

                secondFrag .setArguments(args);
                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();

                fragmentTransaction.commit();
                getFragmentManager()
                        .beginTransaction()
                        .replace(R.id.container_view,new ListFragment())
                        .addToBackStack(null)
                        .commit();
            }
        });
    }


}