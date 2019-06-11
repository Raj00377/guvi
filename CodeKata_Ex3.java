/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.lang.*;

public class CodeKata_Ex3 {
	public static void main (String[] args) throws Exception {
	    char c;
	    Scanner sc = new Scanner(System.in);
	    try{
	        c = sc.next().charAt(0);
	        c = Character.toLowerCase(c);
	        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
	        System.out.println("Vowel");
	        else if((c >= 97 && c <= 122)) 
            System.out.println("Consonant");
	        else
	        System.out.println("Invalid");
	    }
	    catch(Exception e){
	       System.out.println("Invalid");
	    }
	}
}
