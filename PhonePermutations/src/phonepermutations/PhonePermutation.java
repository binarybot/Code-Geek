/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package phonepermutations;

/**
 *
 * @author Mohan
 */
public class PhonePermutation{
    public static void permutations(char[][] symbols, int n,  String s) {
        if (n == symbols.length) {
            System.out.println(s);
            return;
        }
        for (int i = 0; i < symbols[n].length; i ++) {
            System.out.println(symbols[n].length);
            permutations(symbols, n+1,s+symbols[n][i]);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        char[][] letters = 
            {{'0'},{'1'},{'A','B','C'},{'D','E','F'},{'G','H','I'},{'J','K','L'}, 
            {'M','N','O'},{'P','Q','R','S'},{'T','U','V'},{'W','X','Y','Z'}};
        String n = "23";
        char[][] sel = new char[n.length()][];
        for (int i = 0; i < n.length(); i++) {
            int digit = Integer.parseInt("" +n.charAt(i));
            sel[i] = letters[digit];
        }
        for(int i=0;i<sel.length;i++){System.out.print(sel[i]);System.out.println();}
        permutations(sel, 0, "");
    }
    
    
}
