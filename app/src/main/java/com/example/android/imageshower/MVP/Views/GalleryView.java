package com.example.android.imageshower.MVP.Views;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.android.imageshower.Containers.MyAdapter;
import com.example.android.imageshower.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class GalleryView extends ActivityView {

    @BindView(R.id.my_recycler_view) RecyclerView mRecyclerView;

    public GalleryView(Activity activity) {
        super(activity);
        ButterKnife.bind(this,activity);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(mLayoutManager);
    }


    public void setAdapter(MyAdapter adapter) {
        mRecyclerView.setAdapter(adapter);
    }

    public Context getContext() {
        return getActivity();
    }
}
