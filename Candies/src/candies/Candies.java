/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package candies;

import java.util.*;

/**
 *
 * @author Mohan
 */
public class Candies {

    public static int solve(int arr[],int val[],int n){
    
        
        for(int i=0;i<n;i++){
        
            val[i] = 1;
        if(i-1>=0){
            if(arr[i-1]<arr[i]){
            val[i]= val[i-1]+1;
            }else{
            
                int j=i;
                while(j>0 && arr[i-1]>arr[i]){
                
                    val[i-1]= Math.max(val[i-1], val[i]+1);
                    j-=1;
                }
            
            }
        }
        }
        int res=0;
        for(int i=0;i<n;i++){
            
            //System.out.print(val[i]+" ");
         res = res +val[i];
        }
    
        return res;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        
        int arr[] = new int [n];
        int val[] = new int [n];
        
        for(int i=0;i<n;i++){
        
            arr[i]=Integer.parseInt(sc.nextLine());
        }
        
        int res  = solve(arr,val,n);
        
        System.out.println(res);
        
    }
    
}
