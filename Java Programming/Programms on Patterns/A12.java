package Patterns;

public class A12 {

	public static void main(String[] args) {
		int a =1;
		int r=5,c=5,n=5;
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(i+j<=n-1) {
					System.out.print(a+++" ");
				}
				else
					System.out.print(" ");
			}System.out.println();
		
	}
	}

}
