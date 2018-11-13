package StringManipulation;

public class EqualIgnoreString {
	
	public static void main (String[] args) {
		
		String s1= "mansi darji";  
		String s2= "Mansi Darji"; 
  
		 // Ignoring Inequality of Strings 
		
	        boolean out = s1.equalsIgnoreCase(s2); 
	        //System.out.println("Checking Equality " +s1.equalsIgnoreCase(s2)); 
	        System.out.println("Checking Equality " +out);
	        //int out1 = s1.compareTo(s2); 
	       // System.out.println("If s1 = s2" + out); 
	}



}
