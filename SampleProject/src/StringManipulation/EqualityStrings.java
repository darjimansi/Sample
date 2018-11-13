package StringManipulation;

public class EqualityStrings {
	
	public static void main (String[] args) {
		
		String s1= "mansi darji";  
		String s2= "Mansi Darji"; 
  
		 // Checking equality of Strings 
		
		 Boolean out = s1.equals(s2); 
	       
		 System.out.println("Checking Equality  " + out);
		 
		 out = "Mansi Darji".equals("Mansi Darji"); 
	     System.out.println("Checking Equality  " + out);
	        
	  
	        //out = "Geeks".equalsIgnoreCase("gEeks "); 
	        //System.out.println("Checking Equality" + out); 
	  
	        //int out1 = s1.compareTo(s2); 
	        //System.out.println("If s1 = s2" + out); 
	}


}
