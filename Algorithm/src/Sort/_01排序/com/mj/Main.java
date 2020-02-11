package Sort._01排序.com.mj;

import java.util.Arrays;

import Sort._01排序.com.mj.sort.CountingSort;
import Sort._01排序.com.mj.sort.RadixSort;
import Sort._01排序.com.mj.sort.Sort;
import Sort._01排序.com.mj.sort.cmp.BubbleSort3;
import Sort._01排序.com.mj.sort.cmp.HeapSort;
import Sort._01排序.com.mj.sort.cmp.InsertionSort1;
import Sort._01排序.com.mj.sort.cmp.InsertionSort2;
import Sort._01排序.com.mj.sort.cmp.InsertionSort3;
import Sort._01排序.com.mj.sort.cmp.MergeSort;
import Sort._01排序.com.mj.sort.cmp.QuickSort;
import Sort._01排序.com.mj.sort.cmp.SelectionSort;
import Sort._01排序.com.mj.sort.cmp.ShellSort;
import Sort._01排序.com.mj.tools.Asserts;
import Sort._01排序.com.mj.tools.Integers;

@SuppressWarnings({"rawtypes", "unchecked", "unused"})
public class Main {

	public static void main(String[] args) {
		Integer[] array = Integers.random(10000, 1, 20000);
		
		testSorts(array, 
				new RadixSort(),
				new InsertionSort1(),
				new InsertionSort2(),
				new InsertionSort3(),
				new SelectionSort(),
				new HeapSort(),
				new MergeSort(),
				new BubbleSort3(),
				new QuickSort(),
				new ShellSort()
				);
	}
	
	static void testSorts(Integer[] array, Sort... sorts) {
		for (Sort sort : sorts) {
			Integer[] newArray = Integers.copy(array);
			sort.sort(newArray);
			Asserts.test(Integers.isAscOrder(newArray));
		}
		Arrays.sort(sorts);
		
		for (Sort sort : sorts) {
			System.out.println(sort);
		}
	}
}
