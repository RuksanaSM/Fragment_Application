package com.example.fragmentdatapassing;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.Locale;

public class OneFragment extends Fragment {

    ListView listView;
    String[] names = {"Android", "IOS", "Linux", "Windows", "Java", "Dot Net", "Angular", "Computer Network", "Manual Testing", "Data Structure"};
 ArrayAdapter<String> arrayAdapter;
    public OneFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root=inflater.inflate(R.layout.fragment_one, container, false);
        root.setBackgroundColor(Color.WHITE);
        listView=root.findViewById(R.id.listvw1);
        arrayAdapter=new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1,names);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Bundle bundle=new Bundle();
                String value=arrayAdapter.getItem(i).toString();
                bundle.putString("key",value);
                TwoFragment fragment=new TwoFragment();
                fragment.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.container_frame,fragment).commit();
            }
        });
        return root;
    }
}