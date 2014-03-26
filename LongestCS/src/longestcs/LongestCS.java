/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package longestcs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Mohan
 */
public class LongestCS {
    
    
 public static int max(int a,int b){
    
        return (a>b)?a:b;
    }
    //  Compute Longest Common Subsequence using Dynamic Programming Technique....
 private static void lcsDP(char[] x, char[] y, int m, int n) {
    
        int lcs[][] = new int [m+1][n+1];
        
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
            
                if(i==0 || j==0){
                
                    lcs[i][j] = 0;
                }else if(x[i-1]==y[j-1]){
                
                    lcs[i][j] = lcs[i-1][j-1] + 1;
                
                }else {
                
                    lcs[i][j]= max(lcs[i][j-1],lcs[i-1][j]);
                
                }
                
            }
        }// End of for loop....
        
        //Method to print the LCS characters...
        printLCS(lcs,x,y,m,n);
        
    } // End of lcsDP....
            
 
 //This Method traverses the lcs[][] table and prints the required LCS characters...
private static void printLCS(int[][] lcs, char[] x, char[] y, int i, int j) {
        
        
        if(i >0 && j >0 && x[i-1]==y[j-1] ){
            
          printLCS(lcs,x,y,i-1,j-1);
          
         //Prints only if X == Y...
         System.out.print(x[i-1]);
        
        }else if(j>0 && (i==0 || lcs[i][j-1]>=lcs[i-1][j])){
           
           printLCS(lcs,x,y,i,j-1);
           
            
        }else if(i>0 && (j==0 || lcs[i][j-1] <  lcs[i-1][j])){
       
            printLCS(lcs,x,y,i-1,j);
             
            
        } else{ }
        
 }       
 public static void main(String[] args) {
     
     BufferedReader in = null;
     try {
        
         File file = new File(args[0]);
         in = new BufferedReader(new FileReader(file));
         String line;
         try { 
             while((line = in.readLine()) != null){
                 String lineArray[] = line.split(";");
                 if(lineArray.length>0){
                     char first_word[] = lineArray[0].toCharArray();
                     char second_word[] = lineArray[1].toCharArray();
                     
                     int m = first_word.length;
                     int n = second_word.length;
                     
                     lcsDP(first_word,second_word,m,n);
                 }else{
                     // continue; (Since empty lines may be present in the File.... )
                 }
                 
             } // End of While
         } catch (IOException ex) {
             System.out.println("File Read Error" + ex.getMessage());
             //Logger.getLogger(LongestCS.class.getName()).log(Level.SEVERE, null, ex);
         }
     } catch (FileNotFoundException ex) {
         
         System.out.println("File not Found Error" +ex.getMessage());
         //Logger.getLogger(LongestCS.class.getName()).log(Level.SEVERE, null, ex);
     } finally {
         try {
             in.close();
         } catch (IOException ex) {
             
             System.out.println("File Close Error" +ex.getMessage());
             //Logger.getLogger(LongestCS.class.getName()).log(Level.SEVERE, null, ex);
         }
     }
     
 }
   
    
}
