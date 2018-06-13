package com.chrisz;

import java.util.List;

public interface ISavable {
    List<String> write();
    void read(List<String> savedValues);
}

// The interface will just specify two methods, one to return an ArrayList of values to be saved
// and the other to populate the object's fields from an ArrayList (parameter).