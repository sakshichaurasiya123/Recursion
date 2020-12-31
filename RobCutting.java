/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
   // static int max=0;
	public static void main (String[] args) {

        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        int r=func(n,a,b,c);
        System.out.println(r);
	}
	static int func(int n,int a,int b,int c){
	    
	    if(n==0){
	        return 0;
	    }
	   if(n<0)
	    return -1;
	  int max=Math.max(Math.max(func(n-a,a,b,c),func(n-b,a,b,c)),
	   func(n-c,a,b,c));
	   if(max==-1)
	    return -1;
	   
	   return max+1;
	}
}
