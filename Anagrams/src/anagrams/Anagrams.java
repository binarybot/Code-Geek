/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anagrams;

/**
 *
 * @author Mohan
 */
public class Anagrams {
    public static void swap(char a[], int i, int j){
    
    char temp =a[i];
    
    a[i]=a[j];
    a[j]=temp;
        
    }
 public static void Anagram1(char[] a, int i, int n){
 
     int j;
     if(i==n)
     {
         System.out.println(a);
     }  
     
     for( j=i;j<=n;j++){
     
        swap(a,i,i+j);
        Anagram1(a,i,j);
        swap(a,i,i+j);
     
     
     }
 }
       public static void main(String[] args) {
        // TODO code application logic here
    
           String s = "ABC124";
           char []x = s.toCharArray();
           Anagram1(x,0,x.length-1);
       }
}
