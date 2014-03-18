/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addhashkdiff;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Mohan
 */
public class AddHashkdiff {

 static int pairs(int[] a,int k) {
      /* Complete this function */
        
     Map<Integer,Integer> m = new HashMap<>();
     int count=0;
     
        for(int i=0;i<a.length;i++){
        
            m.put(a[i], a[i]);
        }
        
        for(Integer key : m.keySet()){
        
        
            if(m.containsKey(k+key)){
                System.out.println("Key :" + m.get(key) +"k1" +m.get(k+key));
            count++;
            }else{
            
            continue;
            }
        }
   Map<Integer,Integer>map = new HashMap<>();
   int freq = 0;int key;
        for(int i=0;i<a.length;i++){
        key = a[i];
            map.put(key,(map.containsKey(key)?map.get(key)+1:1));
        }
     //for(Integer i : map.keySet()){
         System.out.println(map.values());//}
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        
        String n = in.nextLine();
        String[] n_split = n.split(" ");
        
        int _a_size = Integer.parseInt(n_split[0]);
        int _k = Integer.parseInt(n_split[1]);
        
        int[] _a = new int[_a_size];
        int _a_item;
        String next = in.nextLine();
        String[] next_split = next.split(" ");
        
        for(int _a_i = 0; _a_i < _a_size; _a_i++) {
            _a_item = Integer.parseInt(next_split[_a_i]);
            _a[_a_i] = _a_item;
        }
        
        res = pairs(_a,_k);
        System.out.println(res);
    }
}
