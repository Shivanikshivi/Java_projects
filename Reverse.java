package basics;
import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "Shivani", numstr="";
        char ch;
       System.out.print("word: ");
       System.out.println("Shivani"); 
       
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); 
        numstr= ch+numstr; 
      }
      System.out.println("Reversed word: "+ numstr);
    }
}
	


