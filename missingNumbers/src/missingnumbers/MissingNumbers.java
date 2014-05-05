/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package missingnumbers;

import java.util.*;

/**
 *
 * @author Mohan
 */
public class MissingNumbers {

    /**
     * @param args the command line arguments
     */
   // @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        Map<Integer,Integer> a = new HashMap<>();
        Map<Integer,Integer> b = new HashMap<>();
        
        Scanner sc = new Scanner(System.in);
        int m= Integer.parseInt(sc.nextLine());
        int n = Integer.parseInt(sc.nextLine());
        
         String s = sc.nextLine();
        String s1[] = s.split("\\s");
        
        String s5 = sc.nextLine();
        String s3[] = s5.split("\\s");
        
        for(int i=0;i<s1.length;i++){
        
            int key = Integer.parseInt(s1[i]);
            
            a.put(key, a.containsKey(key)?a.get(key)+1 : 1);
        }
        
           for(int i=0;i<s3.length;i++){
        
            int key1 = Integer.parseInt(s3[i]);
            
            b.put(key1, b.containsKey(key1)?b.get(key1)+1 : 1);
        }
           
        List<Integer>l1 = new ArrayList<>();
        
        for(Integer i :  b.keySet()){
            
            if(b.get(i)>a.get(i)){ 
                l1.add(i.intValue());
            //System.out.print(i.intValue() +" ");
            }
    
    
            
            
    }
        Collections.sort(l1);
            for(int i=0;i<l1.size();i++)
            System.out.print(l1.get(i) + " ");
        
        
    }
    
}
