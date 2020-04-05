package com.barman.ArraysTest;
import java.util.Arrays;
public class ArraysLeftRotation {

	 static int[] rotLeft(int[] a, int d) {
		
			// Left rotation using lambda expression.
/*			int[] posAr = IntStream.range(0, a.length)
					.map(i->(a[(i + (a.length + d)) % a.length]))
					.toArray();

		 return posAr; */
		 
		 //leftRotatio using LinkedList
/*		 
		 Integer[] arr = {1,2,3,4,5};

	        LinkedList<Integer> ns = new LinkedList<Integer>(Arrays.asList(arr));
	        int rotate=3;
	        if(rotate<0)
	            rotate += arr.length;

	        List<Integer> leftlist = ns.subList(0, rotate);
	        List<Integer> rightlist = ns.subList(rotate, arr.length);

	        LinkedList<Integer> result = new LinkedList<Integer>();
	        result.addAll(rightlist);
	        result.addAll(leftlist);

	        System.out.println(result); */
		 //System.out.println("----------------------------");
		 
		// System.out.println(4%5);
		// System.out.println("----------------------------");
		 
		 //Simple rotate
		 //int[] a = {1, 2, 3, 4, 5};
		 int[] result = new int[a.length];
		 for (int i = 0; i < a.length; i++) {
		     result[(i + (a.length - d)) % a.length] = a[i];
		 }
		
		 return result;
	    }
	public static void main(String[] args) {

		int [] arr ={1, 2, 3, 4, 5};
		//int []  arr = {1,6,7,5,9,1,34,7};
		int[] result=rotLeft(arr, 2);
		Arrays.stream(result).forEach(System.out::println);
	}

}
