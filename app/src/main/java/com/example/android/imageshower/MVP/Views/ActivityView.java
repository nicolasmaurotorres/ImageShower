package com.example.android.imageshower.MVP.Views;

import android.app.Activity;
import android.widget.Toast;

import java.lang.ref.WeakReference;

public class ActivityView {

    private WeakReference<Activity> activityRef;

    public ActivityView(Activity activity) {
        activityRef = new WeakReference<>(activity);
    }

    public Activity getActivity(){
        return activityRef.get();
    }

    public void showToastMessage(String message) {
        Toast toast1 = Toast.makeText(getActivity().getApplicationContext(),message, Toast.LENGTH_SHORT);
        toast1.show();
    }

}
