
 
package com.collectionassignment6;

import java.util.*;

/**
 *
 * @author ranjan
 */
public class QuestionSix {
   public static void main(String args[]){
       List <Integer> test= new ArrayList<>();
       for(int i=1;i<=49;i++){
         test.add(i);
         
       }
       Collections.shuffle(test);
       List<Integer> topsixinteger=new ArrayList(test.subList(0, 5));
       System.out.println(topsixinteger);
   } 
}
