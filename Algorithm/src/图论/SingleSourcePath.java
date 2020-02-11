package 图论;

import java.util.ArrayList;
import java.util.Collections;

public class SingleSourcePath {
	    private Graph G;
	    private boolean[] visited;
	    private int s;
	    private int[] pre;


	    public SingleSourcePath(Graph G,int s){
            G.validateVertex(s);
	        this.G = G;
	        this.s=s;
	        visited = new boolean[G.V()];
	        pre=new int[G.V()];
	        for(int i=0;i<visited.length;i++) {
	        	pre[i]=-1;
	        }
	        dfs(s,s);
	    
	    }

	    private void dfs(int v,int parent){
	        visited[v] = true;
	        pre[v]=parent;
	        for(int w: G.adj(v))
	            if(!visited[w])
	                dfs(w,v);
	    }
	    
	    public boolean isConnectedTo(int t) {
	    	G.validateVertex(t);
	    	return visited[t];
	    }
	    
	    public Iterable<Integer> path(int t){
	    	ArrayList<Integer> res=new ArrayList<>();
	    	if(!isConnectedTo(t)) return res;
	    	int cur=t;
	    	while(cur!=s) {
	    		res.add(cur);
	    		cur=pre[cur];
	    	}
	    	res.add(s);
	    	Collections.sort(res);
	    	return res;
	    }

	    public static void main(String[] args){

	        Graph g = new Graph("/home/wlm/gitRepository//Algorithm/src/图论/g.txt");
	        SingleSourcePath graphDFS = new SingleSourcePath(g,3);
	        System.out.println(graphDFS.path(6));
	        
	    }
}
