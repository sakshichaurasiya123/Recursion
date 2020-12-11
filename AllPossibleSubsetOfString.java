/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
		String in="abc";
		solve(in,0,"");
	}
	static void solve(String in,int index,String out){
	    if(in.length()==index)
	    {
	        System.out.print(out+" ");
	        return ;
	    }
	    solve(in,index+1,out+in.charAt(index));
	    solve(in,index+1,out);
	}
}
