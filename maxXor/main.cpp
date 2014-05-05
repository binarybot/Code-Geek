/* 
 * File:   main.cpp
 * Author: Mohan
 *
 * Created on April 21, 2014, 6:21 PM
 */

#include <cstdlib>
#include <iostream>
#define ALL_SET 


using namespace std;

int maxXor(int l,int _r){
    
    int res,num=_r;
    int bit=0;

   //res = ALL_SET ^ r;
    
    num = _r;
    while(num>>=1){
        bit++;
        }
    bit=bit+1;
     //cout<<"BIT"<<bit<<endl;
   int set=0;
   while(bit-->0){
   
       set|=1<<bit;
   }
   //cout<<"set"<<set<<endl;
   
   res=(set^_r);
   
  // cout<<"RES"<<res;
   
   
          res=(res ^_r); 
   
    //cout<<res<<endl;
   //cout<< __builtin_ctz(l) << " " << __builtin_clz(r)<<endl;    

    return res;

}

/*
 * 
 */
int main(int argc, char** argv) {

     int res,num;
    int _l;
    cin >> _l;
    
    int _r;
    cin >> _r;
    
    
   
    res = maxXor(_l, _r);
    cout << res;
    
    
    return 0;
}

