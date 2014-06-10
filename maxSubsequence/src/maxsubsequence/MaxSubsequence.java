/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package maxsubsequence;

/**
 *
 * @author Mohan
 */
public class MaxSubsequence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       solve(new int []{1,2,3,4,-3,4,-10});
        
    }

    private static void solve(int[] m) {
        int a[] = new int[m.length+1];
        a[0]=m[0];
        for(int i=1;i<m.length;i++){
        a[i]= Math.max(a[i-1]+m[i], m[i]);
        }
int max=0;
        for(int i=0;i<a.length;i++){
if(max<a[i]){max=a[i];}        }
              System.out.println(max);
  
    }
    
    
}
