import java.util.*;
import java.io.*;
import java.math.*;
import java.util.regex.*;


class WeirdNumbers{

	public static boolean isWeird(int n){
	
	if(n%2==0){
	   if(n>6 & n < 20){
		return true;
	   }else{
		return false;
	   }
	   
	}else {
		return true;
	    }//end of if...
	
	}//end of method isWeird...

	public static void main(String [] args){
	
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	if(isWeird(n)){
		System.out.println("Weird");
	}else {
		System.out.println("Not Weird");
	}
	

	}//end of main...


}
