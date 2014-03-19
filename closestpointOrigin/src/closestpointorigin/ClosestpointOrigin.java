/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package closestpointorigin;

//import java.util.ArrayList;
import java.util.*;

/**
 *
 * @author Mohan
 */
class point{

int x,y;

point(int x,int y){

    this.x=x;
    this.y = y;

}

int getx(){return x;}
int gety(){return y;}


}

class po{

    int x,y;
    double res;

po(int x,int y, double res){

    this.x=x;
    this.y = y;
this.res = res;
}

int getx(){return x;}
int gety(){return y;}
double getres(){return res;}


}

public class ClosestpointOrigin {

    /**
     * @param args the command line arguments
     */
    public static Comparator<po> idComparator = new Comparator<po>(){
    
    public int compare(po p1,po p2){
    
   if( p1.getres()>p2.getres()){return 1;}
   else if(p1.getres()<p2.getres()){return -1; }
    
   return 0;
    }
    
    
    };
    public static void close2d(List<point> l){
    int xo = 0,yo=0;

double a1[] = new double[l.size()];

PriorityQueue<po> l1 = new PriorityQueue<>(3,idComparator);

List<po> lis = new ArrayList<>();



    for(int i=0; i<=l.size()-1;i++){
    
        double res = Math.abs(Math.sqrt(((l.get(i).getx()*l.get(i).getx())-xo)+((l.get(i).gety()*l.get(i).gety())-yo)));
        
        System.out.println(res);
        a1[i]=res;
        po p = new po(l.get(i).getx(),l.get(i).gety(),res);
        l1.add(p);
        lis.add(p);
    }
    
    Collections.sort(lis,idComparator );
    System.out.println("Printing the list");
    
    for(po i : lis){System.out.println(i.gety());}
    
        for(int i=0;i<2;i++){
        
            System.out.println("Dist : "+l1.peek().getres());// +"\t"+ "points :" + l.get(i).getx() + l.get(i).gety());
                l1.poll();
        
        }
    
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        int n=0;
        n =Integer.parseInt(sc.nextLine());
        System.out.println(n);
        
        List<point> l = new ArrayList<>();
        
        while(n-->0){
        
            String sa = sc.nextLine();
            String s1[] = sa.split("\\s");
            
            int x = Integer.parseInt(s1[0]);
            int y = Integer.parseInt(s1[1]);
            
            point p = new point(x,y);
            
            l.add(p);
        
        }
        close2d(l);
    }
}
