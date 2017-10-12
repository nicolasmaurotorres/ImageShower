package com.example.android.imageshower.MVP.Models;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.annotation.AnyRes;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;

import com.example.android.imageshower.Containers.Girl;
import com.example.android.imageshower.Containers.MyAdapter;
import com.example.android.imageshower.R;


public class GalleryModel {

    private MyAdapter adapter;

    public GalleryModel(Context mContext){

        Girl girl1 = new Girl("Susana Gimenez"  ,R.mipmap.red_hair_1);
        Girl girl2 = new Girl("Wanda Nara"      ,R.mipmap.red_hair_2);
        Girl girl3 = new Girl("Zaira Nara"      ,R.mipmap.red_hair_3);
        Girl girl4 = new Girl("Mirtha Legrand"  ,R.mipmap.red_hair_4);
        Girl girl5 = new Girl("Sofia Gala"      ,R.mipmap.red_hair_5);
        Girl girl6 = new Girl("Moria Casan"     ,R.mipmap.red_hair_6);
        Girl girl7 = new Girl("Ivana Nadal"     ,R.mipmap.red_hair_7);
        Girl girl8 = new Girl("Naiara Awada"    ,R.mipmap.red_hair_8);

        adapter = new MyAdapter(new Girl[]{girl1,girl2,girl3,girl4,girl5,girl6,girl7,girl8},mContext);
    }

    public MyAdapter getAdapter(){
        return adapter;
    }
}
