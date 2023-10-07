package Patterns;

public class A7 {

	public static void main(String[] args) {
		int r=4,c=4,n=4;
		int num=2;
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				
				if(j==0||j==c-1||i==0||i==r-1) {
					System.out.print(num+" ");
					num+=2;
				}
				else
					System.out.print("  ");
				
				
			}System.out.println();
		}
	}

}
