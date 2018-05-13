package com.sanwix.mh.anothermvvm.Adapters;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.databinding.library.baseAdapters.BR;
import com.sanwix.mh.anothermvvm.R;
import com.sanwix.mh.anothermvvm.data.orms.vModels.PersonModel;
import com.sanwix.mh.anothermvvm.databinding.PersonListItemBinding;
import com.sanwix.mh.anothermvvm.viewModels.PersonRecyclerItemVM;

import java.util.List;

public class PeopleListAdapter extends BaseRecyclerAdapter<PersonModel, PersonRecyclerItemVM>
{
    public PeopleListAdapter()
    {
        super();
    }

    LayoutInflater inflater;

    @NonNull
    @Override
    public PersonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View v = null;
        if (inflater == null)
            inflater = LayoutInflater.from(parent.getContext());
        if (v == null)
            v = inflater.inflate(R.layout.person_list_item, parent, false);
        PersonRecyclerItemVM itemVM = new PersonRecyclerItemVM();
        PersonListItemBinding binding = DataBindingUtil.bind(v);
        binding.setVariable(BR.Item_VModel, itemVM);
        return new PersonViewHolder(v, null, itemVM);
    }


    @Override
    public void setItems(List<PersonModel> _Items)
    {
        items.addAll(_Items);
        notifyDataSetChanged();
    }


    class PersonViewHolder extends ItemViewHolder<PersonModel, PersonRecyclerItemVM>
    {
        public PersonViewHolder(View itemView, ViewDataBinding binding, PersonRecyclerItemVM _viewModel)
        {
            super(itemView, binding, _viewModel);
        }
    }

}
