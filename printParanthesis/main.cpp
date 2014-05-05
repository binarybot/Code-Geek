/* 
 * File:   main.cpp
 * Author: Mohan
 *
 * Created on May 5, 2014, 12:47 AM
 */

#include <cstdlib>
#include <iostream>
#define MAX_SIZE 100



using namespace std;

/*
 * 
 */
void printPara(int pos,int n,int open,int close){

    static char str[MAX_SIZE];
    
    if(close == n){
        cout<<str<<endl;
        return;
    }
    
    if(open<n){
        
        str[pos]='{';
        printPara(pos+1,n,open+1,close);
    
    }
    if(close<open){
        str[pos]='}';
        printPara(pos+1,n,open,close+1);
    }
}

void paraUtil(int n){

    printPara(0,n,0,0);

}

int main(int argc, char** argv) {

    int n =2;
    paraUtil(n);
    return 0;
}

