package matrix;
import java.util.Scanner;
public class identity {
public static void main(String[]args) {
	Scanner s=new Scanner (System.in);
	System.out.println("enter row column");
	int m=s.nextInt();
	int n=s.nextInt();
	int a[][]=new int[m][n];
	int i,j,row,col;
	boolean flag=true;
	System.out.println("enter an array");
	for(i=0;i<m;i++) {
		for(j=0;j<n;j++) {
			a[i][j]=s.nextInt();
		}
	}for(i=0;i<m;i++) {
		for(j=0;j<n;j++) {
		System.out.print(a[i][j] +" ");
		}System.out.println();
	}
	row=a.length;
	col=a[0].length;
	if(row!=col) {
		System.out.println("its not a square matrix");
	}
	else {
	for(i=0;i<row;i++) {
		for(j=0;j<col;j++) {
			if(i==j&&a[i][j]!=1)
			{
				flag=false;
			break;}
			if(i!=j&&a[i][j]!=0) {
				flag=false;
				break;
			}
		}
	}
		if(flag)
System.out.println("identity matrix");	
		else 
			System.out.println("not identity matrix");
		}
}
}
