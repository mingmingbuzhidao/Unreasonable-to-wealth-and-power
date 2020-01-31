package leetcode_com.mj.链表;


public class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { 
		val = x; 
	}
	@Override
	public String toString() {
		StringBuilder string = new StringBuilder();
		string.append("[");
		ListNode node = this;
		for (int i = 0;node!=null ; i++) {
			if (i != 0) {
				string.append(", ");
			}
			
			string.append(node.val);
			
			node = node.next;
		}
		string.append("]");
		
		return string.toString();
	}
}
