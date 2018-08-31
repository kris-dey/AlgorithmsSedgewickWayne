package Chapter1.Section3;

import java.util.Arrays;

import edu.princeton.cs.algs4.StdRandom;

public class RandomMatches {

	public static void main(String[] args) {
		final int N = 10;
		int[] n1 = new int[N];
		int[] n2 = new int[N];
		for (int i = 0; i < N; i++) {
			n1[i] = (int) StdRandom.uniform(10);
			n2[i] = (int) StdRandom.uniform(10);
		}
		Arrays.sort(n1);
		Arrays.sort(n2);
		
		int cnt=0;
		for (int key = 0; key < 10; key++)
			if (binarySearch(key, n1) != -1 && binarySearch(key, n2) != -1) 
				cnt++;
		System.out.println(cnt);
	}

	public static int binarySearch(int key, int[] a) {
		return binarySearch(key, a, 0, a.length - 1);
	}

	public static int binarySearch(int key, int[] a, int lo, int hi) {
		if (lo > hi)
			return -1;
		int mid = (lo + hi) / 2;
		if (key > a[mid])
			return binarySearch(key, a, mid + 1, hi);
		else if (key < a[mid])
			return binarySearch(key, a, lo, mid - 1);
		else if (key == a[mid])
			return mid;
		return -1;
	}
	
	public static int firstOcc(int key, int[] a, int mid){
		int loc = mid;
		while(loc != -1 && a[loc] == key ) loc--;
		return ++loc;
	}
	
	public static int count(int key, int[] a){
		int mid = binarySearch(key,a,0,a.length-1);
		int f1 = firstOcc(key,a,mid);
		int loc = f1;
		while(loc != a.length && a[loc] == key) loc++;
		return --loc;
	}
}
