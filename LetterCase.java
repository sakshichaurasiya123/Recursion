/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
    static ArrayList<String>arr=new ArrayList<String>();
	public static void main (String[] args) {
        Scanner in=new Scanner(System.in);
        String t=in.next();
        solve(t,0,"");
        ArrayList<String>arr1=new ArrayList<String>();
        arr1=arr;
        for(int i=0; i<arr.size(); i++)
        System.out.println(arr1.get(i));
	}
	static void solve(String t,int index,String out){
	    if(t.length()==index)
	    {
	        arr.add(out);
	        return;
	    }
	    boolean b=Character.isDigit(t.charAt(index));
	    if(b)
	        solve(t,index+1,out+t.charAt(index));
	   else{
	       solve(t,index+1,out+Character.toLowerCase(t.charAt(index)));
	       solve(t,index+1,out+Character.toUpperCase(t.charAt(index)));
	   }
	}
}
