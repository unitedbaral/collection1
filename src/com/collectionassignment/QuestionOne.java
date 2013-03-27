
package com.collectionassignment;

import java.util.*;


/**
 *
 * @author ranjan
 */


    
  
//       Set<String,Integer>  m;
//        m = new HashSet<>();
//        for (String a : args) {
//            Integer freq = m.get(a);
//            m.put(a, (freq == null) ? 1 : freq + 1);
//            }
//               
//       System.out.println(m.size());
//       
//        System.out.println(m);
//       
//    }
////    ArrayList<Integer> repeatedwords;
////        repeatedwords = new ArrayList<>();
////        
    
  

//public class CollectionAssignment {
//    public static void main(String[] args) {
//        Set<String> s = new HashSet<>();
//        for (String a : args)
//            if (!s.add(a))
//                System.out.println("Duplicate detected: " + a);
//
//        System.out.println(s.size() + " distinct words: " + s);
//    }
//}  

import java.util.*;

/**
 *
 * @author ranjan
 */
public class QuestionOne {
    public static void main(String[] args) {
       
        Set<String> uniques = new HashSet<>();
      Set<String> duplicate    = new HashSet<>();
 for (String b : args)
     if (!uniques.add(b))
          duplicate.add(b);
    System.out.println("Unique words:    " + uniques);
System.out.println("The number of unique words are:"+uniques.size());
	 System.out.println("Duplicate words: " + duplicate);
        
    }
}