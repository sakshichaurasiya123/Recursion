/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
    static ArrayList<String>a=new ArrayList<String>();
	public static void main (String[] args) {
	//	System.out.println("GfG!");
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int open=n;
	int close=n;
	solve(open,close,"");
	ArrayList<String>arr=new ArrayList<String>();
	arr=a;
	for(int i=0; i<arr.size(); i++)
	    System.out.println(arr.get(i));
	}
	static void solve(int open,int close,String out){
	    if(open ==0 && close==0){
	        a.add(out);
	        return;
	    }
	    if(open!=0){
	        solve(open-1, close,out+"(");
	    }
	    if(open<close)
	    solve(open,close-1,out+")");
	}
	
}
