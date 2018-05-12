package com.sanwix.mh.anothermvvm.viewModels;

import android.databinding.ObservableField;
import android.util.Log;

import com.sanwix.mh.anothermvvm.data.orms.vModels.PersonModel;

public class PersonListActivityItemVM extends ItemViewModel<PersonModel>
{
    public final ObservableField<Boolean> isSelected = new ObservableField<>(false);
    private PersonModel personModel;

    public PersonListActivityItemVM()
    {

    }

    @Override
    public void setItem(PersonModel item)
    {
        personModel = item;
    }

    public void onRowClicked()
    {
        Log.i("tag clicked", "clicked");
    }


}
