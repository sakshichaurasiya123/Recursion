/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	//	System.out.println("GfG!");
	int n=25;
	System.out.println(func(n));
	}
	static int func(int n){
	    if(n<10)
	        return n;
	   return func(n/10)+(n%10);
	  // System.out.println(n);
	}
}
