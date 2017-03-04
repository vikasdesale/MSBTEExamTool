package com.kbh.msbteexamtool.fragments;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.kbh.msbteexamtool.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dell on 3/4/2017.
 */

public class MSBTEFragment extends Fragment {
    int color;

    public MSBTEFragment() {
    }

    @SuppressLint("ValidFragment")
    public MSBTEFragment(int color) {
        this.color = color;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.msbte_fragment, container, false);

        final FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.msbte_frag_bg);
        frameLayout.setBackgroundColor(color);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.msbte_frag_scrollableview);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity().getBaseContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);


        return view;
    }
}