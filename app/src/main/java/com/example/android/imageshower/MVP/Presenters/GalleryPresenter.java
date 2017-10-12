package com.example.android.imageshower.MVP.Presenters;

import com.example.android.imageshower.MVP.Models.GalleryModel;
import com.example.android.imageshower.MVP.Views.GalleryView;

public class GalleryPresenter {

    private GalleryModel model;
    private GalleryView view;

    public GalleryPresenter(GalleryModel galleryModel, GalleryView galleryView) {
        model = galleryModel;
        view = galleryView;
    }

    public void setData() {
        view.setAdapter(model.getAdapter());
    }
}
