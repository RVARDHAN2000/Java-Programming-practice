package Arrays;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = s.nextInt();
		int []a=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0; i<a.length; i++) {
			a[i]=s.nextInt();		}
		int l=0;
		int h=size-1;
		System.out.println("Enter the element to be searched ");
		int ele=s.nextInt();
		boolean flag=false;
		while(h>=l) {
			int m=(l+h)/2;
			if(a[m]==ele) {
				System.out.println("Element is found in the array ");
				flag=true;
				break;
			}
			else if(a[m]<ele) {
				l=m+1;
				
			}
			else if(ele<a[m]) {
				h=m-1;
			}
		}
		if(flag==false) {
			System.out.println("Element is not found");
		}
	}

}
