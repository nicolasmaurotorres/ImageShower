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

        Uri picture1 = getUriToDrawable(mContext, R.mipmap.red_hair_1);
        Uri picture2 = getUriToDrawable(mContext, R.mipmap.red_hair_2);
        Uri picture3 = getUriToDrawable(mContext, R.mipmap.red_hair_3);
        Uri picture4 = getUriToDrawable(mContext, R.mipmap.red_hair_4);
        Uri picture5 = getUriToDrawable(mContext, R.mipmap.red_hair_5);
        Uri picture6 = getUriToDrawable(mContext, R.mipmap.red_hair_6);
        Uri picture7 = getUriToDrawable(mContext, R.mipmap.red_hair_7);
        Uri picture8 = getUriToDrawable(mContext, R.mipmap.red_hair_8);

        Girl girl1 = new Girl("Susana Gimenez",picture1);
        Girl girl2 = new Girl("Wanda Nara",picture2);
        Girl girl3 = new Girl("Zaira Nara",picture3);
        Girl girl4 = new Girl("Mirtha Legrand",picture4);
        Girl girl5 = new Girl("Sofia Gala",picture5);
        Girl girl6 = new Girl("Moria Casan",picture6);
        Girl girl7 = new Girl("Ivana Nadal",picture7);
        Girl girl8 = new Girl("Naiara Awada",picture8);

        adapter = new MyAdapter(new Girl[]{girl1,girl2,girl3,girl4,girl5,girl6,girl7,girl8},mContext);
    }

    public MyAdapter getAdapter(){
        return adapter;
    }

    private static Uri getUriToDrawable(@NonNull Context context, @AnyRes int drawableId) {
        return Uri.parse(ContentResolver.SCHEME_ANDROID_RESOURCE +
                "://" + context.getResources().getResourcePackageName(drawableId)
                + '/' + context.getResources().getResourceTypeName(drawableId)
                + '/' + context.getResources().getResourceEntryName(drawableId) );
    }


}
