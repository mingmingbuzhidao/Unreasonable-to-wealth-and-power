package nine集合com.mj;

import nine集合com.mj.Times.Task;
import nine集合com.mj.file.FileInfo;
import nine集合com.mj.file.Files;
import nine集合com.mj.set.ListSet;
import nine集合com.mj.set.Set;
import nine集合com.mj.set.Set.Visitor;
import nine集合com.mj.set.TreeSet;

public class Main {
	
	static void test1() {

		Set<Integer> listSet = new ListSet<>();
		listSet.add(10);
		listSet.add(11);
		listSet.add(11);
		listSet.add(12);
		listSet.add(10);
		
		Set<Integer> treeSet = new TreeSet<>();
		treeSet.add(12);
		treeSet.add(10);
		treeSet.add(7);
		treeSet.add(11);
		treeSet.add(10);
		treeSet.add(11);
		treeSet.add(9);
		
		treeSet.traversal(new Visitor<Integer>() {
			@Override
			public boolean visit(Integer element) {
				System.out.println(element);
				return false;
			}
		});
	}
	
	
	static void testSetadd(Set<String> set, String[] words) {
		for (int i = 0; i < words.length; i++) {
			set.add(words[i]);
		}
	}
	
	static void testSetcontains(Set<String> set, String[] words) {
		for (int i = 0; i < words.length; i++) {
			set.contains(words[i]);
		}
	}
	
	static void testSetremove(Set<String> set, String[] words) {
		for (int i = 0; i < words.length; i++) {
			set.remove(words[i]);
		}
	}
	
	static void test2() {
		FileInfo fileInfo = Files.read("/opt/environment/java/jdk1.8.0_241/src/java/util", 
				new String[]{"java"});
//		/concurrent
		
		System.out.println("文件数量：" + fileInfo.getFiles());
		System.out.println("代码行数：" + fileInfo.getLines());
		String[] words = fileInfo.words();
		System.out.println("单词数量：" + words.length);
		
//		Times.test("ListSet", new Task() {
//			public void execute() {
//				testSet(new ListSet<>(), words);
//			}
//		});
		Set<String> listSet = new TreeSet<>();
		Times.test("listSet", new Task() {
			public void execute() {
				testSetadd(listSet, words);
			}
		});
		Times.test("listSet", new Task() {
			public void execute() {
				testSetcontains(listSet, words);
			}
		});
		Times.test("listSet", new Task() {
			public void execute() {
				testSetremove(listSet, words);
			}
		});
	}

	public static void main(String[] args) {
		test2();
	}

}
