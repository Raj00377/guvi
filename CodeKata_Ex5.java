/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.lang.*;

public class CodeKata_Ex5 {
	public static void main (String[] args) throws Exception {
	    int n1,n2,n3;
	    Scanner sc = new Scanner(System.in);
	    try{
	        n1 = sc.nextInt();
	        n2 = sc.nextInt();
	        n3 = sc.nextInt();
	        if(n1>=n2 && n1>=n3) 
            System.out.println(n1);
	        else if(n2>=n1 && n2>=n3)
	        System.out.println(n2);
	        else
	        System.out.println(n3);
	    }
	    catch(Exception e){
	       System.out.println("Invalid");
	    }
	}
}
