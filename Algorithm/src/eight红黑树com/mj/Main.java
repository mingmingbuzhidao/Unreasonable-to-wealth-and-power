package eight红黑树com.mj;

import java.util.ArrayList;
import java.util.List;

import eight红黑树com.mj.file.Files;
import eight红黑树com.mj.printer.BinaryTreeInfo;
import eight红黑树com.mj.printer.BinaryTrees;
import eight红黑树com.mj.tree.AVLTree;
import eight红黑树com.mj.tree.BST;
import eight红黑树com.mj.tree.BinaryTree;
import eight红黑树com.mj.tree.RBTree;
import eight红黑树com.mj.tree.BinaryTree.Visitor;

@SuppressWarnings("unused")
public class Main {
	static List<Integer> data ;
	static {
		data = new ArrayList<>();
		data.add(11);
		data.add(1);
		data.add(30);
		data.add(2);
		data.add(12);
		data.add(14);
		data.add(4);
		data.add(29);
		data.add(5);
		data.add(13);
		data.add(6);
		data.add(7);
		data.add(20);
		data.add(18);
//		data.add(27);
//		data.add(21);
//		data.add(24);
//		data.add(41);
//		data.add(25);
//		data.add(26);
//		data.add(28);
//		data.add(19);
//		data.add(8);
//		data.add(15);
//		data.add(22);
//		data.add(23);
//		data.add(16);
//		data.add(9);
//		data.add(10);
//		data.add(3);
//		data.add(17);
	}

	static void test1() {
		BST<Integer> bst = new BST<>();
		for (int i = 0; i < data.size(); i++) {
			bst.add(data.get(i));
			System.out.println("【" + data.get(i) + "】");
			BinaryTrees.println(bst);
			System.out.println("---------------------------------------");
		}
		System.out.println("Remove");
		for (int i = 0; i < data.size(); i++) {
			bst.remove(data.get(i));
			System.out.println("【" + data.get(i) + "】");
			BinaryTrees.println(bst);
			System.out.println("---------------------------------------");
		}

	}
	
	static void test2() {

		AVLTree<Integer> avl = new AVLTree<>();
		for (int i = 0; i < data.size(); i++) {
			avl.add(data.get(i));
			System.out.println("【" + data.get(i) + "】");
			BinaryTrees.println(avl);
			System.out.println("---------------------------------------");
		}
		System.out.println("Remove");
		for (int i = 0; i < data.size(); i++) {
			System.out.println("【" + data.get(i) + "】");
			avl.remove(data.get(i));
			BinaryTrees.println(avl);
			System.out.println("---------------------------------------");
		}
	}

	static void test3() {
		Integer data[] = new Integer[] { 55, 87, 56, 74, 96, 22, 62, 20, 70, 68, 90, 50 };

		RBTree<Integer> rb = new RBTree<>();
		for (int i = 0; i < data.length; i++) {
			rb.add(data[i]);
			System.out.println("【" + data[i] + "】");
			BinaryTrees.println(rb);
			System.out.println("---------------------------------------");
		}
	}

	static void test4() {
		Integer data[] = new Integer[] { 55, 87, 56, 74, 96, 22, 62, 20, 70, 68, 90, 50 };

		RBTree<Integer> rb = new RBTree<>();
		for (int i = 0; i < data.length; i++) {
			rb.add(data[i]);
		}

		BinaryTrees.println(rb);

		for (int i = 0; i < data.length; i++) {
			rb.remove(data[i]);
			System.out.println("---------------------------------------");
			System.out.println("【" + data[i] + "】");
			BinaryTrees.println(rb);
		}
	}

	public static void main(String[] args) {
		test2();
	}
}
