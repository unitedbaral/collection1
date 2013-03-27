
package com.collectionassignment3;

/**
 *
 * @author ranjan
 */
import java.util.*;

public class QuestionThree {
    public static void main(String args[]){
         List<String> list;
        list = new ArrayList<>();
        for(String a : args)
            list.add(a);
        Collections.shuffle(list,new Random());
        System.out.println(list);
       


    
       
    }
}
    
    

