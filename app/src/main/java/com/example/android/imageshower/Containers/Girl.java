package com.example.android.imageshower.Containers;

import android.net.Uri;

public class Girl {
    private String name;
    private Uri image;

    public Girl(String name, Uri image) {
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public Uri getImage() {
        return image;
    }
}
