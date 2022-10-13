package com.example.data_passing_in_fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class Pass_DataBetween_Fragments extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pass_data_between_fragments);

        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_container,new First_Fragment_page());
        fragmentTransaction.commit();


    }
//
    public void openSecondFrag() {
        First_Fragment_page ldf = new First_Fragment_page ();
        Bundle args = new Bundle();
        args.putString("category",);
        ldf.setArguments(args);
    }
}