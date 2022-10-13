package com.example.fragmentdatapassing;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class TwoFragment extends Fragment {

 TextView textView;
 ImageView imageView;
    public TwoFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root=inflater.inflate(R.layout.fragment_two, container, false);
        textView=root.findViewById(R.id.textid);
        Bundle bundle=this.getArguments();
        String dt=bundle.getString("key");
        textView.setText(dt);
        return  root;
    }
}