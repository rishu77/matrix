package matrix;
import java.util.Scanner;
public class transpose {
public static void main(String[]args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter row column");
	
	int m=s.nextInt();
	int n=s.nextInt();
	int a[][]=new int[m][n];
	int i,j;
	System.out.println("enter an array");
	for(i=0;i<m;i++) {
		for(j=0;j<n;j++) {
			 a[i][j]=s.nextInt();
			
		}
	}System.out.println("original array");
	for(i=0;i<m;i++) {
		for(j=0;j<n;j++) {
			System.out.print(a[i][j]+" ");
		}System.out.println();
	}
	System.out.println("transpose");
	
		for(i=0;i<m;i++) {
			for(j=0;j<n;j++) {
			System.out.print(a[j][i]+" ");
		}System.out.println();
	}
}
}
