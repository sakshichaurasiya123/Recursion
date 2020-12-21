/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
		//System.out.println("GfG!");
	    Scanner in=new Scanner(System.in);
	    String s=in.next();
	    solve(s,0,"");
	    
	}
	static void solve(String s,int index,String out){
	    if(s.length()==index){
	        System.out.println(out);
	        return;
	    }
	    solve(s,index+1,out+s.charAt(index));
	    
	    solve(s,index+1,out+Character.toUpperCase(s.charAt(index)));
	}
}
