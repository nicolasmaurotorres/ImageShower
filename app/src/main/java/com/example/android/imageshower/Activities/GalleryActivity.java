package com.example.android.imageshower.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.android.imageshower.MVP.Models.GalleryModel;
import com.example.android.imageshower.MVP.Presenters.GalleryPresenter;
import com.example.android.imageshower.MVP.Views.GalleryView;
import com.example.android.imageshower.R;

import butterknife.ButterKnife;

public class GalleryActivity extends AppCompatActivity {

    private GalleryPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        ButterKnife.bind(this);
        presenter = new GalleryPresenter(new GalleryModel(this), new GalleryView(this));
        presenter.setData();
    }
}
