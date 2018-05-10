package com.sanwix.mh.anothermvvm.utils;

import android.content.Context;
import android.databinding.BindingAdapter;
import android.widget.ImageView;

public final class BindingUtils
{
    private BindingUtils()
    {
    }

    public static void doSomethings()
    {
    }

    @BindingAdapter("imageUrl")
    public static void setImageUrl(ImageView imageView, String url)
    {
        Context context = imageView.getContext();
        //piccaso.with(context).load(url).into(imageView);
    }
}
