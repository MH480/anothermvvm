package com.sanwix.mh.anothermvvm.Adapters;

import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.sanwix.mh.anothermvvm.viewModels.ItemViewModel;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseRecyclerAdapter<ITEM_T, VIEW_MODEL_T extends ItemViewModel<ITEM_T>> extends
        RecyclerView.Adapter<BaseRecyclerAdapter.ItemViewHolder<ITEM_T, VIEW_MODEL_T>>
{
    protected final List<ITEM_T> items;

    public BaseRecyclerAdapter()
    {
        items = new ArrayList<>();
    }

    public abstract void setItems(List<ITEM_T> _Items);

    @Override
    public long getItemId(int position)
    {
        return position;
    }


    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder<ITEM_T, VIEW_MODEL_T> holder, int position)
    {
        holder.setItem(items.get(position));
    }


    @Override
    public int getItemCount()
    {
        return items.size();
    }

    public static class ItemViewHolder<T, VT extends ItemViewModel<T>> extends RecyclerView.ViewHolder
    {
        final VT viewModel;
        private final ViewDataBinding viewHolder;

        public ItemViewHolder(View itemView, ViewDataBinding binding, VT _viewModel)
        {
            super(itemView);
            viewModel = _viewModel;
            viewHolder = binding;
        }

        void setItem(T item)
        {
            viewModel.setItem(item);
            viewHolder.executePendingBindings();
        }
    }
}
