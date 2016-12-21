package com.example.admin.fragment8;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import static com.example.admin.fragment8.R.id.textView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment2 extends Fragment {

ArrayList<Employee>al;
    MyAdapter myAdapter;


ListView lv;
    public  void catchData(String eno,String ename,String esal){
        //pass data to arraylist
        Employee employee=new Employee(eno,ename,esal);
        al.add(employee);
        //tell to adapter
        myAdapter.notifyDataSetChanged();
    }
    public class MyAdapter extends BaseAdapter{


        @Override
        public int getCount() {
            return al.size();
        }


        @Override
        public Object getItem(int position) {
            return al.get(position);
        }


        @Override
        public long getItemId(int position) {
            return position;
        }


        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            Employee employee=al.get(position);
            View v=getActivity().getLayoutInflater().inflate(R.layout.row,null);
            TextView  tv1= (TextView) v.findViewById(R.id.textView);
            TextView  tv2= (TextView) v.findViewById(R.id.textView2);
            TextView  tv3= (TextView) v.findViewById(R.id.textView3);
            CheckBox checkBox=(CheckBox) v.findViewById(R.id.checkBox);
            tv1.setText(employee.getEno());
            tv2.setText(employee.getEname());
            tv3.setText(employee.getEsal());

            return v;
        }
    }




    public Fragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_fragment2, container, false);
        lv= (ListView) v.findViewById(R.id.listview);
        al=new ArrayList<Employee>();
        myAdapter=new MyAdapter();
        lv.setAdapter(myAdapter);

        return v;
    }

}
