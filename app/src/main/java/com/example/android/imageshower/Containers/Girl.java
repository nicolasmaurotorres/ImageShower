package com.example.android.imageshower.Containers;

public class Girl {
    private String name;
    private int imageId;

    public Girl(String name, int imageId) {
        this.name = name;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public int getImage() {
        return imageId;
    }
}
