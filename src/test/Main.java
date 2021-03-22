package test;

import sem.Util;

public class Main {

	public static void main(String[] args) {

		System.out.println(Util.sem(null));
		System.out.println("");

		System.out.println(Util.sem(new int[] { 1, 3, 6, 8, 9, 8, 9, 8 }));
		System.out.println("");

		System.out.println(Util.sem(new int[] { 4, 5, 2, 25 }));

		System.out.println("");
		System.out.println(Util.sem(new int[] { 13, 7, 6, 12 }));

		System.out.println("");
		System.out.println(Util.sem(new int[] { 0, 99, 777, -1 }));

		System.out.println("");
		System.out.println(Util.sem(new int[] { 1, 1222, 4, 5, 6, 7, 8, 0, 2, 1, 9, 1222 }));
		
		System.out.println("");
		System.out.println(Util.sem(new int[] {}));
	}
}