package matrix;
import java.util.Scanner;
public class frequencyoddeven {
public static void main(String []args){
	Scanner s=new Scanner(System.in);
	System.out.println("enter row column");
	int m=s.nextInt();
	int n=s.nextInt();
	int a[][]=new int[m][n];
	int i,j,counte=0,counto=0;
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
	for(i=0;i<m;i++) {
		for(j=0;j<n;j++) {
			if(a[i][j]%2==0) 
				counte++;
			else
				counto++;
				
			
		}
	}
	System.out.print("frequencyof even elements "+counte);
	System.out.println();
	System.out.print("frequency of odd elements "+counto);
}
}
