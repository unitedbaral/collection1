/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.collectionassignment4;


/**
 *
 * @author ranjan
 */
//import java.util.*;
//public class QuestionFour {
//    public static void main(String args[]){
//      Set<String> uniqueholder =new HashSet<>();
//      for (String receiver: args)
//          uniqueholder.add(receiver);
//     // System.out.println(uniqueholder);
//      List<String> forshuffling= new ArrayList<>();
//      forshuffling.addAll(uniqueholder);
//      System.out.println(forshuffling);
//      Collections.shuffle(forshuffling,new Random());
//      
     // Collections.shuffle((List<?>) uniqueholder);
      
      
import java.util.*;
public class QuestionFour{
    public static void main(String args[]){
        List <String> forshuffle= Arrays.asList(args);
        Collections.shuffle(forshuffle);
        System.out.println(forshuffle);
    }
            
}