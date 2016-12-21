package com.example.admin.fragment8;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    //pass data to second fragment
  // FragmentManager fragmentManager=getSupportFragmentManager();
  // Fragment2 fragment2=(Fragment2) fragmentManager.findFragmentByTag("frag2");
    //we have to pass data to f2
  //  fragment2.catchData(eno,ename,esal);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        

        //add frag1 to frag2 to cointainer2
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();

        Fragment1 fragment1=new Fragment1();
        Fragment2 fragment2=new Fragment2();

        fragmentTransaction.add(R.id.container1,fragment1);
        fragmentTransaction.add(R.id.container2,fragment2,"frag2");//tag is generally string
        //tag is used to re retrive  a frag at later point of time
        fragmentTransaction.commit();
    }
    public void passData(String eno,String ename,String esal){
    //pass data to second fragment
    FragmentManager fragmentManager=getSupportFragmentManager();
    Fragment2 fragment2=(Fragment2) fragmentManager.findFragmentByTag("frag2");
    //we have to pass data to f2
    fragment2.catchData(eno, ename, esal);

}
}
