/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		//System.out.println("GfG!");
	    Scanner in=new Scanner(System.in);
	    int n=in.nextInt();
	    int k=in.nextInt();
	    int l=job(n,k);
	    System.out.println(l+1);
	}
	static int job(int n,int k){
	    if(n==1){
	        return 0;
	    }
	   return (job(n-1,k)+k)%n;
	}
}
