/* 
 * File:   main.cpp
 * Author: Mohan
 *
 * Created on March 17, 2014, 8:17 PM
 */

#include <cstdlib>
#include <iostream>
using namespace std;

/*
 * 
 */
void swap(char *x,char *y){
 char temp = *x;
    
    *x = *y;
    *y = temp;

}
void permute(char *c,int i,int n){
    int j;
    if(i==n){
        cout<<c<<endl;
        //return;
    }else{
    for(j=i;j<=n;j++){
    
        swap((c+i),(c+j));
        permute(c,i+1,n);
        swap((c+i),(c+j));
    }
    }
}

int main(int argc, char** argv) {
 
    cout<<"hi this is c++ for NETBEAN\n";
    
    char c[] = "ABC";
    cout<<&c<<endl;
   // cin>>c;
    
    int n = 2;
    permute(c,0,n);
    
    
    return 0;
}

