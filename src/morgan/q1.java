package morgan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		for(int i = 0;i<t;i++){
			int count = 0;
			int n = scn.nextInt();
			Integer []a = new Integer[n];
			for(int j = 0;j< n;j++){
				a[j] = scn.nextInt();
			}int k = 0;
			int m = scn.nextInt();
			//ArrayList r = new ArrayList<>();
			
			HashMap<Integer, Integer> Map = frequency(a);
			Set<Map.Entry<Integer, Integer>> entries = Map.entrySet();
			int s = 0;
			for (Map.Entry<Integer, Integer> entry : entries) {
				//f[k] = entry.getValue();
				s++;
			}
			int f[] = new int[s];
			
			for (Map.Entry<Integer, Integer> entry : entries) {
				f[k] = entry.getValue(); 
				k++;
			}int sum = 0;int e = 0;
			quicksort(f, 0, f.length-1);
			for(k = 0;k <f.length;k++){
				sum = sum +f[k];
				if(sum == m){
					e = k+1;
					System.out.println(f.length-e);
					break;
				}
				else if(sum > m){
					e = k;
					System.out.println(f.length - e);
					break;
				}
			}
			
			
		}
		
	}
	
	public static HashMap<Integer,Integer> frequency(Integer a[]) {
		ArrayList<Integer> retval = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < a.length; i++) {
			if (map.containsKey(a[i])) {
				int ov = map.get(a[i]);
				map.put(a[i], ov + 1);
			} else {
				map.put(a[i], 1);
			}
		}
	/*	int hf = 150000;
		int hfc = 0;
		Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
		for (Map.Entry<Integer, Integer> entry : entries) {
			if (entry.getValue() < hf) {
				hf = entry.getValue();
				hfc = entry.getKey();
			}
		}
		for (Map.Entry<Integer, Integer> entry : entries) {
			if (entry.getValue() == hfc) {
				retval.add(entry.getKey());
			}
		}
		return retval;*/return map;
	}
	
	public static void quicksort(int[] c, int lo, int hi) {
		if (lo > hi) {
			return;
		}
		int pi = (lo + hi) / 2;
		int pivot = c[pi];
		int left = lo;
		int right = hi;
		while (left <= right) {
			while (c[left] < pivot) {
				left++;
			}
			while (c[right] > pivot) {
				right--;
			}
			if (left <= right) {
				int temp = c[left];
				c[left] = c[right];
				c[right] = temp;
				left++;
				right--;
			}
			quicksort(c, lo, right);
			quicksort(c, left, hi);

		}
	}
	

}
