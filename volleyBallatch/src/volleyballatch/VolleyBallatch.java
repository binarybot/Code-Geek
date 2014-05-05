/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package volleyballatch;

import java.util.*;

/**
 *
 * @author Mohan
 */
public class VolleyBallatch {

     static int solve(int n,int a,int b){
         
         
         //int n=Math.max(a, b);
         int [][]pas = new int [n][n];
         for(int i=0;i<n;i++){
             for(int j=0;j<=i;j++){
             
                 if(j==0|| j==i){
                 
                     pas[i][j]=1;
                 }else{
                 
                     pas[i][j]=pas[i-1][j-1]+pas[i-1][j];
                 
                 }
             
             }
         }
         
         if(a<b){
         
         int result =  (int) ((pas[n-1][a])%(Math.pow(10,9)+7));//%(Math.pow(10, 9)+7));
         return result;
         }else{
         
             int result =  (int) ((pas[n-1][b])%(Math.pow(10,9)+7));
             return result;
         }
         //return 0;
    
        
    
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int a,b;
       Scanner sc = new Scanner(System.in);
       
      a = Integer.parseInt(sc.nextLine());
      b = Integer.parseInt(sc.nextLine());
              int n;
      if(a==24 && b== 24){
      n = a+b+2;
      int res =solve(n,a,b);
      System.out.println(res);
      }
      else if(a<25 && b<25){
      
          System.out.println("0");
          
      }else{
      
          n = a+b;
      int res =solve(n,a,b);
      System.out.println(res);
      }
    }
    
}
