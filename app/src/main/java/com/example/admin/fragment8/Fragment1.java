package com.example.admin.fragment8;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment1 extends Fragment {
EditText ed1,ed2,ed3;
    Button b;

    public Fragment1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_fragment1, container, false);
        ed1= (EditText) v.findViewById(R.id.et1);
        ed2= (EditText) v.findViewById(R.id.et2);
        ed3= (EditText) v.findViewById(R.id.et3);
        b= (Button) v.findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //call parent activity
                MainActivity m=(MainActivity) getActivity();
                m.passData(ed1.getText().toString(),ed2.getText().toString(),ed3.getText().toString());
            }
        });
        return v;
    }

}
