

package matrix;
import java.util.Scanner;
public class uppertriangular {
public static void main(String[]args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter row column");
	int m=s.nextInt();
	int n=s.nextInt();
	int a[][]=new int[m][n];
	int i,j,row,cols;
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
	row=a.length;
	cols=a[0].length;
	System.out.println("upper triangular matrix");
for(i=0;i<row;i++) {
	for(j=0;j<cols;j++) {
		if(i>j) {
			System.out.print(0+" ");
		}else 
			System.out.print(a[i][j]+" ");
	}System.out.println();
	
}
}
}
