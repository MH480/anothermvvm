package com.sanwix.mh.anothermvvm.utils;

import android.databinding.BindingAdapter;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

import com.sanwix.mh.anothermvvm.viewModels.PersonRecyclerVM;

public final class BindingUtils
{
    private BindingUtils()
    {
    }


    @BindingAdapter("adapter")
    public static void setRecyclerViewAdapter(RecyclerView rcView, PersonRecyclerVM viewModel)
    {
        viewModel.setupRecyclerView(rcView, new PersonRecyclerVM
                .LayoutManagerAttributeBuilder(PersonRecyclerVM.Layout_Manager_Type.Linear)
                .setReverseLayout(false)
                .setVertically(true));
    }

    @BindingAdapter("imageUrl")
    public static void setImageUrl(ImageView imageView, String url)
    {

    }
}
