/* 
 * File:   main.cpp
 * Author: Mohan
 *
 * Created on March 22, 2014, 1:21 AM
 */

#include <cstdlib>
#include <iostream>

using namespace std;

int solve(int x,int y){

    int result = x + y;
    
    if(x>0 && y> 0 && result <0){
    
        return -1;
    }else if(x<0 && y<0 && result>0){
    
        return -1;
    }
}
/*
 * 
 */
int main(int argc, char** argv) {
    
    int x,y;
    cout<<"Enter the first Integer";
    cin>>x;
    cout<<"Enter the second Integer";
    cin>>y;
    
    int res  = solve(x,y);
    if(res==-1){cout<<"overflow"<<endl<<res;}

    return 0;
}

