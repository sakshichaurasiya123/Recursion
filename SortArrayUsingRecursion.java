/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	    Scanner in=new Scanner(System.in);
	    int n=in.nextInt();
	    ArrayList<Integer>arr=new ArrayList<Integer>();
	    for(int i=0; i<n; i++)
	        arr.add(in.nextInt());
	   sort(arr);
	   System.out.println(arr); 
	}
	static void  sort(ArrayList<Integer>arr){
	    if(arr.size()==1)
	        return ;
	   int temp=arr.get(arr.size()-1);
	   arr.remove(arr.size()-1);
	   sort(arr);
	   insert(arr,temp);
    //return arr;
	}
	static void insert(ArrayList<Integer> arr,int temp){
	    if(arr.size()==0 || arr.get(arr.size()-1)<=temp){
	        arr.add(temp);
	        return;
	    }
	   int value=arr.get(arr.size()-1);
	   arr.remove(arr.size()-1);
	   insert(arr,temp);
	    arr.add(value);
	}
	  
}
