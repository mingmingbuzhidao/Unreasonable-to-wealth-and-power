package two动态数组com.mj;


public class Main {

	public static void main(String[] args) {
		
		ArrayList<Object> list  = new ArrayList<Object>();
		list.add(10);
		list.add(new Person(10, "Jack"));
		list.add(null);
		list.add(22);
		list.add(new Person(11, "Jack"));
		list.add(new Person(12, "Jack"));
		list.add(new Person(13, "Jack"));
		list.add(new Person(14, "Jack"));
		list.add(new Person(15, "Jack"));
		list.add(new Person(16, "Jack"));
		list.add(new Person(17, "Jack"));
		System.out.println((Person)list.get(1));
		Asserts.test((((Person)list.get(1)).equals(new Person(10, "Jack"))));
		
//		list.indexOf(new Person(10, "Jack"));
		
		System.out.println(list);
//		ArrayList<Object> persons  = new ArrayList<>();
//		persons.add(new Person(10, "Jack"));
//		persons.add(null);
//		persons.add(new Person(15, "Rose"));
//		persons.add(null);
//		persons.add(new Person(12, "James"));
//		persons.add(null);
//
//		System.out.println(persons.indexOf(null));
		
		System.gc();
	}

	static void test() {
		// int -> Integer
	
		// 所有的类，最终都继承java.lang.Object

		// new是向堆空间申请内存
		ArrayList<Person> persons  = new ArrayList<Person>();
		persons.add(new Person(10, "Jack"));
		persons.add(new Person(12, "James"));
		persons.add(new Person(15, "Rose"));
		persons.clear();
		persons.add(new Person(22, "abc"));
		
		System.out.println(persons);
		ArrayList<Integer> ints  = new ArrayList<Integer>();
		ints.add(10);
		ints.add(10);
		ints.add(22);
		ints.add(33);
		System.out.println(ints);
	}
}
