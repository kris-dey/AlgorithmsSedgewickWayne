package Chapter1;

public class XRank {
	
	public static void main(String[] args) {
		int[] a = {1,2,2,2,2,2,2,2,2,2,2,6,7,8,9};
		System.out.println(XRank(2,a,0,a.length-1));
		System.out.println(count(2,a));
	}
	
	public static int XRank(int key, int[] a, int lo, int hi){
		if(lo>hi) return -1;
		int mid = lo +(hi-lo)/2;
		if (key<a[mid]) return XRank(key,a,lo,mid-1);
		else if(key>a[mid]) return XRank(key,a,mid+1,hi);
		else if(key==a[mid]){
			//System.out.println(firstOcc(key,a,mid));
			return mid;
		}
		return -1;
	}
	
	public static int firstOcc(int key, int[] a, int mid){
		int loc = mid;
		while(loc != -1 && a[loc] == key ) loc--;
		return ++loc;
	}
	
	public static int count(int key, int[] a){
		int mid = XRank(key,a,0,a.length-1);
		int f1 = firstOcc(key,a,mid);
		int loc = f1;
		while(loc != a.length && a[loc] == key) loc++;
		return --loc;
	}
}
