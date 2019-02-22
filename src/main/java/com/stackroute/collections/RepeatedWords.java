package com.stackroute.collections;
import java.util.*;

// Should return true if words were repeated otherwise true
public class RepeatedWords {
    public Map<String,Boolean> wordRepeat(String[] strings){
        int count=1;
        Map<String,Boolean> map = new HashMap<String, Boolean>();
        for(String s:strings){
            if(!map.containsKey(s)) // If it not contains key it will return false
                map.put(s,false);
            else{
                count++; // count will got incremented when it has repeated
                if(count>1)
                    map.put(s,true);
                else
                    map.put(s,false);
            }
        }
        return map;
    }
}
