/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kpermute;

import java.util.*;

/**
 *
 * @author Mohan
 */
public class Kpermute {
    
    public static void permutekUtil(String s2[],String prefix,int n,int k){
    
    
        if(k==0){System.out.println(prefix);
        return;
        }
        Vector<Character> c = new Vector<>();
        for(int i=0;i<n;i++){
        
          String   nprefix = prefix + s2[i];
             
             permutekUtil(s2,nprefix,n,k-1);
        }
        
        
    }

    public static void permutek(String s2[], int k){
    
        int n = s2.length;
        
        permutekUtil(s2,"",n,k);
    
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String sa = sc.nextLine();
        
        String s1[] = sa.split("\\s");
        int k =sc.nextInt();
        permutek(s1,k);
        
    }
}
