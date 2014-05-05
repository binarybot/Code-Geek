/* 
 * File:   main.cpp
 * Author: Mohan
 *
 * Created on April 11, 2014, 6:47 PM
 */

#include <cstdlib>
#include <iostream>
#include <list>


using namespace std;

class Graph{

    int V;
    list<int> *adj;
    bool dfsCycleUtil(int v,bool visited[],bool recStack[]);
    
public :
    
    bool dfsCycle(int v);
    void addEdge(int v,int w);
    Graph(int V);
};

Graph ::Graph(int V){

    this->V=V;
    adj = new list<int> [V];
}

void Graph ::addEdge(int v, int w){

    adj[v].push_back(w);
}

bool Graph ::dfsCycleUtil(int v, bool visited[], bool recStack[]){

    if(visited[v]==false){
    
        recStack[v]=visited[v]=true;
    
        list<int>::iterator i;
        
        for(i=adj[v].begin();i!=adj[v].end();++i){
        
            if(!visited[*i] && dfsCycleUtil(*i,visited,recStack))
                return true;
            else if(recStack[*i])
                return true;
                
        }
    }
    recStack[v]=false;
    return false;
}

bool Graph ::dfsCycle(int v){
    bool *visited = new bool[V];
    bool *recStack = new bool[V];
    
    for(int i=0;i<V;i++)
       recStack[i]= visited[i]=false;
    
   if(dfsCycleUtil(v,visited,recStack))
       return true;
   else
       return false;
}
/*
 * 
 */
int main(int argc, char** argv) {

 Graph g(4);
    g.addEdge(0, 1);
    g.addEdge(0, 2);
    g.addEdge(1, 2);
    g.addEdge(2, 0);
    g.addEdge(2, 3);
    g.addEdge(3, 3);
 
    if(g.dfsCycle(2))
        cout << "Graph contains cycle";
    else
        cout << "Graph doesn't contain cycle";    
    return 0;
}

