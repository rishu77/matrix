package matrix;
import java.util.Scanner;

public class sparse {
public static void main(String []args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter row column");
	int m=s.nextInt();
	int n=s.nextInt();
	int a[][]=new int[m][n];
	int count=0,size,i,j,row,col;
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
	col=a[0].length;
	size=row*col;
	for(i=0;i<row;i++) {
		for(j=0;j<col;j++) {
			if(a[i][j]==0)
				count++;
		}
	}
	if(count>(size/2))
		System.out.println("sparse matrix");
	
	else 
		System.out.println("not sparse matrix");
}
}
