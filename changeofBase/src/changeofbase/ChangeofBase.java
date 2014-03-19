/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package changeofbase;

//import java.util.Scanner;
import java.util.*;


/**
 *
 * @author Mohan
 */
public class ChangeofBase {

    /**
     * @param args the command line arguments
     */
    public static Vector<Integer> changeBase(int n, int b){
        
        Vector<Integer> vc = new Vector<Integer>();
    
        while(n!=0){
        
            int rem = n%b;
            vc.add(rem);
           
            n /=b;
            
        
        }
    System.out.println(vc);
    
    return vc;
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number to convert");
        
        String sa = sc.nextLine();
        
        int num = Integer.parseInt(sa);
        
        System.out.println("Enter the change the base");
        
       int base = sc.nextInt();
        
       Vector<Integer> res =  changeBase(num,base);
       
       for(int i=res.size()-1;i>=0;i--){System.out.print(res.get(i));}
        
    }
}
