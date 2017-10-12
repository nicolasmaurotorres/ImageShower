package com.example.android.imageshower.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.android.imageshower.MVP.Models.MainModel;
import com.example.android.imageshower.MVP.Presenters.MainPresenter;
import com.example.android.imageshower.MVP.Views.MainView;
import com.example.android.imageshower.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    private MainPresenter presenter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        presenter = new MainPresenter(new MainModel(), new MainView(this));

    }




}
