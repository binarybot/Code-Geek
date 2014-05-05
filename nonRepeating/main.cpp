/* 
 * File:   main.cpp
 * Author: Mohan
 *
 * Created on April 20, 2014, 10:16 PM
 */

#include <cstdlib>
#include <string>
#include <iostream>
#define NO_OF_CHARS 256
using namespace std;

 int lrs(string s){

     int *visited = new int [NO_OF_CHARS];
     int max_len=1,curlen=1,previndex;
     
     /*Initializing the current visited array as -1 : Size is maintained is constant*/
     for(int i=0;i<NO_OF_CHARS;i++)
     {visited[i] = -1;}
     
     visited[s.at(0)]=0;
     /*traversing the string and updating the visited array and the length*/
     for(int i=1;i<s.length();i++){
     
         /*previndex stores the values of the visited array which contains the position of character that was processed*/
         
         previndex = visited[s.at(i)];
         
         /* i-curlen : checks whether the current character is already been processed*/
         
         if(previndex==-1 || i-curlen > previndex ){
             
             curlen++;
             
         }else{
         
             if(max_len < curlen){
                 
                 max_len = curlen;
             }
             
             curlen = i-previndex;
         }
         
         visited[s.at(i)]=i;
     
     }
     
     cout<<curlen<<endl;
     
     if(curlen > max_len)
     { max_len = curlen;}
     
     
     return max_len;
}

/*
 * 
 */
int main(int argc, char** argv) {
    
    cout<<"Enter the string ";
    string s="geeksforgeeks";
    
   // cin>>s;
    int res = lrs(s);
    
    cout<<"The length of the largest non-repeating substring is "<<endl;
    cout<<res;
    
    
   
    return 0;
}

