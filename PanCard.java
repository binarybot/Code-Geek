import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PanCard {
   
  
    // Template Credit goes to www.hackerrank.com/kogupta 
    private static boolean isValidPAN(String s) {
	
	String pattern = "^([A-Z]{5})(\\d{4})([A-Z]{1})$"; 
	
	Pattern r = Pattern.compile(pattern);
	Matcher m = r.matcher(s);       
	if(m.matches()){
		return true;
	}
		return false;
    }
  
    public static void main(String[] args) {
	String s = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int i = Integer.parseInt(br.readLine());
            for (int j = 0; j < i; j++) {
                s = br.readLine();
                System.out.println(isValidPAN(s) ? "YES" : "NO");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } 
    }
}

