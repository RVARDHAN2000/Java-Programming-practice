package Arrays;



public class max_value {

	public static void main(String[] args) {
		int a []= {1,2,3,4,7,6};
		int temp=0; 
		for(int i=0; i<a.length;i++)
			for(int j=i+1; j<a.length;j++)
			{
		{
			if(a[i]>a[j]) {
			temp= a[i];}
			}
			
		}
		System.out.println(temp);
	}

}
