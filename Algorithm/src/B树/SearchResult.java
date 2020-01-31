package B树;

public class SearchResult   
{  
    private boolean result;  
    private int index;  
      
    public SearchResult(boolean result, int index) {  
        super();  
        this.result = result;  
        this.index = index;  
    }  
  
    /** 
     * @return 给定键值在B树节点中的位置或者给定键值应该插入的位置 
     */  
    public int getIndex() {  
        return index;  
    }  
      
    /** 
     * @return 查找是否成功 
     */  
    public boolean getResult(){  
        return result;  
    }  
}  
