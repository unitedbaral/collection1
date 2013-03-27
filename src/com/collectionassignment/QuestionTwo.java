/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.collectionassignment;

import java.util.*;

/**
 *
 * @author ranjan
 */
public class QuestionTwo {
    public static void main(String args[]){
      Set <String> uniquevalue=new HashSet<>(); 
      Set <String> duplicatevalue = new HashSet<>();
      for(String read:args)
          if(!uniquevalue.add(read))
              duplicatevalue.add(read);//only those values which are duplicated gets added
      uniquevalue.removeAll(duplicatevalue);//to remove all duplicated value from the set uniquevalue
      System.out.println("Words that occur only once:"+uniquevalue);
      System.out.println("Words which are repeated:"+duplicatevalue);
      
      
    }
    
}
