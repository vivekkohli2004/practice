package leet.string;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Anagram {

	 public static boolean isAnagram(String s, String t) {
	        
	        if(s.length()!= t.length()) return false;
	        
	        Map <Character, Integer> map1= new HashMap <>();  
	        //Map <Character, Integer> map2= new HashMap <>();  
	        Character c1, c2;
	        for(int i=0;i<s.length();i++){
	            c1=s.charAt(i);
	            c2=t.charAt(i);
	            map1.put(c1, map1.getOrDefault(c1,0)+1);  
	            map1.put(c2, map1.getOrDefault(c2,0)-1);
	        }
	        
	        Iterator<Character> it=map1.keySet().iterator();
	        while(it.hasNext()){
	            c1=it.next();
	            if(map1.get(c1)!=0) return false;
	            
	        }
	        return true;
	    }
	
	//BELOW IS WHAT IS WROTE, but it failed in 1 use case that had a page long strings..not sure why
	/*
	 * public boolean isAnagram(String s, String t) {
	 * 
	 * if(s.length()!= t.length()) return false;
	 * 
	 * Map <Character, Integer> map1= new HashMap <>(); Map <Character, Integer>
	 * map2= new HashMap <>(); Character c1, c2; for(int i=0;i<s.length();i++){
	 * c1=s.charAt(i); c2=t.charAt(i); map1.put(c1, map1.getOrDefault(c1,0)+1);
	 * map2.put(c2, map2.getOrDefault(c2,0)+1); }
	 * 
	 * Iterator<Character> it=map1.keySet().iterator(); 
	 * while(it.hasNext()){
	 * c1=it.next(); if(map1.get(c1)!=map2.get(c1)) return false;
	 * 
	 * } return true; }
	 */
	 
	 public static void main(String[] args) {
	System.out.println(isAnagram("anagram","nagaram"));
	}
}
