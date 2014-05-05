/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package playgame;

import java.util.*;

/**
 *
 * @author Mohan
 */
public class PlayGame {
    
    public static int minimum(int i,int j,int k){
    int min;
        if(i<j){ min=i; }else{ min=j;}
       if(k<min){min =k;}
        
        return min;
    }
    public static int maximum(int val[],int i,int j){
    
        if(val[i]<val[j]){ return val[i];}else { return val[j];}
         
    }
    static int n;
    static int max1[] = new int [n];
public static int max=0;
    
    public static int solve(int val[],int i,int n){
        
        if(i>n){return 0;}
        if(i==n-3){return max1[i] =val[i]+val[i+1]+val[i+2];}
        if(i==n-1){return max1[i]=val[i];}
        
        if(i==n-2){return max1[i]=val[i]+val[i+1]+val[i+2];}
        
        
        
        
        
    
         max = val[i] + minimum(solve(val,i+1,n), solve(val,i+2,n),solve(val,i+3,n));
         max = val[i]+val[i+1]+Math.max(max,minimum(solve(val,i+2,n), solve(val,i+3,n),solve(val,i+4,n)));
         max = val[i]+val[i+1]+val[i+2]+Math.max(max,minimum(solve(val,i+3,n), solve(val,i+4,n),solve(val,i+5,n)));
        
         
        max1[i]=max;
        
         
        
   return max1[i];
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter the numbers and its size");
         n = Integer.parseInt(sc.nextLine());
        int val[] = new int[n];
        for(int i=0;i<n;i++){
        val[i] = Integer.parseInt(sc.nextLine());
        }
        
        int res = solve(val,0,n);
        
        System.out.println(res);
    }
    
    
}
