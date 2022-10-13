package com.example.fragment_bottomnavigation.ui.home;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.fragment_bottomnavigation.R;

public class EmpHomeFragment extends Fragment {

    SQLiteDatabase sqldb;


    EditText sno,name,desg,addrs;
    HelperClass helperClass;
    String namestr,desgstr,addrsstr;
    int value;
Button btn;
    public EmpHomeFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root= inflater.inflate(R.layout.fragment_emp_home, container, false);
        btn=root.findViewById(R.id.onclickbtn);
        sno=root.findViewById(R.id.empsnoid);
        name=root.findViewById(R.id.empnameid);
        desg=root.findViewById(R.id.empdesgid);
        addrs=root.findViewById(R.id.empaddrsid);

        helperClass=new HelperClass(getContext());
        sqldb=helperClass.getReadableDatabase();

       btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

              namestr =name.getText().toString();
               desgstr=desg.getText().toString();
               addrsstr=addrs.getText().toString();
               value= Integer.parseInt(sno.getText().toString());

               long set=helperClass.createMethod(sqldb,value,namestr,desgstr,addrsstr);

               if (set== -1)
               {

                   Toast.makeText(getContext(), "No record inserted", Toast.LENGTH_SHORT).show();
               }
               else
               {
                   Toast.makeText(getContext(), "New Record inserted Successfully", Toast.LENGTH_SHORT).show();

               }
           }
       });
        return root;
    }


}