package fourteenTriecom.mj;

public class Main {

	static void test1() {
		Trie<Integer> trie = new Trie<>();
		trie.add("cat", 1);
		trie.add("dog", 2);
		trie.add("ca", 3);
		trie.add("catalog", 4);
		trie.add("cagt", 5);
		trie.add("小码哥", 6);
		Asserts.test(trie.size() == 6);
		Asserts.test(trie.startsWith("do"));
		Asserts.test(trie.startsWith("c"));
		Asserts.test(trie.startsWith("ca"));
		Asserts.test(trie.startsWith("cat"));
		Asserts.test(trie.startsWith("cata"));
		Asserts.test(!trie.startsWith("hehe"));
		Asserts.test(trie.get("小码哥") == 6);
		Asserts.test(trie.remove("cat") == 1);
		Asserts.test(trie.remove("catalog") == 4);
		Asserts.test(trie.remove("cagt") == 5);
		Asserts.test(trie.size() == 3);
		Asserts.test(trie.startsWith("小"));
		Asserts.test(trie.startsWith("do"));
	}

	public static void main(String[] args) {
		test1();
	}

}
