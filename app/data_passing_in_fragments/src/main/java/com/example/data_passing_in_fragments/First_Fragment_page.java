package com.example.data_passing_in_fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link First_Fragment_page#newInstance} factory method to
 * create an instance of this fragment.
 */
public class First_Fragment_page extends Fragment {
    EditText name,mail;
    Button sendbtn;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public First_Fragment_page() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment First_Fragment_page.
     */
    // TODO: Rename and change types and number of parameters
    public static First_Fragment_page newInstance(String param1, String param2) {
        First_Fragment_page fragment = new First_Fragment_page();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root=inflater.inflate(R.layout.fragment_first__page,container,false);
//        name=root.findViewById(R.id.edtxt1);
//        mail=root.findViewById(R.id.edtxt2);
//        sendbtn=root.findViewById(R.id.sendbtnid);

//        sendbtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
////                String fname=name.getText().toString();
////                String mail1=mail.getText().toString();
//
//
//                Bundle bundle=new Bundle();
//                bundle.putString("Name",fname);
//                bundle.putString("Mail",mail1);
//
//                FragmentManager fragmentManager=getActivity().getSupportFragmentManager();
//                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
//
//                Second_Fragment_Page second_fragment_page=new Second_Fragment_Page();
//                second_fragment_page.setArguments(bundle);
//                fragmentTransaction.replace(R.id.frame_container,second_fragment_page);
//                fragmentTransaction.commit();
//            }
//        });
        ListView list=root.findViewById(R.id.listviewid);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                final String category = ( view.findViewById(R.id.tvname)).getContext().toString();
                Pass_DataBetween_Fragments main=new Pass_DataBetween_Fragments();
                main.openSecondFrag();
            }
        });


       return root;
    }
}