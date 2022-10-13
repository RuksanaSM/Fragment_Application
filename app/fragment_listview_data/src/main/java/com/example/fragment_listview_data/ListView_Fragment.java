package com.example.fragment_listview_data;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ListView_Fragment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_fragment);




        ListView listv=findViewById(R.id.listvw);

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
                if(i==0)

                {
//                    final String category = ((ListView) view.findViewById(R.id.listvw)).getTextFilter().toString();
//                    Cricket_Fragment ldf = new Cricket_Fragment ();
//                    Bundle args = new Bundle();
//                    args.putString("category", category);
//                    ldf.setArguments(args);
//                    FragmentManager fragmentManager = getSupportFragmentManager();
//                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//                    fragmentTransaction.replace(R.id.Frame_Container, ldf);
//                    fragmentTransaction.addToBackStack(null);
//                    fragmentTransaction.commit();

                    FragmentManager fragmentManager=getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.Frame_Container,new Cricket_Fragment());
                    fragmentTransaction.commit();


                }else if(i==1)
                {
                  //  startActivity(new Intent(ListViewActivity_Task1.this,CSharp_Activity.class));
                }
                else if(i==2){
                    //startActivity(new Intent(ListViewActivity_Task1.this,Phython_Activity.class));
                    FragmentManager fragmentManager=getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.Frame_Container,new Hockey_Fragment());
                    fragmentTransaction.commit();

                }
                else
                if(i==3)
                {
                   // startActivity(new Intent(ListViewActivity_Task1.this,Testing_Activity.class  ));
                }
            }
        });
    }
}