package com.example.android.imageshower.MVP.Presenters;

import com.example.android.imageshower.MVP.Models.MainModel;
import com.example.android.imageshower.MVP.Views.MainView;


public class MainPresenter {

    private MainModel model;
    private MainView view;

    public MainPresenter(MainModel mainModel, MainView mainView) {
        model = mainModel;
        view = mainView;
    }



}
