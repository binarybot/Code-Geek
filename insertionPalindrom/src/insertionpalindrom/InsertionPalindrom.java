/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package insertionpalindrom;

import java.util.*;

/**
 *
 * @author Mohan
 */
public class InsertionPalindrom {
    
    public static int lcs(char x[],char y[],int m,int n){
    
        Vector<Character> vc = new Vector<>();
        int lc[][] =new int[m+1][n+1];
        
        for(int i=0;i<=n;i++){
        
            for(int j=0;j<=m;j++){
            
                if(i==0||j==0){
                lc[i][j]=0;
                }else if(x[i-1]==y[j-1]){
                
                    lc[i][j]=lc[i-1][j-1]+1;
                }else{
                
                lc[i][j] = Math.max(lc[i-1][j],lc[i][j-1]);
                }
            }
           
        }
//        System.out.println(vc);
        System.out.println("LCS ="+lc[m][n]);
    return lc[m][n];
    }

    public static int solveUtil(char x[],char y[],int m,int n){
    
        int res_inter = lcs(x,y,m,n);
    
        return (n-res_inter);
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to find min insert");
        
        String s = sc.nextLine();
        char x[] = s.toCharArray();
        char y[] = new char[x.length];
        //int j=0;
        for(int j=0,i=x.length-1;i>=0;j++,i--)
        { y[j]=x[i];}
        
        
        for(int i=0;i<s.length();i++){System.out.println(x[i] +"\t" +y[i]);}
        int m = x.length,n=y.length;
        int res = solveUtil(x,y,m,n);
        
        System.out.println(res);
        
        
    }
    
}
