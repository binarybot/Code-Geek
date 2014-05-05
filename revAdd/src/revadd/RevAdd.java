/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package revadd;

import java.io.*;
import java.util.*;

/**
 *
 * @author Mohan
 */
public class RevAdd {

  
    static int last_num=0;
    static int count =0,count1=0;

    public static void revAdd(int num){
    
        int reverse = 0,digit = num;
        count++;
        while(num!=0){
        
            reverse *=10;
            reverse = reverse + num % 10;
            num/=10;
        
        }
        //System.out.println(reverse);
        
        int num1 = digit + reverse;
        
        //System.out.println(num1);
        
       
        
        
        //int num1 = num + reverse;
        
        
        if(ispalindrome(num1)){
            last_num = num1;
            count = Math.abs(count - count1);
            System.out.println(last_num+ " " + count);
            count1 = count;
            //System.out.print(last_num);
        //return count;
    }
        
   // return count;
    }
    
    public static boolean ispalindrome(int num){
    
        int reverse =0, digit = num;
        
         while(num!=0){
        
            reverse *= 10;
            reverse = reverse + num % 10;
            num/=10;
        
        }
         
         if(reverse == digit){
             return true;
             //System.out.println(num);
         }else{
             revAdd(digit);
         }
        return false;
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of test cases");
        int t = Integer.parseInt(sc.nextLine());
       int num;
       while(t-->0){
       System.out.println("Enter the Number");
       num = Integer.parseInt(sc.nextLine());
       /* File file = new File(args[0]);
        BufferedReader in = new BufferedReader(new FileReader(file));
        String line;
        
        while((line = in.readLine())!= null){
       */
        revAdd(num);
       //System.out.println(last_num+ " " + res);
        }
    }
    
}
