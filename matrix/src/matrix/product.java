package matrix;
import java.util.Scanner;
public class product {
public static void main(String[]args) {
Scanner s=new Scanner(System.in);
System.out.println("enter an row and column of first array");
int m=s.nextInt();
int n=s.nextInt();
System.out.println("enter row and column of 2 array");
int o=s.nextInt();
int p=s.nextInt();
int a[][]=new int[m][n];
int b[][]=new int[o][p];
int c[][]=new int[o][p];
int i,j;
System.out.println("enter 1 array");
for(i=0;i<m;i++) {
	for(j=0;j<n;j++) {
		a[i][j]=s.nextInt();
	}
	}System.out.println("enter 2 array");
for(i=0;i<o;i++) {
	for(j=0;j<p;j++) {
		b[i][j]=s.nextInt();
		
	}
}System.out.println("1 array");
for(i=0;i<m;i++) {
	for(j=0;j<n;j++) {
		System.out.print(a[i][j]+" ");
	}System.out.println();
}System.out.println("2 array");
for(i=0;i<o;i++) {
	for(j=0;j<p;j++) {
		System.out.print(a[i][j]+" ");
	}System.out.println();
}
for(i=0;i<m;i++) {
	for(j=0;j<p;j++) {
		for(int k=0;k<n;k++) {
			c[i][j]=a[i][j]*b[i][j];
		}
	}
}System.out.println("product of 2 array");
for(i=0;i<m;i++) {
	for(j=0;j<p;j++) {
		System.out.print(c[i][j] +" ");
	}System.out.println();
}
}

}
