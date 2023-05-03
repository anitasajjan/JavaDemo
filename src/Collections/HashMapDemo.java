package Collections;

import java.util.HashMap;

public class HashMapDemo {
//map---interface
//hash map---class
//duplications not allowed
	// sequence is not fixed
	public static void main(String[] args) {
		HashMap<String, String> obj = new HashMap<String, String>();
		obj.put("MH", "Mumbai");
		obj.put("KA", "NewBangalore");
		obj.put("AP", "Hyderabad");
		obj.put("TN", "Chennai");
		obj.put("KA", "Bangalore");
		System.out.println(obj);

		System.out.println(obj.containsKey("KA"));

		// get value of specific key
		System.out.println(obj.get("KA"));

		obj.remove("KA");
		System.out.println(obj);

		// print only keys
		for (String a : obj.keySet()) {
			System.out.println(a);
		}
		
		//print only values
		for(String b:obj.values())
		{
			System.out.println(b);
		}
		
		//print both key and value
		for(String x:obj.keySet())
		{
			System.out.println(x+" "+obj.get(x));
		}
	}
}
