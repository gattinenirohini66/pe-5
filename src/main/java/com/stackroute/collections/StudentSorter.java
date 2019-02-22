package com.stackroute.collections;

/*
4. Create a Student class that represents the following information of a student: id, name, and age
all the member variables should be private .
a. Implement `getter and setter` .
b. Create a `StudentSorter` class that implements `Comparator interface` .
c. Write a class `Maintest` create Student class object(minimum 5)
d. Add these student object into a List of type Student .
e. Sort the list based on their age in decreasing order, for student having
same age, sort based on their name.
f. For students having same name and age, sort them according to their ID.
 */
import java.util.*;

public class StudentSorter implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        if(student1.getAge()==student2.getAge()){
            if(student1.getName()==student2.getName()){
                return student1.getId()-student2.getId();
            }
            else
            {
                return (student1.getName().compareTo(student2.getName()));
            }
        }
        else{
            return student1.getAge()-student2.getAge();
        }
    }
}
