package Patterns;

public class A5 {

	public static void main(String[] args) {
		int r=4,c=4,n=4;
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(j==0||j==i||i==r-1) {
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}System.out.println();
		}


	}

}
