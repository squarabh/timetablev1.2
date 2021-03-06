package com.example.saurabh.experiment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import static com.example.saurabh.experiment.R.string.*;

/**
 * A simple {@link Fragment} subclass.
 */
public class TuesdayFragment extends Fragment {


    public TuesdayFragment() {
        // Required empty public constructor
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.activity_all, container, false);

        ArrayList<Title> titles = new ArrayList<Title>();

        titles.add(new Title(mp,mp1,b1,am,se,se1,b2,ag,cgm,cgm1,b3,ns,cd,cd1,b4,sb,t8,t10,2));
        titles.add(new Title(ed,ed1,b12,np,sl,sl1,b34,rn,t10,t12,1));
        titles.add(new Title(cd,cd1,b12,sb,se,se1,b34,ag,t1230,t130,1));
        titles.add(new Title(cd,cd1,all,sb,t130,t230));
        titles.add(new Title(cgm,cgm1,all,ns,t230,t330));


        TitleAdapter adapter = new TitleAdapter(getActivity(), titles);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
