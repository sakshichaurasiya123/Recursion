/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		//System.out.println("GfG!");
		Scanner in=new Scanner(System.in);
		Stack<Integer> a=new Stack<Integer>();
		int n=in.nextInt();
		for(int i=0; i<n; i++)
		    a.push(in.nextInt());
		System.out.print(sort(a));
	
	}
	static Stack<Integer> sort(Stack<Integer>a){
	    if(a.size()==1){
	        //System.out.println(a);
	        return a;}
	  int k=(a.size()/2)+1;
	  solve(a,k);
	  return a;
	}
	static void solve(Stack<Integer>a,int temp){
	    if(temp==1){
	        a.pop();
	        return;}
	   int v=a.peek();
	   a.pop();
	   solve(a,temp-1);
	   a.push(v);
	}
}
