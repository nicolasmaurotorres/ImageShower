package com.example.android.imageshower.MVP.Views;

import android.app.Activity;
import android.content.Intent;

import com.example.android.imageshower.Activities.GalleryActivity;
import com.example.android.imageshower.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainView extends ActivityView {

    public MainView(Activity activity) {
        super(activity);
        ButterKnife.bind(this,activity);
    }

    @OnClick(R.id.openGalleryButton)
    public void onClick(){
        Intent i = new Intent(getActivity().getApplicationContext(),GalleryActivity.class);
        getActivity().startActivity(i);
    }

}
