package com.stackroute.collections;
import java.util.*;

// To Swap the values of one map to anthor map
public class RepeatedKeys {
    public Map repeatKeys(Map array){
        Set set = array.keySet();
        Object[] objects = new Object[2];
        int i=0;
        Iterator itr = set.iterator();
        while (itr.hasNext()){
            objects[i]=itr.next();
            i++;
        }
        // assigning the first value to second value
        Object newValue = array.get(objects[0]);
        array.put(objects[0],"");
        array.put(objects[1],newValue);
        return array;
    }
}
