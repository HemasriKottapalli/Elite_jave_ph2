package com.day11;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
class Graph{
	ArrayList<ArrayList<Integer>> adjList=new ArrayList<ArrayList<Integer>>();
	
	Graph(int v){
		for(int i=0;i<v;i++) {
			adjList.add(new ArrayList<Integer>());
		}
	}
	public void addEdge(int v,int e) {
		adjList.get(v).add(e);
		adjList.get(e).add(v);
	}
	public void printAdjList() {
		for(int i=0;i<adjList.size();i++) {
			System.out.println("adj list of vertex "+i);
			for(int j=0;j<adjList.get(i).size();j++) {
				System.out.print(adjList.get(i).get(j)+" ");
			}
			System.out.println();
		}
	}
	public void bfs(int v) {
		int V=adjList.size();
		boolean[] visited =new boolean[V];
		visited[v]=true;
		Queue<Integer> q=new LinkedList<Integer>();
		q.add(v);
		while(q.size()!=0) {
			int vertex=q.remove();
			System.out.print(vertex+" ");
			for(int i=0;i<adjList.get(i).size();i++) {
				int av=adjList.get(vertex).get(i);
				if(!visited[av]) {
					q.add(av);
					visited[av]=true;			
					}
			}
		}
	}
	public void dfs(int v) {
		int V=adjList.size();
		boolean[] visited =new boolean[V];
		dfs2(v,visited);
	}
	public void dfs2(int v,boolean[] visited) {
		visited[v]=true;
		System.out.print(v+" ");
		for(int i=0;i<adjList.get(v).size();i++) {
			int av=adjList.get(v).get(i);
			if(!visited[av]) {
				dfs2(av,visited); 
						
				}
		}
	}
	 
}
public class IntroToGraph{

	public static void main(String[] args) {
		//graph is a non linear data structure
		//graphs are used for maps,two friends are friends or not
		//nodes in the graph are called as vertices
		//graph representation ---- G[v,E] where G is graph, V is vertices , E is edge
		//depth first search----- height wise(digging)
		//breadth first search---- level wise
//		int[][] graph= {
//				{0,1,0,0,1},
//				{1,0,1,0,1},
//				{0,1,0,1,0},
//				{0,0,1,0,1},
		
		
		
		
		
		
		
		
		
//				{1,1,0,1,0}};
        Graph g=new Graph(5);
        g.addEdge(0,1);
        g.addEdge(2,3);
        g.addEdge(1,2);
        g.addEdge(3,4);
        g.addEdge(0,4);
        g.addEdge(1,4);
        //g.printAdjList();
        //bfs(4);
        //dfs(1);
        g.dfs(1);
	}

}*