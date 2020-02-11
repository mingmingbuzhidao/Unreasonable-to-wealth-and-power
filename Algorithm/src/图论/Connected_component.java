package 图论;

import java.util.ArrayList;

public class Connected_component {
	private Graph G;
	private int[] visited;
	private int Connected_component=0;
	
	public Connected_component(Graph G){

        this.G = G;
        visited = new int[G.V()];
       
        for(int i=0;i<visited.length;i++) {
        	visited[i]=-1;
        }
        for(int v = 0; v < G.V(); v ++) {
        	if(visited[v]==-1) {
        		dfs(v,Connected_component);
        		Connected_component++;
        	}
        }
    }
	
	private void dfs(int v,int Connected_component){

        visited[v] = Connected_component;
        for(int w: G.adj(v))
            if(visited[w]==-1)
                dfs(w,Connected_component);
    }
	
	 /**
     * 图的连通分量数
     * @return
     */
    public int Connected_comp() {
    	for(int i:visited) {
    		System.out.print(i+" ");
    	}
    	System.out.println();
    	return Connected_component;
    }
    
    /**
     * 两个顶点是否连通
     * @param v1
     * @param v2
     * @return
     */
    public boolean isConnected(int v1,int v2) {
    	G.validateVertex(v1);
    	G.validateVertex(v2);
    	return visited[v1]==visited[v2];
    }
    
    /**
     * 各个连通分量中有那些顶点
     * @return
     */
	@SuppressWarnings("unchecked")
	public ArrayList<Integer>[] components(){
    	ArrayList<Integer>[] Array=new ArrayList[Connected_component];
    	for(int i=0;i<Connected_component;i++) {
    		Array[i]=new ArrayList<Integer>();
    	}
    	for(int i=0;i<G.V();i++) {
    		Array[visited[i]].add(i);
    	}
    	return Array;
    }
    
    public static void main(String[] args){

        Graph g = new Graph("/home/wlm/gitRepository//Algorithm/src/图论/g.txt");
        Connected_component graphDFS = new Connected_component(g);
        System.out.println(graphDFS.Connected_comp());
        System.out.println(graphDFS.isConnected(3, 4));
        
        ArrayList<Integer>[] Array=graphDFS.components();
        for(int i=0;i<Array.length;i++) {
        	ArrayList<Integer> Arr=Array[i];
        	for(int j=0;j<Arr.size();j++) {
        		System.out.print(Arr.get(j)+" ");
        	}
        	System.out.println();
        }
        
    }
}
