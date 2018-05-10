package com.sanwix.mh.anothermvvm.data;

public class Event
{
    public String eventName;
    public Object data;

    public Event(String eventName)
    {
        this.eventName = eventName;
    }

    public Event(String eventName, Object _data)
    {
        this.eventName = eventName;
        this.data = _data;
    }

}
