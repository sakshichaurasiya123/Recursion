/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	    Scanner in=new Scanner(System.in);
	    int n=in.nextInt();
	    int k=print(n);
	    System.out.println(k);
	}
	static int print(int n){
	    if(n>1)
	        return n*print(n-1);
	  return 1;
	   
	}
	  
}
