package com.ualr.recyclerviewassignment;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.ualr.recyclerviewassignment.model.Inbox;

import java.util.List;

public class InboxViewModel extends ViewModel {
    //TODO::set up the ViewModel class to be used to exchange the inbox data between the activity and the fragment

    private final MutableLiveData<Inbox>inbox = new MutableLiveData<Inbox>();

    public void select(Inbox inbox){
        inbox.(inbox);
    }
    public LiveData<Inbox>getSelected(){
        return inbox;
    }

}