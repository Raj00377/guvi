/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

public class CodeKata_Ex1 {
	public static void main (String[] args) throws Exception {
	    int n;
	    Scanner sc = new Scanner(System.in);
	    try{
	        n = sc.nextInt();
	        if(n==0)
	        System.out.println("Zero");
	        else if(n>0)
	        System.out.println("Positive");
	        if(n<0)
	        System.out.println("Negative");
	    }
	    catch(Exception e){
	       System.out.println("Invalid");
	    }
	}
}
