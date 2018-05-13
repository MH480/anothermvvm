package com.sanwix.mh.anothermvvm.viewModels.baseVMs;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;

import com.sanwix.mh.anothermvvm.Adapters.BaseRecyclerAdapter;

public abstract class BaseRv_ViewModel extends AndroidViewModel
{
    protected RecyclerView.LayoutManager layoutManager;

    public BaseRv_ViewModel(@NonNull Application application)
    {
        super(application);
    }

    protected abstract BaseRecyclerAdapter getAdapter();

    protected abstract RecyclerView.LayoutManager getLayoutManager(LayoutManagerAttributeBuilder data);

    public void setupRecyclerView(RecyclerView recycler, LayoutManagerAttributeBuilder data)
    {
        recycler.setLayoutManager(getLayoutManager(data));
        recycler.setAdapter(getAdapter());
    }

    public enum Layout_Manager_Type
    {
        Linear,
        Grid,
        Staggered,

    }


    public static class LayoutManagerAttributeBuilder
    {
        int ColumnCount;
        private Layout_Manager_Type type;
        private boolean reverseLayout;
        private boolean isVertically;

        public LayoutManagerAttributeBuilder(Layout_Manager_Type type)
        {
            this.type = type;
        }

        public int getColumnCount()
        {
            return ColumnCount;
        }

        public LayoutManagerAttributeBuilder setColumnCount(int columnCount)
        {
            ColumnCount = columnCount;
            return this;
        }

        public Layout_Manager_Type getType()
        {
            return type;
        }

        public LayoutManagerAttributeBuilder setType(Layout_Manager_Type type)
        {
            this.type = type;
            return this;
        }

        public boolean isReverseLayout()
        {
            return reverseLayout;
        }

        public LayoutManagerAttributeBuilder setReverseLayout(boolean reverseLayout)
        {
            this.reverseLayout = reverseLayout;
            return this;
        }

        public boolean isVertically()
        {
            return isVertically;
        }

        public LayoutManagerAttributeBuilder setVertically(boolean vertically)
        {
            isVertically = vertically;
            return this;
        }
    }

}
