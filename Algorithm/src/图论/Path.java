package 图论;

import java.util.ArrayList;
import java.util.Collections;

public class Path {
	 private Graph G;
	    private boolean[] visited;
	    private int s;
	    private int t;
	    private int[] pre;


	    public Path(Graph G,int s,int t){
         G.validateVertex(s);
	        this.G = G;
	        this.s=s;
	        this.t=t;
	        visited = new boolean[G.V()];
	        pre=new int[G.V()];
	        for(int i=0;i<visited.length;i++) {
	        	pre[i]=-1;
	        }
	        dfs(s,s,t);
	    
	    }

	    private boolean dfs(int v,int parent,int t){
	        visited[v] = true;
	        pre[v]=parent;
	        if(v==t) return true;
	        for(int w: G.adj(v))
	            if(!visited[w])
	                if(dfs(w,v,t)) return true;
	        return false;
	    }
	    
	    public boolean isConnectedTo() {
	    	
	    	return visited[t];
	    }
	    
	    public Iterable<Integer> path(){
	    	ArrayList<Integer> res=new ArrayList<>();
	    	if(!isConnectedTo()) return res;
	    	int cur=t;
	    	while(cur!=s) {
	    		res.add(cur);
	    		cur=pre[cur];
	    	}
	    	res.add(s);
	    	Collections.reverse(res);
	    	return res;
	    }

	    public static void main(String[] args){

	        Graph g = new Graph("/home/wlm/gitRepository//Algorithm/src/图论/g.txt");
	        Path graphDFS = new Path(g,2,5);
	        System.out.println(graphDFS.path());
	        
	    }
}
