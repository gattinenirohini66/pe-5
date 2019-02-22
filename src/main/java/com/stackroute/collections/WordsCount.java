package com.stackroute.collections;
import java.util.*;
import java.util.regex.*;

// To count the number of words in the given string using map
public class WordsCount {
    public Map<String,Integer> wordCount(String string){
        string = string.toLowerCase();
        Map<String,Integer> map = new HashMap<String, Integer>();
        String[] result = string.split("[\\W+]"); // regular expression was to not alphabets
            for(String s:result){
                if(!map.containsKey(s)) // if map doesnt contain it will set value to 1
                    map.put(s,1);
                else{
                    int count = map.get(s); // get the value into count
                    map.put(s,count+1); // incrementing if it contains repeated words
                }
            }
            return map;
    }
}
