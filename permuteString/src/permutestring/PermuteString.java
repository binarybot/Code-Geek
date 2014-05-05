/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package permutestring;

import java.util.*;

/**
 *
 * @author Mohan
 */
public class PermuteString {
    
    public static void swap(char a[],int i, int j){
    
        char c;
        c=a[i];
        a[i]=a[j];
        a[j]=c;
    }
    public static void permute(char a[],int n,int k){
    
        if(k==0){
        
            for(int i=n;i<a.length;i++)
             System.out.print(a[i]);
            
            
            System.out.println();
            
        return;
        }
        
        for(int i=0;i<n;i++){
        
            swap(a,i,n-1);
            permute(a,n-1,k-1);
            swap(a,i,n-1);
        }
    }
    
    public static void permuteUtil(String sa,int k){
    
        int n = sa.length();
        char a[]= sa.toCharArray();
    
       
        permute(a,n,k);
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner  sc = new Scanner(System.in); 
      System.out.println("Enter the String");
      String sa = sc.nextLine();
     int k=2;
      permuteUtil(sa,k);
    }
    
}
