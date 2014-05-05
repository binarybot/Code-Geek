/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package zigzagtopcoder;

import java.util.*;

/**
 *
 * @author Mohan
 */
public class ZigZagTopCoder {
    
    public static int solve(int arr[]){
    
        int inter[] = new int[arr.length];
        int lis[] = new int[inter.length-1];
    
        for(int i=1;i<arr.length;i++){
            inter[i-1] = arr[i]-arr[i-1]; 
            lis[i-1]=1;
        System.out.println(inter[i-1]);
        }
        for(int i=1;i<inter.length;i++){
            for(int j=0;j<=i;j++){
            
                if((inter[i]*inter[j])<0 && lis[i]<lis[j]+1 ){
                
                    lis[i]= lis[j]+1;
                }
            }
        }
        
        int max =0;System.out.println("\n");
        
       for(int i=0;i<lis.length;i++){
           System.out.print(lis[i]+",");
       if(max<lis[i]){
       max = lis[i];
       }
       } 
        return max;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Scanner sc= new Scanner(System.in);
        //int n = Integer.parseInt(sc.nextLine());
        //int arr[] = new int[n];
        
        int res = solve(new int[]{1, 7, 4, 9, 2, 5});
        
        System.out.println(res);
    }
    
}
