package com.example.vikas_aggarwal.testing;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment implements MainFragment.SendMessage {

    private static  SecondFragment secondFragment;
    public SecondFragment() {
        // Required empty public constructor
    }
    public static SecondFragment getInstance() {
        if(secondFragment == null){
            secondFragment = new SecondFragment();
        }
        return secondFragment;
    }

    TextView message;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_second, container, false);
        message = view.findViewById(R.id.message);
        return view;
    }


    public void setMessage(String msg) {
        message.setText(msg);
    }

    @Override
    public void send(String msg) {
        message.setText(msg);
    }
}
