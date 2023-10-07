package Patterns;

public class P2 {

	public static void main(String[] args) {
		System.out.println();
		System.out.println();
		
		int r=5,c=5,n=5;
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(j==0||j==4||j==2||i==4) {
					System.out.print("**");
				}
				else
					System.out.print("  ");
			}System.out.println();
		}

	
			System.out.println();
			System.out.println();
			
			
			for(int i=0;i<r;i++) {
				for(int j=0;j<c;j++) {
					if(i==0||j==2) {
						System.out.print("**");
					}
					else
						System.out.print("  ");
				}System.out.println();
			}
			System.out.println();
			System.out.println();
			for(int i=0;i<r;i++) {
				for(int j=0;j<c;j++) {
					if(j==0||i==0||i==2) {
						System.out.print("**");
					}
					else
						System.out.print("  ");
				}System.out.println();
			}
			System.out.println();
			System.out.println();
			for(int i=0;i<r;i++) {
				for(int j=0;j<c;j++) {
					if(j==0||j==2||j==4||i==0) {
						System.out.print("**");
					}
					else
						System.out.print("  ");
				}System.out.println();
			}
			System.out.println();
			System.out.println();
			for(int i=0;i<r;i++) {
				for(int j=0;j<c;j++) {
					if(j==0||i==2||j==4||i==0) {
						System.out.print("**");
					}
					else
						System.out.print("  ");
				}System.out.println();
			}
			System.out.println();
			System.out.println();
			for(int i=0;i<r;i++) {
				for(int j=0;j<c;j++) {
					if(j==0||i==j||j==4) {
						System.out.print("**");
					}
					else
						System.out.print("  ");
				}System.out.println();
			}

	}

}
