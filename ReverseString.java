import java.util.*; 
import java.io.*;

class ReverseString
  public static String FirstReverse(String str) { 
      System.out.println(str.length());
      
      String Rev ="";
      for ( int i =str.length() - 1; i >= 0 ; i-- )
      {
    	  Rev = Rev + str.charAt(i);
      }
    return Rev;
    
  } 
  
  public static void ReverseString (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(FirstReverse(s.nextLine())); 
  }   
  
}
