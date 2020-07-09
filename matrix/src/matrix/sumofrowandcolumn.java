package matrix;
import java.util.Scanner;

public class sumofrowandcolumn {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter row column");
		int m=s.nextInt();
		int n=s.nextInt();
		int a[][]=new int[m][n];
		int i,j,row,cols;
		int sumrow;
		int sumcol;
		System.out.println("enter an array");
		for(i=0;i<m;i++) {
			for(j=0;j<n;j++) {
		a[i][j]=s.nextInt();
			}
		}System.out.println("original array");
		s.close();
		for(i=0;i<m;i++) {
			for(j=0;j<n;j++) {
		System.out.print(a[i][j]+" ");
			}System.out.println();
		}
row=a.length;
cols=a[0].length;
for(i=0;i<row;i++) {
	sumrow=0;
	for(j=0;j<cols;j++) {
		 sumrow=sumrow+a[i][j];
	}System.out.println("sum of "+(i+1)+" row   "+sumrow);
}
for(i=0;i<cols;i++) {
	sumcol=0;
	for(j=0;j<row;j++) {
		sumcol=sumcol+a[j][i];
	}System.out.println("sum of "+(i+1)+" column  "+sumcol);
}
	}
}
