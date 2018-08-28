package com.inapp.firstjava.test;
import java.util.HashMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;


public class HashmapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 
		    HashMap<String, String> hashmap = new HashMap<String, String>();
	
		    hashmap.put("A","Apple");
		    hashmap.put("B","Banana");
		    hashmap.put("C","Carrot");
		    hashmap.put("G","Grapes");
		    hashmap.put("M","Mango");
		 
		
		    Collection entrySet = hashmap.entrySet();
		 
		   
		    Iterator it = entrySet.iterator();
		 
		  
		    while(it.hasNext()){
		       Map.Entry me = (Map.Entry)it.next();
		       System.out.println("Key is: "+me.getKey() + 
		       " & " + 
		       " value is: "+me.getValue());
		   }
		 }
		}
	
