/* 
 * File:   main.cpp
 * Author: Mohan
 *
 * Created on April 20, 2014, 4:53 PM
 */

#include <cstdlib>
#include <string>
#include <iostream>
#include <math.h>

#define MAX 11

using namespace std;

int min1(int a,int b,int c){
    int min;
    (a<b)?min=a : min =b;
    (min>c)?min=c : min;
    
    return min;

}

 void editDistance(string s1,string s2,int x,int y){
     
    int edt[x+1][y+1];//= new int [][MAX];

    for(int i=0;i<=x;i++)
    {  edt[i][0]=i;}
    
    for(int i=0;i<=y;i++)
    { edt[0][i]=i;}
    
    for(int i=1;i<=x;i++){
        for(int j=1;j<=y;j++){
    
            if(s1.at(i-1)==s2.at(j-1)){
            
                edt[i][j] = edt[i-1][j-1];
            }else {
            
                edt[i][j]= min(edt[i-1][j-1],edt[i][j-1])+1;
            }
        }
    }
    
    //for(int i=)
    cout<<edt[x][y];
        }

/*
 * 
 */
int main(int argc, char** argv) {
    
    string s1,s2;
    cout<<"Enter the first string";
    cin>>s1;
    cout<<"Enter the second string";
    cin>>s2;
    int x,y;
    x=s1.length();
    y=s2.length();
    editDistance(s1,s2,x,y);
    return 0;
}

