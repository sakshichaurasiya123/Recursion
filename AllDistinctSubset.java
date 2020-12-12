/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
    static ArrayList<String>m=new ArrayList<String>();
	public static void main (String[] args) {
	    Scanner in=new Scanner(System.in);
	    String s=in.next();
	    solve(s,0,"");
	    ArrayList<String>mp=new ArrayList<String>();
	    mp.addAll(m);
	    System.out.println(mp);
	    
	}
	
	static void solve(String s,int index,String out){
	    //m=new HashMap<String>();
	    if(s.length()==index){
	       if(!m.contains(out))
	        m.add(out);
	     // System.out.print(out+" ");
	        return ;
	    }
	    solve(s,index+1,out+s.charAt(index));
	    solve(s,index+1,out);
	}
}
