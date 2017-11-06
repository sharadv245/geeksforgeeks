package amazon;

import java.util.Scanner;

public class zerotoone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		char e[] = new char[t];
		for (int i = 0; i < t; i++) {
			int m = scn.nextInt();
			int k = scn.nextInt();
			int n = scn.nextInt();
			// String ans = transform()
			String s = dectobin(m);
			String a = transform(s, n);
			// System.out.println(a.charAt(k));
			e[i] = a.charAt(k);
		}
		// System.out.println(dectobin());
		for (int i = 0; i < e.length; i++) {
			System.out.println(e[i]);
		}
	}

	public static String dectobin(int N) {
		// int N;
		// Scanner SCN = new Scanner(System.in);
		// System.out.println("enter the number");
		// N = SCN.nextInt();
		int sum = 0;
		int count = 0;
		while (N != 0) {
			int r = N % 2;
			sum += r * Math.pow(10, count);
			count++;
			N = N / 2;

		}
		String s = Integer.toString(sum);
		return s;
		// System.out.println(sum);
	}

	public static String transform(String s, int n) {
		String retval = "";
		if (n == 0) {
			return s;
		}
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '0') {
				retval += "01";
			} else {
				retval += "10";
			}
		}
		return transform(retval, n - 1);
	}

}
