/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

public class CodeKata_Ex2 {
	public static void main (String[] args) throws Exception {
	    int n;
	    Scanner sc = new Scanner(System.in);
	    try{
	        n = sc.nextInt();
		if(n<0)
	        System.out.printf("Invalid");
	        else if(n%2==0)
	        System.out.println("Even");
	        else
	        System.out.println("Odd");
	    }
	    catch(Exception e){
	       System.out.println("Invalid");
	    }
	}
}
