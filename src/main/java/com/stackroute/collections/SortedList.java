package com.stackroute.collections;
import java.util.*;

// To arrange the given values in decreasing order and display by using arraylist
public class SortedList {
    public ArrayList<String> sorted(String[] strings){
        Set<String> set=new HashSet<String>();
        for(String s:strings)
            set.add(s);
        TreeSet<String> treeSet=new TreeSet<String>();// Setting all values to tree set to arrange in order
        treeSet.addAll(set);
        ArrayList<String> result=new ArrayList<>(treeSet);// returning arraylist
        return result;
    }
}
