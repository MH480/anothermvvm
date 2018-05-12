package com.sanwix.mh.anothermvvm.Adapters;

import android.support.annotation.NonNull;
import android.view.ViewGroup;

import com.sanwix.mh.anothermvvm.data.orms.vModels.PersonModel;
import com.sanwix.mh.anothermvvm.viewModels.PersonListActivityItemVM;

import java.util.List;

public class PeopleListAdapter extends BaseRecyclerAdapter<PersonModel, PersonListActivityItemVM>
{
    public PeopleListAdapter()
    {
        super();
    }

    @NonNull
    @Override
    public ItemViewHolder<PersonModel, PersonListActivityItemVM> onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        return null;
    }


    @Override
    public void setItems(List<PersonModel> _Items)
    {
        items.addAll(_Items);
        notifyDataSetChanged();
    }

}
