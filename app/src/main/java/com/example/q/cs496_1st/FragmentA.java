package com.example.q.cs496_1st;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by q on 2016-06-28.
 */
public class FragmentA extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
// Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment1, container, false);
        ArrayList<String> arraylist = new ArrayList<String>();
        arraylist.add("1");
        arraylist.add("2");
        arraylist.add("3");
        arraylist.add("4");
        arraylist.add("5");
        arraylist.add("6");
        arraylist.add("7");
        arraylist.add("8");
        arraylist.add("9");
        arraylist.add("10");
        arraylist.add("11");
        arraylist.add("12");
        arraylist.add("13");
        arraylist.add("14");
        arraylist.add("15");
        arraylist.add("16");
        arraylist.add("17");


        ArrayAdapter<String> Adapter;
        Adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, arraylist);

        ListView list = (ListView) view.findViewById (R.id.listView);
        list.setAdapter(Adapter);

        return view;
    }



}