/* 
 * File:   main.cpp
 * Author: Mohan
 *
 * Created on July 8, 2014, 2:10 PM
 */

#include <cstdlib>
#include <iostream>
#include <list>
#include <vector>
#include <queue>
#include <omp.h>
#include "_structures_.h"
#define pp  list<points>
#define it list<points>::iterator 


using namespace std;

/*
 * 
 */

/*struct point_3D{
    int x,y,z;
};

typedef point_3D pt;

class points{

public: int x,y,z; 
};*/

 

 /* struct points {

int x,y,z;
};

struct order_points{
    int x,y,z,dist;
};
*/
bool myfunction (int i,int j) { return (i<j); }
bool myfunction1(order_points p1,order_points p2){ return(p1.dist<p2.dist);}
 void solve(pp pi){

     int n = pi.size();//.size();
     
     points fp = pi.front();
     pi.pop_front();
     cout<<fp.x<<fp.y<<fp.z;
     list<order_points> ls;
    it ik;
     vector<int> vi;
     order_points op;
     for(ik=pi.begin();ik!=pi.end();ik++){
        
         int m = ik->x - fp.x + ik->y-fp.y + ik->z-fp.z;
         op.dist = m;op.x=ik->x;op.y=ik->y;op.z=ik->z;
         vi.push_back(m);
         ls.push_back(op);
         
     }
     
    // std::sort_heap()
     //sort_heap(vi.begin(),vi.end(),myfunction);
    // std::sort_heap(ls.begin(),ls.end(),myfunction);
     ls.sort(myfunction1);
     list<order_points>::iterator iz;
     for(iz=ls.begin();iz!=ls.end();iz++){cout<<endl<<iz->x<<iz->y<<iz->z<<"\t"<<iz->dist;}
}

int main(int argc, char** argv) {
    
#pragma omp parallel for num_threads(100)
     for(int i=0;i<100;i++){
         cout<<i;
     }  
    
  /*  pp p;
    //it = _ptList->begin();
    points pi;// = new points();
   // points s;
    string line; 
        pi.x = 1;
        pi.y = 2;
        pi.z = 3;
        p.push_back(pi);//push_back(pi);
        
         pi.x = 1;
        pi.y = 2;
        pi.z = 6;
        p.push_back(pi);
  
        pi.x = 1;
        pi.y = 2;
        pi.z = 4;
        p.push_back(pi);
  
        
        
    it i = p.begin();
while (i != p.end()) {
cout << "Name: " <<i->x << " Grade: " << i->y <<"y"<<i->z<< endl;
i++;
}
  
    
    solve(p);

    */
    
    

    return 0;
}

