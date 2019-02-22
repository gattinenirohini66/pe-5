package com.stackroute.collections;

import java.util.*;
public class MainTest {
    public static void main(String args[]) {
        // Creating 5 students data
        Student s1 = new Student(1, "b", 0);
        Student s2 = new Student(2, "a", 8);
        Student s3 = new Student(4, "c", 9);
        Student s4 = new Student(5, "d", 10);
        Student s5 = new Student(6, "e", 3);
        ArrayList<Student> list = new ArrayList<>(Arrays.asList(s1, s2, s3, s4, s5));
        StudentSorter sorter = new StudentSorter();

        Collections.sort(list, sorter);

        System.out.println(list);
    }
}
