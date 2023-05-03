package javabasics;

public class StringOperations {
public static void main(String[] args) {
	String a="Hello i love java";
	System.out.println(a);
	
	System.out.println(a.toUpperCase()); //converting to uppercase
	
	System.out.println(a.toLowerCase()); //converting to lower case
	
	System.out.println(a.length());  // gives length
	
	//find out character at specific index
	System.out.println(a.charAt(10));  
	
	//concat
	String a1 = "Anita";
	String a2= "Shetkar";
	String a3="Sajjan";
	
	System.out.println(a1.concat(" " +a2));
	System.out.println(a1.concat(" "+a3));
	System.out.println(a1+ " " +a2);
	
	//Escape character \
	String b="Hello i \"love\" java";
	System.out.println(b.toUpperCase());
	
	String c = "Hello i love \\\\ backslash character";
	System.out.println(c);
	
	String d= "Hello i love @ character";
	System.out.println(d);
	
	//trim ---- it will remove starting and ending spaces
	String e = "    Hey Anita    ";
	System.out.println(e.trim());
	
	//substring
	System.out.println(a.substring(1));
	System.out.println(a.substring(3, 9)); // begin index  end index-1
	
	// equals, equalsIgnoreCase, contains
	String b1="anita";
	String b2="anIta";
	
	System.out.println(b1.equals(b2));
	
	System.out.println(b1.equalsIgnoreCase(b2));
	
	System.out.println(b1.contains("ta"));
}
}
