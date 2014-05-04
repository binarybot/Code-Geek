/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksort;

import java.util.Scanner;

/**
 *
 * @author Mohan
 */
public class Quicksort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int arr[] = new int [n];
        
        if(n==0){System.out.println("No Elements to sort"); System.exit(1);}
        
         for(int i=0;i<arr.length;i++){
        
               arr[i]=sc.nextInt();
        }
        
        quickst(arr,0,n-1);
        
        System.out.println("The sorted elements are ");
        
        for(int i=0;i<arr.length;i++){
        
            System.out.println(arr[i]);
        
        }
        
    }

    private static void quickst(int[] arr, int low, int high) {
        //To change body of generated methods, choose Tools | Templates.
        
        if(low<high){
        
        int j= partition(arr,low,high);
        quickst(arr,low,j-1);
        quickst(arr,j+1,high);
        
        }
        
    }

    private static int partition(int[] arr, int low, int high) {
        int i = low+1,j=high,key;
        key = arr[low];
        while(true){
        
            while((i<high)&&(arr[i])<=key){i++;}
            while((arr[j]>key)&&(j>=low)){j--;}
           int temp; 
            if(i<j){
                
                
     temp = arr[i];
     arr[i]= arr[j];
     arr[j]=temp;
     
     
    }else{
               
     temp = arr[low];
     arr[low]= arr[j];
     arr[j]=temp;
    
    return j;
            
            }
        
        
        }
    }

    
}
