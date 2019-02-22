package com.stackroute.collections;
import java.util.*;

// To replace the particular elements at particular index using arraylist
public class Replacement {
    public ArrayList<String> replaceElements(ArrayList<String>list,String[] string,int[] index){

        //replacing the String with paricular index in list
        for(int i=0;i<string.length;i++) {
            list.set(index[i],string[i]);
        }
            return list;
    }
}
