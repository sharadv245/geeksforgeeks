package amazon;

import java.util.Scanner;

public class leftrotatematrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		

		for (int i = 0; i < t; i++) {
			int m =scn.nextInt();
			int n =scn.nextInt();
			int k =scn.nextInt();
			int a[][] = new int[m][n];
			//b[0][i]=scn.nextInt();
		
			
	
		//int a[][] = new int[m[i]][n[i]];
		
		for (int j = 0; j < m; j++) {
			for (int g = 0; g < n; g++) {
				a[j][g] = scn.nextInt();
			}
		}
	
		
		while(k > 0){
			int temp[]= new int[m];
			for(int s = 0;s<m;s++){
				temp[s]=a[s][0];
			}
		for (int j = 0; j < m; j++) {
			for (int g = 1; g < n; g++) {
				a[j][g-1]=a[j][g];
			}
		}
		for(int s = 0;s<m;s++){
			a[s][n-1]=temp[s];
		}
		
		k--;
		}
		for (int j = 0; j < m; j++) {
			for (int g = 0; g < n; g++) {
				System.out.print(a[j][g]+" ");
				System.out.println();
			}
		}
	}

	}

}
