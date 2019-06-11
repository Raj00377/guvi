/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.lang.*;

public class CodeKata_Ex6 {
	public static void main (String[] args) throws Exception {
	    int n;
	    Scanner sc = new Scanner(System.in);
	    try{
	        n = sc.nextInt();
	        if(n%400==0) 
            System.out.println("yes");
	        else if(n%100==0)
	        System.out.println("no");
	        else if(n%4==0)
	        System.out.println("yes");
	        else
	        System.out.println("no");
	    }
	    catch(Exception e){
	       System.out.println("Invalid");
	    }
	}
}
