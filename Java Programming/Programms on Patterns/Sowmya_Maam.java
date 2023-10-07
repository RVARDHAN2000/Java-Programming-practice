package Patterns;

public class Sowmya_Maam {

	public static void main(String[] args) throws InterruptedException {
		System.out.println();
		
		
		int r=5,c=5,n=5;
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(i==0||i==4||i==2) {
					System.out.print("**");
				}
				else if (i==1&&j==0) {
					System.out.print("**");
				}
				else if (i==3&&j==4) {
					System.out.print("**");
				}
				else
					System.out.print("  ");
			}System.out.println();
		}
		System.out.println();
		
		Thread.sleep(1000);

		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(j==0||j==4||i==0||i==4) {
					System.out.print("**");
				}
				else
					System.out.print("  ");
			}System.out.println();
		}
		System.out.println();
		Thread.sleep(1000);
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(j==0||j==4||i==4) {
					System.out.print("**");
				}
				else
					System.out.print("  ");
			}System.out.println();
		}
		System.out.println();
		Thread.sleep(1000);
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(j==0||j==4||j==2||i==0) {
					System.out.print("**");
				}
				else
					System.out.print("  ");
			}System.out.println();
		}
		System.out.println();
		Thread.sleep(1000);
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(i==0&&j==0||i==0&&j==4||i==1&&j==1||i==2&&j==2||i==1&&j==3||i==3&&j==2||i==4&&j==2) {
					System.out.print("**");
				}
				else
					System.out.print("  ");
			}System.out.println();
		}
		Thread.sleep(1000);
		System.out.println();
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(i==0||j==4||j==0||i==2) {
					System.out.print("**");
				}
				else
					System.out.print("  ");
			}System.out.println();
		}
	}
	

}
