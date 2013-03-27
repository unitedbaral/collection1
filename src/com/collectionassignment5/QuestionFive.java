/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.collectionassignment5;

/**
 *
 * @author ranjan
 */
import java.util.*;
public class QuestionFive {
    public static void main(String args[]){
        List<String> one=new LinkedList<>();
        one.add("one");
        one.add("two");
        one.add("three");
        one.add("four");
        one.add("five");
        System.out.println("List one:"+one);
        List<String> two=new LinkedList<>();
        two.add("six");
        two.add("seven");
        two.add("eight");
        two.add("nine");
        two.add("ten");
        System.out.println("Second list:"+two);
       // System.out.println(two);
        two.addAll(one);
        System.out.println("After merging:"+two);
        for(int i=1;i< two.size();i=i+2 ){
            two.remove(i);
            System.out.println(two);
        }
     // System.out.println("After removing every second word from two:"+two);
        
        
    }
}
