package com.sanwix.mh.anothermvvm.viewModels;

import android.databinding.ObservableField;

import com.sanwix.mh.anothermvvm.data.orms.vModels.PersonModel;
import com.sanwix.mh.anothermvvm.viewModels.baseVMs.ItemViewModel;

public class PersonRecyclerItemVM extends ItemViewModel<PersonModel>
{
    public final ObservableField<Boolean> isSelected = new ObservableField<>(false);
    public ObservableField<String> personName = new ObservableField<>();
    public ObservableField<String> personEmail = new ObservableField<>();
    public ObservableField<String> personPhone = new ObservableField<>();
    public ObservableField<Boolean> personIsActivated = new ObservableField<>(false);
    private PersonModel personModel;

    public PersonRecyclerItemVM()
    {

    }

    @Override
    public void setItem(PersonModel item)
    {
        personModel = item;
        personEmail.set(personModel.email);
        personPhone.set(personModel.phone);
        personName.set(personModel.name);
        personIsActivated.set(personModel.isActive);
    }

    public void onRowClicked()
    {
        isSelected.set(!isSelected.get());
    }


}
