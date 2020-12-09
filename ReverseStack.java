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
		sort(a);
		for(int i:a)
		    System.out.print(i+" ");
	}
	static void sort(Stack<Integer>a){
	    if(a.size()==1){
	        //System.out.println(a);
	        return;}
	   int temp=a.peek();
	   a.pop();
	   sort (a);
	   insert(a,temp);
	}
	static void insert(Stack<Integer>a,int temp){
	    if(a.isEmpty()){
	        a.add(temp);
	        return;
	        
	    }
	   int v=a.peek();
	   a.pop();
	   insert(a,temp);
	   a.push(v);
	}
}
