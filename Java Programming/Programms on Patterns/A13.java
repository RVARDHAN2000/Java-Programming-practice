package Patterns;

public class A13 {

	
	public static void main(String[] args) {
		char ch ='A';
		int r=4,c=4,n=4;
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(i+j<=n-1) {
					System.out.print(ch+++" ");
				}
				else
					System.out.print("  ");
			}System.out.println();
		
	}

	}

}




//A1B@
//C3D