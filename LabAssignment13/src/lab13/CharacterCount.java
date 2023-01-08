package lab13;

import java.util.HashMap;

public class CharacterCount {
	public static void main(String[] args) 
	{
		//declare character array
         char[]arr2 = {'a','c','d','f','a'};
	    // Declare Hashmap 
	    HashMap<Character,Integer>charCount=new HashMap<>();
	    
	 // foreach loop
	    for (char c:arr2)
	    {
	      int count=charCount.getOrDefault(c,0);
	      charCount.put(c,count+1);
	    }
	    // Print the character count
	    for (char c:charCount.keySet()) 
	    {
	      System.out.println(c+" : "+charCount.get(c));
	    }
	}
}
